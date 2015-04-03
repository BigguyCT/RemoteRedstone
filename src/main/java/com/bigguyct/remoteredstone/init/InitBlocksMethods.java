package com.bigguyct.remoteredstone.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.bigguyct.remoteredstone.Reference;

public class InitBlocksMethods {
	public static void initializeBlock(Block block, String name)
	{
		block.setUnlocalizedName(name);
	}
	
	public static void registerBlock(Block block, String blockName)
	{
		
		GameRegistry.registerBlock(block, blockName);
	}
	
	public static void registerRender(Block block)
	{
	Item item = Item.getItemFromBlock(block) ;
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
