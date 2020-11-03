package com.github.websend.events.listener;

import com.github.websend.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;
import com.github.websend.events.configuration.AdvancementEventsConfiguration;
import org.bukkit.advancement.Advancement;

// https://hub.spigotmc.org/javadocs/spigot/org/bukkit/event/player/PlayerAdvancementDoneEvent.html
// PlayerAdvancementDoneEvent​(@NotNull Player who, @NotNull Advancement advancement)


public class AdvancementListener implements Listener{
    AdvancementEventsConfiguration config = null;

    public AdvancementListener(AdvancementEventsConfiguration config) {
        this.config = config;
    }

    @EventHandler
    public void onEvent(PlayerAdvancementDoneEvent e){
        if(config.isEventEnabled(e.getEventName())){
            Advancement advancement = e.getAdvancement();
            String[] array = {"event", e.getEventName(), advancement.getKey().toString()};
            Main.doCommand(array, e.getPlayer());
        }
    }
}