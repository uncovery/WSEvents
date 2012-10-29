package Waterflames.websend.WSEvents;

import java.io.*;
import java.util.logging.Logger;

public class Configuration {
    private PlayerEventsConfiguration pec;
    Logger logger = Logger.getLogger("Minecraft");
    public PlayerEventsConfiguration getPlayerConfiguration() {
        return pec;
    }
    
    private void setPlayerConfiguration(PlayerEventsConfiguration pec) {
        this.pec = pec;
    }
    
    public static Configuration loadConfiguration() throws IOException{
        Configuration config = new Configuration();
        PlayerEventsConfiguration newPec = new PlayerEventsConfiguration();
        
        File playersFile = new File(Main.dataFolder, "player.txt");
        if(!playersFile.exists()){
            Main.dataFolder.mkdirs();
            playersFile.createNewFile();
            writePlayerFile(playersFile);
        }
        BufferedReader reader = new BufferedReader(new FileReader(playersFile));
        String line;
        while((line = reader.readLine()) != null){
            parseLine(line, newPec);
        }
        reader.close();
        config.setPlayerConfiguration(newPec);
        return config;
    }
    
    public static void writePlayerFile(File file) throws IOException{
        PrintWriter writer = new PrintWriter(new FileWriter(file));
        writer.println("deathEnabled = false");
        writer.println("bedEnterEnabled = false");
        writer.println("bedLeaveEnabled = false");
        writer.println("bucketEmptyEnabled = false");
        writer.println("bucketFillEnabled = false");
        writer.println("changedWorldEnabled = false");
        writer.println("chatEnabled = false");
        writer.println("commandPreprocessEnabled = false");
        writer.println("dropItemEnabled = false");
        writer.println("eggThrowEnabled = false");
        writer.println("expChangeEnabled = false");
        writer.println("fishEnabled = false");
        writer.println("gameModeChangeEnabled = false");
        writer.println("interactEntityEnabled = false");
        writer.println("interactEnabled = false");
        writer.println("inventoryEnabled = false");
        writer.println("itemHeldEnabled = false");
        writer.println("joinEnabled = false");
        writer.println("kickEnabled = false");
        writer.println("levelChangeEnabled = false");
        writer.println("loginEnabled = false");
        writer.println("moveEnabled = false");
        writer.println("pickupItemEnabled = false");
        writer.println("portalEnabled = false");
        writer.println("preLoginEnabled = false");
        writer.println("quitEnabled = false");
        writer.println("respawnEnabled = false");
        writer.println("shearEntityEnabled = false");
        writer.println("teleportEnabled = false");
        writer.println("toggleSneakEnabled = false");
        writer.println("toggleSprintEnabled = false");
        writer.println("velocityEnabled = false");
        writer.flush();
        writer.close();
    }
    
    public static void parseLine(String line, PlayerEventsConfiguration pec){
        String strValue = line.split("=")[1];
        boolean value = Boolean.parseBoolean(strValue.trim());
        if(line.trim().startsWith("deathEnabled")){
            pec.deathEnabled = value;
        }
        else if(line.trim().startsWith("bedEnterEnabled")){
            pec.bedEnterEnabled = value;
        }
        else if(line.trim().startsWith("bedLeaveEnabled")){
            pec.bedLeaveEnabled = value;
        }
        else if(line.trim().startsWith("bucketEmptyEnabled")){
            pec.bucketEmptyEnabled = value;
        }
        else if(line.trim().startsWith("bucketFillEnabled")){
            pec.bucketFillEnabled = value;
        }
        else if(line.trim().startsWith("changedWorldEnabled")){
            pec.changedWorldEnabled = value;
        }
        else if(line.trim().startsWith("chatEnabled")){
            pec.chatEnabled = value;
        }
        else if(line.trim().startsWith("commandPreprocessEnabled")){
            pec.commandPreprocessEnabled = value;
        }
        else if(line.trim().startsWith("dropItemEnabled")){
            pec.dropItemEnabled = value;
        }
        else if(line.trim().startsWith("eggThrowEnabled")){
            pec.eggThrowEnabled = value;
        }
        else if(line.trim().startsWith("expChangeEnabled")){
            pec.expChangeEnabled = value;
        }
        else if(line.trim().startsWith("fishEnabled")){
            pec.fishEnabled = value;
        }
        else if(line.trim().startsWith("gameModeChangeEnabled")){
            pec.gameModeChangeEnabled = value;
        }
        else if(line.trim().startsWith("interactEntityEnabled")){
            pec.interactEntityEnabled = value;
        }
        else if(line.trim().startsWith("interactEnabled")){
            pec.interactEnabled = value;
        }
        else if(line.trim().startsWith("inventoryEnabled")){
            pec.inventoryEnabled = value;
        }
        else if(line.trim().startsWith("itemHeldEnabled")){
            pec.itemHeldEnabled = value;
        }
        else if(line.trim().startsWith("joinEnabled")){
            pec.joinEnabled = value;
        }
        else if(line.trim().startsWith("kickEnabled")){
            pec.kickEnabled = value;
        }
        else if(line.trim().startsWith("levelChangeEnabled")){
            pec.levelChangeEnabled = value;
        }
        else if(line.trim().startsWith("loginEnabled")){
            pec.loginEnabled = value;
        }
        else if(line.trim().startsWith("moveEnabled")){
            pec.moveEnabled = value;
        }
        else if(line.trim().startsWith("pickupItemEnabled")){
            pec.pickupItemEnabled = value;
        }
        else if(line.trim().startsWith("portalEnabled")){
            pec.portalEnabled = value;
        }
        else if(line.trim().startsWith("preLoginEnabled")){
            pec.preLoginEnabled = value;
        }
        else if(line.trim().startsWith("quitEnabled")){
            pec.quitEnabled = value;
        }
        else if(line.trim().startsWith("respawnEnabled")){
            pec.respawnEnabled = value;
        }
        else if(line.trim().startsWith("shearEntityEnabled")){
            pec.shearEntityEnabled = value;
        }
        else if(line.trim().startsWith("teleportEnabled")){
            pec.teleportEnabled = value;
        }
        else if(line.trim().startsWith("toggleSneakEnabled")){
            pec.toggleSneakEnabled = value;
        }
        else if(line.trim().startsWith("toggleSprintEnabled")){
            pec.toggleSprintEnabled = value;
        }
        else if(line.trim().startsWith("velocityEnabled")){
            pec.velocityEnabled = value;
        }
    }
}
