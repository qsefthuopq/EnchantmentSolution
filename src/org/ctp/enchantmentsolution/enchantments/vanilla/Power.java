package org.ctp.enchantmentsolution.enchantments.vanilla;

import java.util.Arrays;
import java.util.List;

import org.bukkit.enchantments.Enchantment;
import org.ctp.enchantmentsolution.api.Language;
import org.ctp.enchantmentsolution.enchantments.CustomEnchantment;
import org.ctp.enchantmentsolution.enchantments.helper.Weight;
import org.ctp.enchantmentsolution.utils.items.nms.ItemType;

public class Power extends CustomEnchantment{
	
	public Power() {
		super("Power", -10, -9, 11, 10, 1, 1, 6, 5, Weight.COMMON, "Increases arrow damage by 25% � (level + 1), rounded up to nearest half-heart.");
		addDefaultDisplayName(Language.GERMAN, "St�rke");
		addDefaultDescription(Language.GERMAN, "Erh�ht den Pfeilschaden um 25% � (Stufe + 1), aufgerundet auf das n�chste Herz.");
	}
	
	@Override
	public Enchantment getRelativeEnchantment() {
		return Enchantment.ARROW_DAMAGE;
	}

	@Override
	public String getName() {
		return "power";
	}
	
	@Override
	protected List<ItemType> getEnchantmentItemTypes() {
		return Arrays.asList(ItemType.BOW);
	}

	@Override
	protected List<ItemType> getAnvilItemTypes() {
		return Arrays.asList(ItemType.BOW);
	}

	@Override
	protected List<Enchantment> getDefaultConflictingEnchantments() {
		return Arrays.asList();
	}
}
