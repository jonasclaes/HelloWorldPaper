package be.jonasclaes.HelloWorldPaper;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.ComponentBuilder;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import static org.bukkit.Bukkit.broadcastMessage;
import static org.bukkit.Bukkit.getPlayer;

/**
 * Hello world!
 *
 */
public class HelloWorldPaper extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        getServer().getPluginManager().registerEvents(new PluginEventHandler(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("helloworld")) {
            Player player = getPlayer(sender.getName());
            player.sendMessage(new ComponentBuilder("Hello, World!").color(ChatColor.AQUA).create());
            return true;
        } else {
            return false;
        }
    }
}
