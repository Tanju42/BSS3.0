package de.tanju42.bss3.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.TabExecutor;

import java.util.*;
import java.util.stream.Collectors;

public class Commands extends Command implements TabExecutor {

    public Commands() {
        super("bss", null, "s");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {//Args: /0 1 2 3 4
        if (args.length == 0) { // /s
            sender.sendMessage(new TextComponent(ChatColor.YELLOW+"BSS!"));
        } else if (args.length == 1) { // /s 1
            if (args[0].equals("help")) {
                sender.sendMessage(new TextComponent(ChatColor.YELLOW+"This is the help command!"));
            }
        } else {
            sender.sendMessage(new TextComponent(ChatColor.RED+"too many arguments! "+ChatColor.YELLOW+"/s "+ChatColor.GRAY+"for help"));
        }

    }

    @Override
    public Iterable<String> onTabComplete(CommandSender sender, String[] args) {
        List<String> arguments = new ArrayList<>();
        if (args.length == 0) { // /s
            return Collections.emptyList();
        } else if (args.length == 1) { // /s 1
            arguments.add("help");
            arguments.add("test");
            arguments.add("test2");
            arguments.add("tesst");
            arguments.add("tesstt");
        }

        return arguments.stream().filter(s -> s.startsWith(args[args.length-1])).collect(Collectors.toList()); //returns args with auto filtering input.
    }
}
