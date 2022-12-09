package ru.iamdvz.distanceplaceholder.commands;


import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import ru.iamdvz.distanceplaceholder.DistancePlaceholder;

public class ReloadCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender.hasPermission("distanceplaceholder.admin") && args[0].equalsIgnoreCase("reload")) {
            DistancePlaceholder.getInstance().reloadConfig();
            sender.sendMessage("Config reloaded");
            return true;
        }
        return false;
    }
}