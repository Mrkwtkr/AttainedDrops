package com.vapourdrive.attaineddrops.items;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class AD_Items
{
	public static Item plantSeed;

	public static void init()
	{
		plantSeed = new ItemPlantSeed();
		
		GameRegistry.registerItem(plantSeed, ItemInfo.PlantSeedName);
		
	}


	public static void registerRecipes()
	{
		GameRegistry.addShapelessRecipe(new ItemStack (plantSeed), new Object[]{Items.apple, new ItemStack(Items.dye, 1, 15), Items.wheat_seeds});
		
	}

}
