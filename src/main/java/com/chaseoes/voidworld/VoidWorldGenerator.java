package com.chaseoes.voidworld;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.data.BlockData;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.material.MaterialData;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class VoidWorldGenerator extends ChunkGenerator {

    public List<BlockPopulator> getDefaultPopulators(World world) {
        return Arrays.asList(new BlockPopulator[0]);
    }

    public boolean canSpawn(World world, int x, int z) {
        return true;
    }

    public byte[] generate(World world, Random rand, int chunkx, int chunkz) {
        return new byte[32768];
    }

    public Location getFixedSpawnLocation(World world, Random random) {
        return new Location(world, 0, 128, 0);
    }

    @Override
    public ChunkData generateChunkData(World world, Random random, int x, int z, BiomeGrid biome) {
       return createChunkData(world);
    }
}
