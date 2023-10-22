package me.aquatwo.aquaswitcher;

import org.bukkit.plugin.java.JavaPlugin;

public final class AquaSwitcher extends JavaPlugin {
    public void onEnable() {
        getLogger().info("Starting up...");
        getCommand("gmc").setExecutor(new Creative());
        getCommand("gms").setExecutor(new Survival());
        getCommand("gmsp").setExecutor(new Spectator());
        getCommand("gma").setExecutor(new Adventure());
        getCommand("heal").setExecutor(new Heal());
        getCommand("feed").setExecutor(new Feed());
    }

    public void onDisable() {
        getLogger().info("Shutting down...");
    }
}
