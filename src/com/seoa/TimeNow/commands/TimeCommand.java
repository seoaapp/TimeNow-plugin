package com.seoa.TimeNow.commands;

import java.text.SimpleDateFormat;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;

import net.md_5.bungee.api.ChatColor;
import net.minecraft.server.v1_12_R1.CommandExecute;


public class TimeCommand extends CommandExecute implements Listener, CommandExecutor {
	
	public String cmd1 = "Time";
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
	    SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		sender.sendMessage(ChatColor.AQUA + "" + date + time);
		return false;
	}

}
