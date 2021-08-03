package dev.cammiescorner.arcanus.core.util;

import dev.cammiescorner.arcanus.Arcanus;
import dev.cammiescorner.arcanus.core.registry.ModSpells;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

import java.util.Random;

public class SpellBooks {
	private static final Random RAND = new Random();

	public static ItemStack getLungeBook(ItemStack stack) {
		int randInt = RAND.nextInt(16);
		String number = randInt < 10 ? "0" + randInt : String.valueOf(randInt);
		Spell spell = ModSpells.LUNGE;
		NbtCompound tag = stack.getOrCreateNbt();
		NbtList listTag = tag.getList("pages", NbtElement.STRING_TYPE);

		tag.putString("title", "book." + Arcanus.SPELL.getId(spell).toString().replace(':', '.') + ".title");
		tag.putString("author", "book." + Arcanus.MOD_ID + "." + number + ".author");
		tag.putString("spell", Arcanus.SPELL.getId(spell).toString());
		listTag.add(textToNbt(new TranslatableText("book." + Arcanus.SPELL.getId(spell).getNamespace() + "." + Arcanus.SPELL.getId(spell).getPath() + ".description")));
		listTag.add(stringToNbt(spellToPattern(spell)));
		tag.put("pages", listTag);

		return stack;
	}

	public static ItemStack getFissureBook(ItemStack stack) {
		int randInt = RAND.nextInt(16);
		String number = randInt < 10 ? "0" + randInt : String.valueOf(randInt);
		Spell spell = ModSpells.FISSURE;
		NbtCompound tag = stack.getOrCreateNbt();
		NbtList listTag = tag.getList("pages", NbtElement.STRING_TYPE);

		tag.putString("title", "book." + Arcanus.SPELL.getId(spell).toString().replace(':', '.') + ".title");
		tag.putString("author", "book." + Arcanus.MOD_ID + "." + number + ".author");
		tag.putString("spell", Arcanus.SPELL.getId(spell).toString());
		listTag.add(textToNbt(new TranslatableText("book." + Arcanus.SPELL.getId(spell).getNamespace() + "." + Arcanus.SPELL.getId(spell).getPath() + ".description")));
		listTag.add(stringToNbt(spellToPattern(spell)));
		tag.put("pages", listTag);

		return stack;
	}

	public static ItemStack getMagicMissileBook(ItemStack stack) {
		int randInt = RAND.nextInt(16);
		String number = randInt < 10 ? "0" + randInt : String.valueOf(randInt);
		Spell spell = ModSpells.MAGIC_MISSILE;
		NbtCompound tag = stack.getOrCreateNbt();
		NbtList listTag = tag.getList("pages", NbtElement.STRING_TYPE);

		tag.putString("title", "book." + Arcanus.SPELL.getId(spell).toString().replace(':', '.') + ".title");
		tag.putString("author", "book." + Arcanus.MOD_ID + "." + number + ".author");
		tag.putString("spell", Arcanus.SPELL.getId(spell).toString());
		listTag.add(textToNbt(new TranslatableText("book." + Arcanus.SPELL.getId(spell).getNamespace() + "." + Arcanus.SPELL.getId(spell).getPath() + ".description")));
		listTag.add(stringToNbt(spellToPattern(spell)));
		tag.put("pages", listTag);

		return stack;
	}

	public static ItemStack getTelekinesisBook(ItemStack stack) {
		int randInt = RAND.nextInt(16);
		String number = randInt < 10 ? "0" + randInt : String.valueOf(randInt);
		Spell spell = ModSpells.TELEKINESIS;
		NbtCompound tag = stack.getOrCreateNbt();
		NbtList listTag = tag.getList("pages", NbtElement.STRING_TYPE);

		tag.putString("title", "book." + Arcanus.SPELL.getId(spell).toString().replace(':', '.') + ".title");
		tag.putString("author", "book." + Arcanus.MOD_ID + "." + number + ".author");
		tag.putString("spell", Arcanus.SPELL.getId(spell).toString());
		listTag.add(textToNbt(new TranslatableText("book." + Arcanus.SPELL.getId(spell).getNamespace() + "." + Arcanus.SPELL.getId(spell).getPath() + ".description")));
		listTag.add(stringToNbt(spellToPattern(spell)));
		tag.put("pages", listTag);

		return stack;
	}

	public static ItemStack getHealBook(ItemStack stack) {
		int randInt = RAND.nextInt(16);
		String number = randInt < 10 ? "0" + randInt : String.valueOf(randInt);
		Spell spell = ModSpells.HEAL;
		NbtCompound tag = stack.getOrCreateNbt();
		NbtList listTag = tag.getList("pages", NbtElement.STRING_TYPE);

		tag.putString("title", "book." + Arcanus.SPELL.getId(spell).toString().replace(':', '.') + ".title");
		tag.putString("author", "book." + Arcanus.MOD_ID + "." + number + ".author");
		tag.putString("spell", Arcanus.SPELL.getId(spell).toString());
		listTag.add(textToNbt(new TranslatableText("book." + Arcanus.SPELL.getId(spell).getNamespace() + "." + Arcanus.SPELL.getId(spell).getPath() + ".description")));
		listTag.add(stringToNbt(spellToPattern(spell)));
		tag.put("pages", listTag);

		return stack;
	}

