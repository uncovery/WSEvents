package com.github.websend.events;

import com.github.websend.events.configuration.*;
import com.github.websend.events.listener.*;
import java.util.logging.Level;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin{
    private static Main instance;
    
    @Override
    public void onEnable(){
        instance = this;
        int loaded = registerListeners();
        this.getLogger().info("Enabled "+loaded+" event listening classes.");
    }
    
    @Override
    public void onDisable(){
        
    }

    public static Main getInstance() {
        return instance;
    }
    
    private int registerListeners(){
        //Ugly, but the most clean and balanced approach I can come up with...
        int loadedAmount = 0;
        try {
            BlockEventsConfiguration config = new BlockEventsConfiguration();
            config.loadConfiguration();
            if(config.hasActiveEvent()){
                this.getServer().getPluginManager().registerEvents(new BlockListener(config), this);
                loadedAmount++;
            }
        } catch (Exception ex) {
            this.getLogger().log(Level.SEVERE, "Failed to load the block events config file.", ex);
        }
        
        try {
            EnchantmentEventsConfiguration config = new EnchantmentEventsConfiguration();
            config.loadConfiguration();
            if(config.hasActiveEvent()){
                this.getServer().getPluginManager().registerEvents(new EnchantmentListener(config), this);
                loadedAmount++;
            }
        } catch (Exception ex) {
            this.getLogger().log(Level.SEVERE, "Failed to load the enchantment events config file.", ex);
        }
        
        try {
            EntityEventsConfiguration config = new EntityEventsConfiguration();
            config.loadConfiguration();
            if(config.hasActiveEvent()){
                this.getServer().getPluginManager().registerEvents(new EntityListener(config), this);
                loadedAmount++;
            }
        } catch (Exception ex) {
            this.getLogger().log(Level.SEVERE, "Failed to load the entity events config file.", ex);
        }
        
        try {
            HangingEventsConfiguration config = new HangingEventsConfiguration();
            config.loadConfiguration();
            if(config.hasActiveEvent()){
                this.getServer().getPluginManager().registerEvents(new HangingListener(config), this);
                loadedAmount++;
            }
        } catch (Exception ex) {
            this.getLogger().log(Level.SEVERE, "Failed to load the hanging events config file.", ex);
        }
        
        try {
            InventoryEventsConfiguration config = new InventoryEventsConfiguration();
            config.loadConfiguration();
            if(config.hasActiveEvent()){
                this.getServer().getPluginManager().registerEvents(new InventoryListener(config), this);
                loadedAmount++;
            }
        } catch (Exception ex) {
            this.getLogger().log(Level.SEVERE, "Failed to load the inventory events config file.", ex);
        }
        
        try {
            PlayerEventsConfiguration config = new PlayerEventsConfiguration();
            config.loadConfiguration();
            if(config.hasActiveEvent()){
                this.getServer().getPluginManager().registerEvents(new PlayerListener(config), this);
                loadedAmount++;
            }
        } catch (Exception ex) {
            this.getLogger().log(Level.SEVERE, "Failed to load the player events config file.", ex);
        }
        
        try {
            ServerEventsConfiguration config = new ServerEventsConfiguration();
            config.loadConfiguration();
            if(config.hasActiveEvent()){
                this.getServer().getPluginManager().registerEvents(new ServerListener(config), this);
                loadedAmount++;
            }
        } catch (Exception ex) {
            this.getLogger().log(Level.SEVERE, "Failed to load the server events config file.", ex);
        }
        
        try {
            VehicleEventsConfiguration config = new VehicleEventsConfiguration();
            config.loadConfiguration();
            if(config.hasActiveEvent()){
                this.getServer().getPluginManager().registerEvents(new VehicleListener(config), this);
                loadedAmount++;
            }
        } catch (Exception ex) {
            this.getLogger().log(Level.SEVERE, "Failed to load the vehicle events config file.", ex);
        }
        
        try {
            WeatherEventsConfiguration config = new WeatherEventsConfiguration();
            config.loadConfiguration();
            if(config.hasActiveEvent()){
                this.getServer().getPluginManager().registerEvents(new WeatherListener(config), this);
                loadedAmount++;
            }
        } catch (Exception ex) {
            this.getLogger().log(Level.SEVERE, "Failed to load the weather events config file.", ex);
        }
        
        try {
            WorldEventsConfiguration config = new WorldEventsConfiguration();
            config.loadConfiguration();
            if(config.hasActiveEvent()){
                this.getServer().getPluginManager().registerEvents(new WorldListener(config), this);
                loadedAmount++;
            }
        } catch (Exception ex) {
            this.getLogger().log(Level.SEVERE, "Failed to load the world events config file.", ex);
        }
        return loadedAmount;
    }
    
    /*
     * Use to generate event handler code:
    
    public static void main(String args[]){
        String[] eventNames = {};
        generateEventHandlerCode(eventNames);
    }
    
    private static void generateEventHandlerCode(String[] eventNames){
        for(String cur : eventNames){
            System.out.println();
            System.out.println("    @EventHandler");
            System.out.println("    public void onEvent("+cur+" e){");
            System.out.println("        if(config.isEventEnabled(e.getEventName())){");
            System.out.println("            String[] array = {\"event\", e.getEventName()};");
            System.out.println("            Main.doCommand(array, e.getPlayer());");
            System.out.println("        }");
            System.out.println("    }");
        }
    }*/
}