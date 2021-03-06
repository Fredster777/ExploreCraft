package net.explorecraft.mod;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorExploreCraft implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, random, chunkX*16, chunkZ*16);
		case 0:
			generateOverworld(world, random, chunkX*16, chunkZ*16);
		case 1:
			generateEnd(world, random, chunkX*16, chunkZ*16);
		}

	}

	private void generateNether(World world, Random random, int x, int y) {
		
	}
	
	private void generateOverworld(World world, Random random, int x, int y) {
		
	}

	private void generateEnd(World world, Random random, int x, int y) {
	
	}
	
	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY){
		
	}

}
