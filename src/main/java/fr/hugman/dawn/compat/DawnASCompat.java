package fr.hugman.dawn.compat;

import fr.hugman.dawn.item.DynamicFood;
import net.minecraft.component.type.FoodComponent;
import squeek.appleskin.api.AppleSkinApi;
import squeek.appleskin.api.event.FoodValuesEvent;

public class DawnASCompat implements AppleSkinApi {
	@Override
	public void registerEvents() {
		FoodValuesEvent.EVENT.register(event -> {
			if(event.itemStack.getItem() instanceof DynamicFood dynamic) {
				FoodComponent original = event.defaultFoodComponent;
				FoodComponent values = new FoodComponent(
						dynamic.getHunger(event.itemStack),
						dynamic.getSaturationModifier(event.itemStack),
						original.canAlwaysEat(),
						original.eatSeconds(),
						original.usingConvertsTo(),
						original.effects());
				event.defaultFoodComponent = values;
				event.modifiedFoodComponent = values;
			}
		});
	}
}
