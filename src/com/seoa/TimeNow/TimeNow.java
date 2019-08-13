package com.seoa.TimeNow;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.seoa.TimeNow.commands.TimeCommand;

public class TimeNow extends JavaPlugin implements Listener {
	private TimeCommand commands = new TimeCommand();
	
	public void onEnable()
	{
		getCommand(commands.cmd1).setExecutor(commands);
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[TimeNow] Plugin Enabled");
	}
	
	public void onDisable()
	{
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "[TimeNow] Plugin Disabled");
	}
}
