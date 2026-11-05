package fr.hugman.dawn.item;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.ItemStack;

public final class FoodUtil {
	public static int getHunger(ItemStack stack) {
		if(stack.getItem() instanceof DynamicFood dynamicFood) {
			return dynamicFood.getHunger(stack);
		}
		else {
			FoodComponent foodComponent = stack.get(DataComponentTypes.FOOD);
			if(foodComponent != null) return foodComponent.nutrition();
		}
		return 0;
	}

	public static float getSaturationPoints(ItemStack stack) {
		if(stack.getItem() instanceof DynamicFood dynamicFood) {
			return dynamicFood.getSaturationModifier(stack);
		}
		else {
			FoodComponent foodComponent = stack.get(DataComponentTypes.FOOD);
			if(foodComponent != null) return foodComponent.saturation();
		}
		return 0;
	}
}
