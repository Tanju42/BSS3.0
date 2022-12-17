package de.tanju42.bss3.configs;

import de.tanju42.bss3.Bss3;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;

import java.io.*;
import java.util.ArrayList;

import static jdk.xml.internal.SecuritySupport.getResourceAsStream;

public class BssConfig {
    static String ConfigName = "bss.yml";

    public static void create() {
        if (!Bss3.pl.getDataFolder().exists()) {
            Bss3.pl.getDataFolder().mkdir();
        }
        File file = new File(Bss3.pl.getDataFolder(), ConfigName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Configuration bss = get();
            bss.set("tempstartdir", "/home/TempServer");
            bss.set("serversdir", "/home/");
            bss.set("ip", "localhost");
            bss.set("socketport", 9898);
            bss.set("languagefile", "language_EN.yml");
            bss.set("serverstatuschangelog", true);
            bss.set("groupstatuschangelog", true);

            ArrayList<String> startupstart = new ArrayList<String>();
            startupstart.add("Server1");
            bss.set("onstartupstart", startupstart);

            ArrayList<String> firstjoinservers = new ArrayList<String>();
            firstjoinservers.add("Server1");
            bss.set("firstjoinservers", firstjoinservers);

            bss.set("fallbacksystem.enabled", true);
            bss.set("fallbacksystem.autobalance", true);
            bss.set("fallbacksystem.joinautobalance", true);
            ArrayList<String> fallbacks = new ArrayList<String>();
            fallbacks.add("Server1");
            bss.set("fallbacksystem.servers", fallbacks);

            bss.set("automatically.changeeula", true);
            bss.set("automatically.changeip_forward", true);
            bss.set("automatically.changebungeecord", true);
            bss.set("automatically.changeonline_mode", true);
            bss.set("automatically.changeconnection_throttle.enabled", true);
            bss.set("automatically.changeconnection_throttle.value", -1);

            bss.set("servers.example.displayname", "Example Server");
            bss.set("servers.example.autostart", false);
            bss.set("servers.example.tempstart", false);
            bss.set("servers.example.dir", "/home/Server");
            bss.set("servers.example.port", 20010);
            bss.set("servers.example.motd", "This is an example");
            bss.set("servers.example.ram", "-Xms128M -Xmx1G");
            bss.set("servers.example.jar", "paper.jar");

            bss.set("debug", false);
            save(bss);
            System.out.println(ChatColor.YELLOW+"bss.yml created!");
        }
    }

    public static Configuration get() {
        try {
            return ConfigurationProvider.getProvider(YamlConfiguration.class).load(new File(Bss3.pl.getDataFolder(), ConfigName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void save(Configuration config) {
        try {
            ConfigurationProvider.getProvider(YamlConfiguration.class).save(config, new File(Bss3.pl.getDataFolder(), ConfigName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
