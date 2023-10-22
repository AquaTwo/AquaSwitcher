package me.aquatwo.aquaswitcher;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



public class Feed implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player))
            sender.sendMessage("Only players can use this command!");
        Player player = (Player)sender;
        if (args.length == 0) {
            player.setFoodLevel(20);
            player.sendMessage(ChatColor.AQUA + "You have been fed" + ChatColor.YELLOW + ".");
            return true;
        }
        Player target = Bukkit.getServer().getPlayer(args[0]);
        if (target == null) {
            player.sendMessage(ChatColor.RED + "This player doesn't exist");
            return true;
        }
        player.setFoodLevel(20);
        player.sendMessage(ChatColor.AQUA + "You have been fed" + ChatColor.YELLOW + ".");
        return true;
    }
}
