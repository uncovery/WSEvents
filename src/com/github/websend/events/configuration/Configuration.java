package com.github.websend.events.configuration;

import com.github.websend.events.Main;
import java.io.*;
import java.util.HashMap;
import java.util.logging.Level;

public abstract class Configuration {
    private static HashMap<String, Boolean> eventList = new HashMap<String, Boolean>();
    
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
        if(!eventList.containsKey(eventName)){
            return false;
        }else{
            return eventList.get(eventName);
        }
    }
    
    public boolean hasActiveEvent(){
        return eventList.containsValue(true);
    }
    
    private void parseLine(String line){
        if(line.split("=").length != 2){
            Main.getInstance().getLogger().log(Level.WARNING, "Invalid config line: "+line);
        }else{
            String name = line.split("=")[0].trim();
            String boolString = line.split("=")[1].trim();
            boolean bool = Boolean.parseBoolean(boolString.trim());
            eventList.put(name, bool);
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
    
    public abstract String[] getEventNameList();
    public abstract String getFilename();
}