	public static ItemStack getMeteorBook(ItemStack stack) {
		int randInt = RAND.nextInt(16);
		String number = randInt < 10 ? "0" + randInt : String.valueOf(randInt);
		Spell spell = ModSpells.METEOR;
		NbtCompound tag = stack.getOrCreateNbt();
		NbtList listTag = tag.getList("pages", NbtElement.STRING_TYPE);

		tag.putString("title", "book." + Arcanus.SPELL.getId(spell).toString().replace(':', '.') + ".title");
		tag.putString("author", "book." + Arcanus.MOD_ID + "." + number + ".author");
		tag.putString("spell", Arcanus.SPELL.getId(spell).toString());
		listTag.add(textToNbt(new TranslatableText("book." + Arcanus.SPELL.getId(spell).getNamespace() + "." + Arcanus.SPELL.getId(spell).getPath() + ".description")));
		listTag.add(stringToNbt(spellToPattern(spell)));
		tag.put("pages", listTag);

		return stack;
	}

	public static ItemStack getSolarStrikeBook(ItemStack stack) {
		int randInt = RAND.nextInt(16);
		String number = randInt < 10 ? "0" + randInt : String.valueOf(randInt);
		Spell spell = ModSpells.SOLAR_STRIKE;
		NbtCompound tag = stack.getOrCreateNbt();
		NbtList listTag = tag.getList("pages", NbtElement.STRING_TYPE);

		tag.putString("title", "book." + Arcanus.SPELL.getId(spell).toString().replace(':', '.') + ".title");
		tag.putString("author", "book." + Arcanus.MOD_ID + "." + number + ".author");
		tag.putString("spell", Arcanus.SPELL.getId(spell).toString());
		listTag.add(textToNbt(new TranslatableText("book." + Arcanus.SPELL.getId(spell).getNamespace() + "." + Arcanus.SPELL.getId(spell).getPath() + ".description")));
		listTag.add(stringToNbt(spellToPattern(spell)));
		tag.put("pages", listTag);

		return stack;
	}

	public static ItemStack getMineBook(ItemStack stack) {
		int randInt = RAND.nextInt(16);
		String number = randInt < 10 ? "0" + randInt : String.valueOf(randInt);
		Spell spell = ModSpells.MINE;
		NbtCompound tag = stack.getOrCreateNbt();
		NbtList listTag = tag.getList("pages", NbtElement.STRING_TYPE);

		tag.putString("title", "book." + Arcanus.SPELL.getId(spell).toString().replace(':', '.') + ".title");
		tag.putString("author", "book." + Arcanus.MOD_ID + "." + number + ".author");
		tag.putString("spell", Arcanus.SPELL.getId(spell).toString());
		listTag.add(textToNbt(new TranslatableText("book." + Arcanus.SPELL.getId(spell).getNamespace() + "." + Arcanus.SPELL.getId(spell).getPath() + ".description")));
		listTag.add(stringToNbt(spellToPattern(spell)));
		tag.put("pages", listTag);

		return stack;
	}

	public static ItemStack getBookFromSpell(Spell spell) {
		ItemStack stack = new ItemStack(Items.WRITTEN_BOOK);

		return switch(Arcanus.SPELL.getRawId(spell)) {
			case 0 -> SpellBooks.getLungeBook(stack);
			case 1 -> SpellBooks.getFissureBook(stack);
			case 2 -> SpellBooks.getMagicMissileBook(stack);
			case 3 -> SpellBooks.getTelekinesisBook(stack);
			case 4 -> SpellBooks.getHealBook(stack);
			case 5 -> SpellBooks.getMeteorBook(stack);
			case 6 -> SpellBooks.getSolarStrikeBook(stack);
			case 7 -> SpellBooks.getMineBook(stack);
			default -> throw new IndexOutOfBoundsException("SOMETING WENT VEWY VEWY WWONG! THIWS SHOUWD NEVEW HAPPEN!");
		};
	}

	private static NbtString stringToNbt(String string) {
		return NbtString.of(Text.Serializer.toJson(new LiteralText(string)));
	}

	private static NbtString textToNbt(Text text) {
		return NbtString.of(Text.Serializer.toJson(text));
	}

	private static String spellToPattern(Spell spell) {
		return spell.getSpellPattern().get(0).getSymbol() + "-" + spell.getSpellPattern().get(1).getSymbol() + "-" + spell.getSpellPattern().get(2).getSymbol();
	}
}
