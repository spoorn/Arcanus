package dev.cammiescorner.arcanus.common.packets;

import dev.cammiescorner.arcanus.Arcanus;
import dev.cammiescorner.arcanus.core.registry.ModDamageSource;
import dev.cammiescorner.arcanus.core.util.MagicUser;
import dev.cammiescorner.arcanus.core.util.Spell;
import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.impl.networking.ClientSidePacketRegistryImpl;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import static dev.cammiescorner.arcanus.Arcanus.config;

public class CastSpellMessage {
	public static final Identifier ID = new Identifier(Arcanus.MOD_ID, "cast_spell");

	public static void send(int spellId) {
		PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
		buf.writeVarInt(spellId);

		ClientSidePacketRegistryImpl.INSTANCE.sendToServer(ID, buf);
	}

	public static void handle(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler network, PacketByteBuf buf, PacketSender sender) {
		int spellId = buf.readVarInt();

		server.execute(() -> {
			MagicUser user = (MagicUser) player;
			Spell spell = Arcanus.SPELL.get(spellId);

			if(user.getKnownSpells().contains(spell)) {
				if((config.haveBurnout && user.getMana() > 0) || (!config.haveBurnout && user.getMana() >= spell.getManaCost())) {
					player.sendMessage(new TranslatableText(spell.getTranslationKey()).formatted(Formatting.GREEN), true);
					spell.onCast(player.world, player);

					if(!player.isCreative()) {
						user.setLastCastTime(player.world.getTime());

						if(user.getMana() < spell.getManaCost() && config.haveBurnout) {
							int burnoutAmount = spell.getManaCost() - user.getMana();
							user.addBurnout(burnoutAmount);
							player.damage(ModDamageSource.MAGIC_BURNOUT, burnoutAmount);
							player.sendMessage(new TranslatableText("error." + Arcanus.MOD_ID + ".burnout").formatted(Formatting.RED), false);
						}

						user.addMana(-spell.getManaCost());
					}
				}
				else {
					player.sendMessage(new TranslatableText("error." + Arcanus.MOD_ID + ".not_enough_mana").formatted(Formatting.RED), false);
				}
			}
			else {
				player.sendMessage(new TranslatableText("error." + Arcanus.MOD_ID + ".unknown_spell").formatted(Formatting.RED), true);
			}
		});
	}
}
