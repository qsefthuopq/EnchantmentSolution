package org.ctp.enchantmentsolution.enchantments.vanilla;

import java.util.Arrays;
import java.util.List;

import org.bukkit.enchantments.Enchantment;
import org.ctp.enchantmentsolution.api.Language;
import org.ctp.enchantmentsolution.enchantments.CustomEnchantment;
import org.ctp.enchantmentsolution.enchantments.DefaultEnchantments;
import org.ctp.enchantmentsolution.enchantments.helper.Weight;
import org.ctp.enchantmentsolution.utils.items.nms.ItemType;

public class Sharpness extends CustomEnchantment{
	
	public Sharpness() {
		super("Sharpness", -12, -10, 13, 11, 1, 1, 6, 5, Weight.COMMON, "Increases melee damage.\n" + 
				"Adds 1 (half heart) extra damage for the first level, and 0.5 (half heart) for each additional level.");
		addDefaultDisplayName(Language.GERMAN, "Sch�rfe");
		addDefaultDescription(Language.GERMAN, "Erh�ht Nahkampfschaden." + 
				"\nF�gt 1 (halbes Herz) zus�tzlichen Schaden f�r die erste Stufe und 0,5 (halbes Herz) f�r jede zus�tzliche Stufe hinzu.");
	}
	
	@Override
	public Enchantment getRelativeEnchantment() {
		return Enchantment.DAMAGE_ALL;
	}

	@Override
	public String getName() {
		return "sharpness";
	}
	
	@Override
	protected List<ItemType> getEnchantmentItemTypes() {
		return Arrays.asList(ItemType.SWORDS);
	}

	@Override
	protected List<ItemType> getAnvilItemTypes() {
		return Arrays.asList(ItemType.SWORDS, ItemType.AXES);
	}

	@Override
	protected List<Enchantment> getDefaultConflictingEnchantments() {
		return Arrays.asList(Enchantment.DAMAGE_ARTHROPODS, Enchantment.DAMAGE_UNDEAD, DefaultEnchantments.QUICK_STRIKE);
	}
}
