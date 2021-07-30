package dev.cammiescorner.arcanus.core.registry;

import dev.cammiescorner.arcanus.Arcanus;
import dev.cammiescorner.arcanus.common.spells.*;
import dev.cammiescorner.arcanus.core.util.Spell;
import java.util.LinkedHashMap;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;

import static dev.cammiescorner.arcanus.Arcanus.config;
import static dev.cammiescorner.arcanus.core.util.Pattern.LEFT;
import static dev.cammiescorner.arcanus.core.util.Pattern.RIGHT;

public class ModSpells
{
	//-----Spell Map-----//
	public static final LinkedHashMap<Spell, ResourceLocation> SPELLS = new LinkedHashMap<>();

	//-----Spells-----//
	public static final Spell LUNGE = create("lunge", new LungeSpell(RIGHT, RIGHT, RIGHT, config.lungeCastingCost));
	public static final Spell FISSURE = create("fissure", new FissureSpell(LEFT, RIGHT, LEFT, config.fissureCastingCost));
	public static final Spell MAGIC_MISSILE = create("magic_missile", new MagicMissileSpell(LEFT, LEFT, LEFT, config.magicMissileCastingCost));
	public static final Spell VANISH = create("vanish", new VanishSpell(RIGHT, LEFT, RIGHT, config.vanishCastingCost));
	public static final Spell HEAL = create("heal", new HealSpell(RIGHT, LEFT, LEFT, config.healCastingCost));
	public static final Spell METEOR = create("meteor", new MeteorSpell(LEFT, RIGHT, RIGHT, config.meteorCastingCost));
	public static final Spell ICE_SPIRE = create("ice_spire", new IceSpireSpell(LEFT, LEFT, RIGHT, config.iceSpireCastingCost));
	public static final Spell MINE = create("mine", new MineSpell(RIGHT, RIGHT, LEFT, config.mineCastingCost));

	//-----Registry-----//
	public static void register()
	{
		SPELLS.keySet().forEach(item -> Registry.register(Arcanus.SPELL, SPELLS.get(item), item));
	}

	private static <T extends Spell> T create(String name, T spell)
	{
		SPELLS.put(spell, new ResourceLocation(Arcanus.MOD_ID, name));
		return spell;
	}
}
