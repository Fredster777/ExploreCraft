package net.explorecraft.mod;

import net.explorecraft.mod.block.BlockMudBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

//Basic info for mod
@Mod(modid = "ExploreCraft", name = "ExploreCraft", version = "v1.0")

//Client and Server Side requirements
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class ExploreCraft {
	
	//Define blocks
	public static Block blockMud;
	
	@EventHandler
	public void load(FMLInitializationEvent e) {
		
		//Settings for blocks
		blockMud = new BlockMudBlock(200, Material.ground).setUnlocalizedName("ExploreCraft:blockMud");
		
		//Register blocks
		GameRegistry.registerBlock(blockMud, "blockMud");
		LanguageRegistry.addName(blockMud, "Mud");
		
	}

}
