package de.tanju42.bss3.commands;

import de.tanju42.bss3.Bss3;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;

import java.util.ArrayList;

public class Command_reload {
    public static void command(CommandSender sender) {
        sender.sendMessage(new TextComponent(ChatColor.YELLOW+"Reloading..."));
        Bss3.allServers = new ArrayList<>();
        Bss3.fillArray_allServers();


        sender.sendMessage(new TextComponent(ChatColor.YELLOW+"Reload completed!"));
    }
}
