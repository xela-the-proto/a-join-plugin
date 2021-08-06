package me.xela.listeners.join;

import me.xela.listeners.Main;
import me.xela.listeners.utils.utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class JoinListener implements Listener {
    private Main plugin;

    public JoinListener(Main plugin){
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();

        if (!p.hasPlayedBefore()){
            //hooking into config
            Bukkit.broadcastMessage(utils.chat(plugin.getConfig().getString("firstJoinMessage").replace("<player>",p.getName())));
        }else{
            Bukkit.broadcastMessage(utils.chat(plugin.getConfig().getString("joinMessage").replace("<player>",p.getName())));
        }
    }
}
