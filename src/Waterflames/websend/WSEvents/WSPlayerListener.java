package Waterflames.websend.WSEvents;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.*;
import Waterflames.websend.Main;

public class WSPlayerListener implements Listener{
    Configuration config = Waterflames.websend.WSEvents.Main.config;
    
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e){
        if(config.getPlayerConfiguration().bedEnterEnabled){
            String[] array = {"event", "death"};
            Main.doCommand(array, ((Player)e.getEntity()).getName());
        }
    }
    
    @EventHandler
    public void onPlayerBedEnter(PlayerBedEnterEvent e){
        if(config.getPlayerConfiguration().bedEnterEnabled){
            String[] array = {"event", "bedEnter"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    
    @EventHandler
    public void onPlayerBedLeave(PlayerBedLeaveEvent e){
        if(config.getPlayerConfiguration().bedLeaveEnabled){
            String[] array = {"event", "bedLeave"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    
    @EventHandler
    public void onPlayerBucketEmpty(PlayerBucketEmptyEvent e){
        if(config.getPlayerConfiguration().bucketEmptyEnabled){
            String[] array = {"event", "bucketEmpty"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    
    @EventHandler
    public void onPlayerBucketFill(PlayerBucketFillEvent e){
        if(config.getPlayerConfiguration().bucketFillEnabled){
            String[] array = {"event", "bucketFill"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    
    @EventHandler
    public void onPlayerChangedWorld(PlayerChangedWorldEvent e){
        if(config.getPlayerConfiguration().changedWorldEnabled){
            String[] array = {"event", "changedWorld"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    
    //@EventHandler
    //public void onPlayerChat(PlayerChatEvent e){
    //    if(config.getPlayerConfiguration().chatEnabled){
    //        String[] array = {"event", "chatEnabled"};
    //        Main.doCommand(array, e.getPlayer());
    //    }
    //}
    
    @EventHandler
    public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent e){
        if(config.getPlayerConfiguration().commandPreprocessEnabled){
            String[] array = {"event", "commandPreprocess"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    
    @EventHandler
    public void onPlayerDropItem(PlayerDropItemEvent e){
        if(config.getPlayerConfiguration().dropItemEnabled){
            String[] array = {"event", "dropItem"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    
    @EventHandler
    public void onPlayerEggThrow(PlayerEggThrowEvent e){
        if(config.getPlayerConfiguration().eggThrowEnabled){
            String[] array = {"event", "eggThrow"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    
    @EventHandler
    public void onPlayerExpChange(PlayerExpChangeEvent e){
        if(config.getPlayerConfiguration().expChangeEnabled){
            String[] array = {"event", "expChange"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    @EventHandler
    public void onPlayerFish(PlayerFishEvent e){
        if(config.getPlayerConfiguration().fishEnabled){
            String[] array = {"event", "fish"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    
    @EventHandler
    public void onPlayerGameModeChange(PlayerGameModeChangeEvent e){
        if(config.getPlayerConfiguration().gameModeChangeEnabled){
            String[] array = {"event", "gameModeChange"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    
    @EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent e){
        if(config.getPlayerConfiguration().interactEntityEnabled){
            String[] array = {"event", "interactEntity"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e){
        if(config.getPlayerConfiguration().interactEnabled){
            String[] array = {"event", "interact"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    //@EventHandler
    //public void onPlayerInventory(PlayerInventoryEvent e){
    //    if(config.getPlayerConfiguration().inventoryEnabled){
    //        String[] array = {"event", "inventory"};
    //        Main.doCommand(array, e.getPlayer());
    //    }
    //}
    @EventHandler
    public void onPlayerItemHeld(PlayerItemHeldEvent e){
        if(config.getPlayerConfiguration().itemHeldEnabled){
            String[] array = {"event", "itemHeld"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        if(config.getPlayerConfiguration().joinEnabled){
            String[] array = {"event", "join"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    @EventHandler
    public void onPlayerKick(PlayerKickEvent e){
        if(config.getPlayerConfiguration().kickEnabled){
            String[] array = {"event", "kick"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    @EventHandler
    public void onPlayerLevelChange(PlayerLevelChangeEvent e){
        if(config.getPlayerConfiguration().levelChangeEnabled){
            String[] array = {"event", "levelChange"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    @EventHandler
    public void onPlayerLogin(PlayerLoginEvent e){
        if(config.getPlayerConfiguration().loginEnabled){
            String[] array = {"event", "login"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e){
        if(config.getPlayerConfiguration().moveEnabled){
            String[] array = {"event", "move"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    @EventHandler
    public void onPlayerPickupItem(PlayerPickupItemEvent e){
        if(config.getPlayerConfiguration().pickupItemEnabled){
            String[] array = {"event", "pickupItem"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    @EventHandler
    public void onPlayerPortal(PlayerPortalEvent e){
        if(config.getPlayerConfiguration().portalEnabled){
            String[] array = {"event", "portal"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    //@EventHandler
    //public void onPlayerPreLogin(PlayerPreLoginEvent e){
    //    if(config.getPlayerConfiguration().preLoginEnabled){
    //        String[] array = {"event", "preLogin"};
    //        Main.doCommand(array, e.getName());
    //    }
    //}
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e){
        if(config.getPlayerConfiguration().quitEnabled){
            String[] array = {"event", "quit"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent e){
        if(config.getPlayerConfiguration().respawnEnabled){
            String[] array = {"event", "respawn"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    @EventHandler
    public void onPlayerShearEntity(PlayerShearEntityEvent e){
        if(config.getPlayerConfiguration().shearEntityEnabled){
            String[] array = {"event", "shearEntity"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    @EventHandler
    public void onPlayerTeleport(PlayerTeleportEvent e){
        if(config.getPlayerConfiguration().teleportEnabled){
            String[] array = {"event", "teleport"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    @EventHandler
    public void onPlayerToggleSneak(PlayerToggleSneakEvent e){
        if(config.getPlayerConfiguration().toggleSneakEnabled){
            String[] array = {"event", "toggleSneak"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    
    @EventHandler
    public void onPlayerToggleSprint(PlayerToggleSprintEvent e){
        if(config.getPlayerConfiguration().toggleSprintEnabled){
            String[] array = {"event", "toggleSprint"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    
    @EventHandler
    public void onPlayerVelocity(PlayerVelocityEvent e){
        if(config.getPlayerConfiguration().velocityEnabled){
            String[] array = {"event", "velocity"};
            Main.doCommand(array, e.getPlayer());
        }
    }
    
    public void onCustomEvent(String eventName, Player player){
        String[] array = {"event", eventName};
            Main.doCommand(array, player);
    }
}
