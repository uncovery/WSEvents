package com.github.websend.events.listener;

import com.github.websend.Main;
import com.github.websend.events.configuration.PaintingEventsConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.painting.*;

public class PaintingListener implements Listener{
    PaintingEventsConfiguration config = null;

    public PaintingListener(PaintingEventsConfiguration config) {
        this.config = config;
    }
    
    @EventHandler
    public void onEvent(PaintingBreakByEntityEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_PAINTING");
        }
    }

    @EventHandler
    public void onEvent(PaintingBreakEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_PAINTING");
        }
    }

    @EventHandler
    public void onEvent(PaintingPlaceEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_PAINTING");
        }
    }
}
