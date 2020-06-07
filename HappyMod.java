package happyandjust.happymod.main;

import happyandjust.happymod.commands.Command;
import happyandjust.happymod.proxy.CommonProxy;
import happyandjust.happymod.util.Reference;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class HappyMod {

	@Instance
	public static HappyMod instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public static void preInit(FMLPostInitializationEvent e) {
		
	}

	@EventHandler
	public static void init(FMLInitializationEvent e) {
		ClientCommandHandler.instance.registerCommand(new Command());
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent e) {
		
	}
	
}
