package ru.iamdvz.distanceplaceholder;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import ru.iamdvz.distanceplaceholder.placeholders.DistancePlaceholderPlaceholders;

public final class DistancePlaceholder extends JavaPlugin {
    private static DistancePlaceholder instance;

    @Override
    public void onEnable() {
        instance = this;
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
        if(Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            new DistancePlaceholderPlaceholders(this).register();
        }
    }

    @Override
    public void onDisable() {
    }

    public static DistancePlaceholder getInstance() {
        return instance;
    }
}
