package net.explorecraft.mod.biome;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeForestCanopy extends BiomeGenBase{

	public BiomeForestCanopy(int par1) {
		super(par1);
		
		this.topBlock = (byte)Block.leaves.blockID;
		this.fillerBlock = (byte)Block.leaves.blockID;
	}

}
