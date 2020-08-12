package com.steve.masssay;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MassSay implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.isOp() && !sender.hasPermission("masssay.admin")) {
            sender.sendMessage("§cAccess denied");
            return true;
        }
        if (args.length < 1) {
            sender.sendMessage("§cUsage: §6/masssay <msg>");
            return true;
        }
        String msg = "";
        for (int i = 0; i < args.length; i++) {
            msg += args[i] + " ";
        }
        String finalMsg = msg;
        Bukkit.getServer().getOnlinePlayers().forEach(player -> {
            player.chat(finalMsg.replace("&", "§"));
        });
        return false;
    }

}
