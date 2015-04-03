package com.bigguyct.remoteredstone.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.bigguyct.remoteredstone.Reference;

public class InitItemsMethods {
	public static void initializeItem(Item item,String name)
	{
		item.setUnlocalizedName(name);
	}

	public static void registerItem(Item item, String itemName) 
	{
		GameRegistry.registerItem(item, itemName);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
