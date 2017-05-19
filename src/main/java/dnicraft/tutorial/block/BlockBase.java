package dnicraft.tutorial.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import dnicraft.tutorial.DniCraft;
import dnicraft.tutorial.item.ItemModelProvider;

public class BlockBase extends Block implements ItemModelProvider{

	protected String name;
	
	public BlockBase(Material materialIn, String name) {
		super(materialIn);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		//setCreativeTab(TutorialMod.creativeTab); //this creativetab hasn't been implemented yet
	}
	
	@Override
	public void registerItemModel(Item itemBlock) {
		DniCraft.proxy.registerItemRenderer(itemBlock, 0, name);
		
	}
	
	 @Override
	 public BlockBase setCreativeTab(CreativeTabs tab) {
		 super.setCreativeTab(tab);
		 return this;
	 }

	
}