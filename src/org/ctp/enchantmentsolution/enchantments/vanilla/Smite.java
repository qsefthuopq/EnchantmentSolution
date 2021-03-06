package org.ctp.enchantmentsolution.enchantments.vanilla;

import java.util.Arrays;
import java.util.List;

import org.bukkit.enchantments.Enchantment;
import org.ctp.enchantmentsolution.api.Language;
import org.ctp.enchantmentsolution.enchantments.CustomEnchantment;
import org.ctp.enchantmentsolution.enchantments.DefaultEnchantments;
import org.ctp.enchantmentsolution.enchantments.helper.Weight;
import org.ctp.enchantmentsolution.utils.items.nms.ItemType;

public class Smite extends CustomEnchantment{
	
	public Smite() {
		super("Smite", -4, -3, 9, 8, 1, 1, 6, 5, Weight.UNCOMMON, "Increases damage to \"undead\" mobs " + 
				"(skeletons, zombies, withers, wither skeletons, zombie pigmen, skeleton horses and zombie horses)\n" + 
				"Each level separately adds 2.5 (half heart) extra damage to each hit, to \"undead\" mobs only.");
		addDefaultDisplayName(Language.GERMAN, "Bann");
		addDefaultDescription(Language.GERMAN, "Erh�ht den Schaden \"untoter\" Mobs " + 
				"(Skelette, Zombies, Widerrist, Widerrist-Skelette, Zombie-Schweiner, Skelettpferde und Zombie-Pferde).\n" + 
				"Jeder Level f�gt jedem Treffer separat 2,5 (halbes Herz) zus�tzlichen Schaden hinzu, nur \"Untoten\" -Mobs.");
	}
	
	@Override
	public Enchantment getRelativeEnchantment() {
		return Enchantment.DAMAGE_UNDEAD;
	}
	
	@Override
	public String getName() {
		return "smite";
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
		return Arrays.asList(Enchantment.DAMAGE_ARTHROPODS, Enchantment.DAMAGE_ALL, DefaultEnchantments.QUICK_STRIKE);
	}
}
