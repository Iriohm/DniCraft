package dnicraft.tutorial;

import dnicraft.tutorial.item.ModItems;
import dnicraft.tutorial.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DniCraft.modId, name = DniCraft.name, version = DniCraft.version, acceptedMinecraftVersions = "[1.10.2]")
public class DniCraft {

	@SidedProxy(serverSide = "dnicraft.tutorial.proxy.CommonProxy", clientSide = "dnicraft.tutorial.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	public static final String modId = "dnicraft";
	public static final String name = "D'ni Craft";
	public static final String version = "0.1.0";
	
	@Mod.Instance(modId)
	public static DniCraft instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
		ModItems.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
