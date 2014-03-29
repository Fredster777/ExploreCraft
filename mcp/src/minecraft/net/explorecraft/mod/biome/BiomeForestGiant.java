package net.explorecraft.mod.biome;

import java.util.Random;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeForestGiant extends BiomeGenBase {

	public BiomeForestGiant(int par1) {
		super(par1);
		
		this.theBiomeDecorator.treesPerChunk = 63;
	}
	
	public int getBiomeGrassColor() {
		
		return 0x0F8507;
	}

}
