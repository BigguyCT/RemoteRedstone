package com.bigguyct.remoteredstone.init;

import com.bigguyct.remoteredstone.items.TestItem;

public class InitItems {
	public static void registerAllItems()
	{
		InitItemsMethods.registerItem(TestItem.TestItem, "Test Item");
		InitItemsMethods.registerItem(null, null);
		InitItemsMethods.registerItem(null, null);  //Add as needed
	}
	public static void registerAllItemRenders()
	{
		InitItemsMethods.registerRender(TestItem.TestItem);
		InitItemsMethods.registerRender(null);
		InitItemsMethods.registerRender(null);  //Add as needed
	}
	public static void initializeAllItems()
	{
		InitItemsMethods.initializeItem(TestItem.TestItem, "Test Item");
		InitItemsMethods.initializeItem(null, null);
		InitItemsMethods.initializeItem(null, null);  //Add as needed
	}
}
