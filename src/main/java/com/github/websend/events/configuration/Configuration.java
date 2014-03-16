package com.github.websend.events.configuration;

import com.github.websend.events.Main;
import java.io.*;
import java.util.HashSet;
import java.util.logging.Level;

public abstract class Configuration {
    private HashSet<String> activeEventsList = new HashSet<String>();
    
    public void loadConfiguration() throws IOException{        
        File configFile = new File(Main.getInstance().getDataFolder(), this.getFilename());
        if(!configFile.exists()){
            Main.getInstance().getDataFolder().mkdirs();
            configFile.createNewFile();
            writeConfigurationFile(configFile);
        }
        BufferedReader reader = new BufferedReader(new FileReader(configFile));
        String line;
        while((line = reader.readLine()) != null){
            this.parseLine(line);
        }
        reader.close();
    }
    
    public boolean isEventEnabled(String eventName){
        return activeEventsList.contains(eventName);
    }
    
    public boolean hasActiveEvent(){
        return !activeEventsList.isEmpty();
    }
    
    private void parseLine(String line){
        if(line.split("=").length != 2){
            Main.getInstance().getLogger().log(Level.WARNING, "Invalid config line: "+line);
        }else{
            String name = line.split("=")[0].trim();
            String boolString = line.split("=")[1].trim();
            boolean active = Boolean.parseBoolean(boolString.trim());
            if(active){
                activeEventsList.add(name);
            }
        }
    }
    
    public void writeConfigurationFile(File file) throws IOException{
        PrintWriter writer = new PrintWriter(new FileWriter(file));
        for(String str : this.getEventNameList()){
            writer.println(str+"=false");
        }
        writer.flush();
        writer.close();
    };
    
    public abstract String getFilename();
    public abstract String[] getEventNameList();
}
