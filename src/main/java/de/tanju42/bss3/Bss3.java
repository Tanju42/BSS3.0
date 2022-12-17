package de.tanju42.bss3;

import de.tanju42.bss3.commands.Commands;
import de.tanju42.bss3.configs.BssConfig;
import de.tanju42.bss3.utils.Server;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.config.Configuration;

import java.util.ArrayList;
import java.util.Collection;

public final class Bss3 extends Plugin {

    public static Plugin pl;
    public static ArrayList<Server> allServers = new ArrayList<>();

    @Override
    public void onEnable() {
        pl = this;
        BssConfig.create();

        fillArray_allServers();
        getProxy().getPluginManager().registerCommand(this, new Commands());
        System.out.println(ChatColor.YELLOW+"BSS3.0 enabled!");
    }

    public static void fillArray_allServers() {
        Configuration bss = BssConfig.get();
        Collection<String> confignames = bss.getSection("servers").getKeys();
        confignames.forEach(configname -> {
            allServers.add(
                new Server(
                        configname,
                        bss.getString("servers."+configname+".displayname"),
                        bss.getBoolean("servers."+configname+".autostart"),
                        bss.getBoolean("servers."+configname+".tempstart"),
                        bss.getString("servers."+configname+".dir"),
                        bss.getInt("servers."+configname+".port"),
                        bss.getString("servers."+configname+".motd"),
                        bss.getString("servers."+configname+".ram"),
                        bss.getString("servers."+configname+".jar")
                )
            );
        });
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.YELLOW+"BSS3.0 disabled!");
        // Plugin shutdown logic
    }
}
