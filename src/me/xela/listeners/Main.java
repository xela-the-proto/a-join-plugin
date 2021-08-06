package me.xela.listeners;

import me.xela.listeners.join.JoinListener;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){
        saveDefaultConfig();

        new JoinListener(this);
    }
}
