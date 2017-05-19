package dnicraft.tutorial.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static ItemBase fancyRock;
	
	public static void init() {
		fancyRock = register(new ItemBase("fancyRock").setCreativeTab(CreativeTabs.MATERIALS));
		
	}
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if(item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}
		
		return item;
	}
	
}