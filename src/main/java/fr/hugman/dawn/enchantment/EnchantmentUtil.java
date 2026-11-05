package fr.hugman.dawn.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;

public final class EnchantmentUtil {
	public static boolean hasEnchantment(Enchantment enchantment, ItemStack stack) {
		return EnchantmentHelper.getEnchantments(stack).getEnchantments().stream()
				.anyMatch(entry -> entry.value() == enchantment && EnchantmentHelper.getLevel(entry, stack) > 0);
	}

	public static boolean hasEnchantment(RegistryEntry<Enchantment> enchantment, ItemStack stack) {
		return EnchantmentHelper.getLevel(enchantment, stack) > 0;
	}
}
