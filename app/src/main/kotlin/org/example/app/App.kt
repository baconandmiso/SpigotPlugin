package org.example.app

import org.bukkit.plugin.java.JavaPlugin

class App : JavaPlugin() {
    override fun onEnable() {
        logger.info("Hello, world!")
    }
}