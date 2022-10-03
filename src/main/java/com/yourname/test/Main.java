package com.yourname.test;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class Main extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new EventsListener(), this);
        Objects.requireNonNull(Bukkit.getPluginCommand("feed")).setExecutor(new FeedCommand());
        Objects.requireNonNull(Bukkit.getPluginCommand("vanish")).setExecutor(new VanishCommand());
    }


}
