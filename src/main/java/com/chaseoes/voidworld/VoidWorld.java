package com.chaseoes.voidworld;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public class VoidWorld extends JavaPlugin {

    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new VoidWorldGenerator();
    }


}
