package dnicraft.tutorial.item;

import dnicraft.tutorial.DniCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements ItemModelProvider{
 
 protected String name;
 
 public ItemBase(String name) {
 this.name = name;
 setUnlocalizedName(name);
 setRegistryName(name);
 //setCreativeTab(TutorialMod.creativeTab); //this is commented out, because we don't have our creative-tab yet.
 }
 
 @Override
 public void registerItemModel(Item item) {
	 DniCraft.proxy.registerItemRenderer(this, 0, name);
 }
 
 @Override
 public ItemBase setCreativeTab(CreativeTabs tab) {
 super.setCreativeTab(tab);
 return this;
 }

}