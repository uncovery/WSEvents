package Waterflames.websend.WSEvents;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin{
    public static File dataFolder;
    public static Configuration config;
    WSPlayerListener listener;
    
    @Override
    public void onEnable(){
        dataFolder = this.getDataFolder();
        try {
            config = Configuration.loadConfiguration();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "WSEvent failed to load the config file.", ex);
        }
        listener = new WSPlayerListener();
        this.getServer().getPluginManager().registerEvents(listener, this);
    }
    
    @Override
    public void onDisable(){
        
    }
}