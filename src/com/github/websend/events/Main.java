package com.github.websend.events;

import com.github.websend.events.configuration.PlayerEventsConfiguration;
import com.github.websend.events.configuration.ServerEventsConfiguration;
import com.github.websend.events.listener.WSPlayerListener;
import com.github.websend.events.listener.WSServerListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin{
    private static Main instance;
    
    @Override
    public void onEnable(){
        instance = this;
        try {
            PlayerEventsConfiguration config = new PlayerEventsConfiguration();
            config.loadConfiguration();
            if(config.hasActiveEvent()){
                this.getServer().getPluginManager().registerEvents(new WSPlayerListener(config), this);
            }
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Failed to load the player events config file.", ex);
        }
        
        try {
            ServerEventsConfiguration config = new ServerEventsConfiguration();
            config.loadConfiguration();
            if(config.hasActiveEvent()){
                this.getServer().getPluginManager().registerEvents(new WSServerListener(config), this);
            }
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Failed to load the server events config file.", ex);
        }
    }
    
    @Override
    public void onDisable(){
        
    }

    public static Main getInstance() {
        return instance;
    }
    
    public static void main(String args[]){
        String[] eventNames = {
            "MapInitializeEvent",
            "PluginDisableEvent",
            "PluginEnableEvent",
            "PluginEvent",
            "RemoteServerCommandEvent",
            "ServerCommandEvent",
            "ServerEvent",
            "ServerListPingEvent",
            "ServiceEvent",
            "ServiceRegisterEvent",
            "ServiceUnregisterEvent"
        };
        generateEventHandlerCode(eventNames);
    }
    
    private static void generateEventHandlerCode(String[] eventNames){
        for(String cur : eventNames){
            System.out.println();
            System.out.println("    public void onEvent("+cur+" e){");
            System.out.println("        if(config.isEventEnabled(e.getEventName())){");
            System.out.println("            String[] array = {\"event\", e.getEventName()};");
            System.out.println("            Main.doCommand(array, e.getPlayer());");
            System.out.println("        }");
            System.out.println("    }");
        }
    }
}