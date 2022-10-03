package com.yourname.test;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class EventsListener implements Listener {

    @EventHandler
    public void onJoinEvent(PlayerJoinEvent e){
        e.setJoinMessage("[+] " + e.getPlayer().getName());
    }
    @EventHandler
    public void onQuitEvent(PlayerQuitEvent e){
        e.setQuitMessage("[-] " + e.getPlayer().getName());
    }

}
