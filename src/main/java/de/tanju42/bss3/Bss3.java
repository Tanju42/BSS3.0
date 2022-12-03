package de.tanju42.bss3;

import de.tanju42.bss3.commands.Commands;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.plugin.Plugin;

public final class Bss3 extends Plugin {

    @Override
    public void onEnable() {
        System.out.println(ChatColor.YELLOW+"BSS3.0 enabled!");
        getProxy().getPluginManager().registerCommand(this, new Commands());
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.YELLOW+"BSS3.0 disabled!");
        // Plugin shutdown logic
    }
}
