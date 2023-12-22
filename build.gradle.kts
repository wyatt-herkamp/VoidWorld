import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import net.minecrell.pluginyml.bukkit.BukkitPluginDescription

/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    `java-library`
    `maven-publish`
    id("com.github.johnrengelman.shadow") version "8.1.1"
    kotlin("jvm")
    id("net.minecrell.plugin-yml.bukkit") version "0.6.0"
    id("idea")
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    }
    maven {
        url = uri("https://ci.ender.zone/plugin/repository/everything/")
    }
    maven {
        url = uri("https://repo.mikeprimm.com/")
    }
    maven {
        url = uri("https://repo.codemc.org/repository/maven-public")
    }
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
    maven {
        name = "papermc"
        url = uri("https://papermc.io/repo/repository/maven-public/")
    }
    mavenCentral()
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.16.4-R0.1-SNAPSHOT")
    implementation("org.bstats:bstats-bukkit:3.0.2")
    implementation(kotlin("stdlib-jdk8"))
}

group = "dev.kingtux"
version = "1.2"
description = "VoidWorld"
tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}
kotlin {
    jvmToolchain(11)
}
bukkit {
    main = "dev.kingtux.voidworld.VoidWorldPlugin"
    apiVersion = "1.16"
    authors = listOf("KingTux", "chaseoes")
    description = "Generates a Void World"
    load = BukkitPluginDescription.PluginLoadOrder.STARTUP
    website = "https://github.com/wyatt-herkamp/VoidWorld"
}
tasks {
    named<ShadowJar>("shadowJar") {
        relocate("org.bstats", "dev.kingtux.voidworld.bstats")
    }
    build {
        dependsOn(shadowJar)
    }
    jar{
        enabled = false
    }
}
idea {
    module {
        isDownloadJavadoc = true
        isDownloadSources = true
    }
}