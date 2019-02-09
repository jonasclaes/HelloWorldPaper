package be.jonasclaes.HelloWorldPaper;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ComponentBuilder;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static org.bukkit.Bukkit.broadcast;
import static org.bukkit.Bukkit.broadcastMessage;

public class PluginEventHandler implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent playerJoinEvent) {
        Player player = playerJoinEvent.getPlayer();
        broadcast(new ComponentBuilder("Welcome to the server, " + player.getDisplayName()).color(ChatColor.GOLD).create());
    }

}
