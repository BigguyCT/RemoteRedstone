package com.bigguyct.remoteredstone.proxy;

import com.bigguyct.remoteredstone.init.InitBlocks;
import com.bigguyct.remoteredstone.init.InitBlocksMethods;
import com.bigguyct.remoteredstone.init.InitItems;
import com.bigguyct.remoteredstone.init.InitItemsMethods;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerRenders() {
		InitItems.registerAllItemRenders();
		InitBlocks.registerAllBlockRenders();
	}
}
