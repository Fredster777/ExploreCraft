package net.explorecraft.mod;

import net.explorecraft.mod.biome.BiomeForestCanopy;
import net.explorecraft.mod.biome.BiomeForestGiant;
import net.explorecraft.mod.biome.BiomeForestMuddyCedar;
import net.explorecraft.mod.block.BlockCedarLeaves;
import net.explorecraft.mod.block.BlockCedarSapling;
import net.explorecraft.mod.block.BlockMud;
import net.explorecraft.mod.blocks.BlockCedarLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.biome.BiomeGenBase;
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
	
	
	//Define items
	
	//Define biomes
	public static BiomeGenBase forestMuddyCedar;
	public static BiomeGenBase forestGiant;
	public static BiomeGenBase forestCanopy;
	
	
	//Define dimensions
	
	@EventHandler
	public void load(FMLInitializationEvent e) {
		
		//Settings for blocks
		blockMud = new BlockMud(200, Material.ground).setUnlocalizedName("ExploreCraft:blockMud");
		
		
		//Settings for items
		
		//Settings for biomes
		forestMuddyCedar = new BiomeForestMuddyCedar(100).setBiomeName("Muddy Forest").setMinMaxHeight(0.3F, 0.6F);
		forestGiant = new BiomeForestGiant(101).setBiomeName("Giant Forest").setMinMaxHeight(0.3F, 0.35F);
		forestCanopy = new BiomeForestCanopy(102).setBiomeName("Canopy").setMinMaxHeight(1.8F, 2.0F);
		
		//Register blocks
		GameRegistry.registerBlock(blockMud, "blockMud");
		LanguageRegistry.addName(blockMud, "Mud");
		
		
		//Register items
		
		//Register biomes
		GameRegistry.addBiome(forestMuddyCedar);
		GameRegistry.addBiome(forestGiant);
		GameRegistry.addBiome(forestCanopy);
		
		//Register World Generator (used for generating ores)
		GameRegistry.registerWorldGenerator(new WorldGeneratorExploreCraft());
		
		
	}

}
