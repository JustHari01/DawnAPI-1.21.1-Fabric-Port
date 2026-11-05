package fr.hugman.dawn.debug;

import com.google.gson.annotations.Expose;
import net.minecraft.item.Item;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.registry.Registries;

public class ItemData {
	@Expose
	protected Identifier name;
	@Expose
	protected Properties properties;

	public ItemData(Identifier id, Item item) {
		this.name = id;
		this.properties = new Properties(item);
	}

	public static class Properties {
		@Expose
		protected Rarity rarity;
		@Expose
		protected int maxCount;
		@Expose
		protected int maxDamage;
		@Expose
		protected boolean fireproof;
		@Expose
		protected Identifier recipeRemainder;

		public Properties(Item item) {
			this.rarity = item.getDefaultStack().getRarity();
			this.maxCount = item.getMaxCount();
			this.maxDamage = item.getDefaultStack().getMaxDamage();
			this.fireproof = item.getComponents().contains(DataComponentTypes.FIRE_RESISTANT);
			this.recipeRemainder = item.getRecipeRemainder() != null ? Registries.ITEM.getId(item.getRecipeRemainder()) : null;
		}
	}

}
