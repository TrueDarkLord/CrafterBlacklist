package me.truedarklord.crafterBlacklist.commands;

import me.truedarklord.crafterBlacklist.CrafterBlacklist;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Reload implements CommandExecutor {
    private final CrafterBlacklist plugin;

    public Reload(CrafterBlacklist plugin) {
        this.plugin = plugin;
        plugin.getCommand("reload").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        plugin.saveDefaultConfig();
        plugin.reloadConfig();

        return true;
    }
}
