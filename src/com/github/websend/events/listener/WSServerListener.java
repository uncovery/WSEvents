package com.github.websend.events.listener;

import com.github.websend.events.configuration.ServerEventsConfiguration;
import com.github.websend.Main;
import org.bukkit.event.Listener;
import org.bukkit.event.server.*;

public class WSServerListener implements Listener{
    ServerEventsConfiguration config = null;

    public WSServerListener(ServerEventsConfiguration config) {
        this.config = config;
    }
    
    public void onEvent(MapInitializeEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_SERVER");
        }
    }

    public void onEvent(PluginDisableEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_SERVER");
        }
    }

    public void onEvent(PluginEnableEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_SERVER");
        }
    }

    public void onEvent(PluginEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_SERVER");
        }
    }

    public void onEvent(RemoteServerCommandEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_SERVER");
        }
    }

    public void onEvent(ServerCommandEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_SERVER");
        }
    }

    public void onEvent(ServerEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_SERVER");
        }
    }

    public void onEvent(ServerListPingEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_SERVER");
        }
    }

    public void onEvent(ServiceEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_SERVER");
        }
    }

    public void onEvent(ServiceRegisterEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_SERVER");
        }
    }

    public void onEvent(ServiceUnregisterEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_SERVER");
        }
    }
}
