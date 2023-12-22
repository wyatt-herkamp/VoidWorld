package dev.kingtux.voidworld

import org.bukkit.Location
import org.bukkit.World
import org.bukkit.generator.BlockPopulator
import org.bukkit.generator.ChunkGenerator
import java.util.*

class VoidWorldGenerator: ChunkGenerator() {
    override fun getDefaultPopulators(world: World): MutableList<BlockPopulator> {
        return mutableListOf()
    }

    override fun canSpawn(world: World, x: Int, z: Int): Boolean {
        return true
    }

    override fun getFixedSpawnLocation(world: World, random: Random): Location {
        return Location(world, 0.0, 64.0, 0.0)
    }
    override fun generateChunkData(world: World, random: Random, x: Int, z: Int, biome: BiomeGrid): ChunkData {
        return createChunkData(world)
    }
}