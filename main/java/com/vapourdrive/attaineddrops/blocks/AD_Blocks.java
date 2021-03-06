package com.vapourdrive.attaineddrops.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class AD_Blocks
{
	public static Block BlockMobDirt;
	public static Block BlockMobPlant;
	public static Block BlockMobBulb;
	public static Block BlockConcentrateDrop;

	public static void init()
	{
		BlockMobDirt = new BlockMobDirt();
		BlockMobPlant = new BlockMobPlant();
		BlockMobBulb = new BlockMobBulb();
		BlockConcentrateDrop = new BlocklConcentrateDrop();
		
		GameRegistry.registerBlock(BlockMobDirt, BlockInfo.BlockMobDirtName);
		GameRegistry.registerBlock(BlockMobPlant, BlockInfo.BlockMobPlantName);
		GameRegistry.registerBlock(BlockMobBulb, BlockInfo.BlockMobBulbName);
		GameRegistry.registerBlock(BlockConcentrateDrop, BlockInfo.BlockConcentrateDropName);
	}

	public static void registerRecipes()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(BlockConcentrateDrop, 1, 0), new Object[]{Items.wheat_seeds, new ItemStack(Items.dye, 0, 15), new ItemStack(Items.water_bucket, 2), Blocks.dirt});
		
	}

}
