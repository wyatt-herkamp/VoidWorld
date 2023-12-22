package dev.kingtux.voidworld

import org.bstats.bukkit.Metrics
import org.bukkit.generator.ChunkGenerator
import org.bukkit.plugin.java.JavaPlugin

class VoidWorldPlugin: JavaPlugin() {
    override fun onLoad() {
        val metrics = Metrics(this, 20536)
    }

    override fun getDefaultWorldGenerator(worldName: String, id: String?): ChunkGenerator {
        return VoidWorldGenerator()
    }

}