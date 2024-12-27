package me.truedarklord.crafterBlacklist;

import me.truedarklord.crafterBlacklist.commands.Reload;
import me.truedarklord.crafterBlacklist.listeners.CrafterCraft;
import me.truedarklord.crafterBlacklist.metrics.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public final class CrafterBlacklist extends JavaPlugin {

    @Override
    public void onEnable() {
        Metrics metrics = new Metrics(this, 24251);
        saveDefaultConfig();

        advertise();

        new CrafterCraft(this);
        new Reload(this);

    }

    private void advertise() {
        this.getServer().getConsoleSender().sendMessage(
                """
  
 §#00AA00================================§#ee2222

 _____            __ _             \s
 / ____|          / _| |            \s
| |     _ __ __ _| |_| |_ ___ _ __  \s
| |____| | | (_| | | | ||  __/ |    \s
| |    | '__/ _` |  _| __/ _ \\ '__| \s
 \\_____|_|  \\__,_|_|_ \\__\\___|_| _  \s
|  _ \\| |          | |  | (_)   | | \s
| |_) | | __ _  ___| | _| |_ ___| |_\s
|  _ <| |/ _` |/ __| |/ / | / __| __|
| |_) | | (_| | (__|   <| | \\__ \\ |_\s
|____/|_|\\__,_|\\___|_|\\_\\_|_|___/\\__|
                                    \s
                                    \s
                        

§#f5da2aBy TrueDarkLord.
§#00AA00================================
§#f5da2aFeel free to buy me a coffee:  §#00AA00|
§bhttps://ko-fi.com/truedarklord §#00AA00|
§#00AA00================================
                        """
        );
    }

}
