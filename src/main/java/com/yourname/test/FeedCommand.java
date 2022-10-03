package com.yourname.test;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)){
            commandSender.sendMessage("You are not a player so you cant use this.");
            return false;
        }
        Player player = (Player) commandSender;
        player.setFoodLevel(20);

        return false;
    }
}
