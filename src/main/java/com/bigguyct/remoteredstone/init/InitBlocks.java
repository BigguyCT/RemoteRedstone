package com.bigguyct.remoteredstone.init;

public class InitBlocks {
	public static void registerAllBlocks()
	{
		InitBlocksMethods.registerBlock(null, null);
		InitBlocksMethods.registerBlock(null, null);
		InitBlocksMethods.registerBlock(null, null);  //Add as needed
	}
	public static void registerAllBlockRenders()
	{
		InitBlocksMethods.registerRender(null);
		InitBlocksMethods.registerRender(null);
		InitBlocksMethods.registerRender(null);  //Add as needed
	}
	public static void initializeAllBlocks()
	{
		InitBlocksMethods.initializeBlock(null, null);
		InitBlocksMethods.initializeBlock(null, null);
		InitBlocksMethods.initializeBlock(null, null);  //Add as needed
	}

}
