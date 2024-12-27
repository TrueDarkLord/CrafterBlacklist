package me.truedarklord.crafterBlacklist.listeners;

import me.truedarklord.crafterBlacklist.CrafterBlacklist;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.CrafterCraftEvent;

import java.util.List;

public class CrafterCraft implements Listener {

    CrafterBlacklist plugin;

    public CrafterCraft(CrafterBlacklist plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onCrafterCraft(CrafterCraftEvent event) {
        List<String> blacklist = plugin.getConfig().getStringList("Blacklist");

        if (blacklist.contains(event.getResult().getType().toString())) event.setCancelled(true);
        
    }

}
