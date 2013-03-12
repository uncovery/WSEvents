package com.github.websend.events.listener;

import com.github.websend.Main;
import com.github.websend.events.configuration.VehicleEventsConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.*;

public class VehicleListener implements Listener{
    VehicleEventsConfiguration config = null;

    public VehicleListener(VehicleEventsConfiguration config) {
        this.config = config;
    }
    
    public void onEvent(VehicleBlockCollisionEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_VEHICLE");
        }
    }

    public void onEvent(VehicleCollisionEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_VEHICLE");
        }
    }

    public void onEvent(VehicleCreateEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_VEHICLE");
        }
    }

    public void onEvent(VehicleDamageEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_VEHICLE");
        }
    }

    public void onEvent(VehicleDestroyEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_VEHICLE");
        }
    }

    public void onEvent(VehicleEnterEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_VEHICLE");
        }
    }

    public void onEvent(VehicleEntityCollisionEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_VEHICLE");
        }
    }

    public void onEvent(VehicleEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_VEHICLE");
        }
    }

    public void onEvent(VehicleExitEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_VEHICLE");
        }
    }

    public void onEvent(VehicleMoveEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_VEHICLE");
        }
    }

    public void onEvent(VehicleUpdateEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_VEHICLE");
        }
    }
}
