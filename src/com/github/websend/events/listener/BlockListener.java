package com.github.websend.events.listener;

import com.github.websend.Main;
import com.github.websend.events.configuration.BlockEventsConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;

public class BlockListener implements Listener{
    BlockEventsConfiguration config = null;

    public BlockListener(BlockEventsConfiguration config) {
        this.config = config;
    } 
    
    public void onEvent(BlockBreakEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(BlockBurnEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(BlockCanBuildEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(BlockDamageEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(BlockDispenseEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(BlockEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(BlockExpEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(BlockFadeEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(BlockFormEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(BlockFromToEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(BlockGrowEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(BlockIgniteEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(BlockPhysicsEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(BlockPistonEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(BlockPistonExtendEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(BlockPistonRetractEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(BlockPlaceEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(BlockRedstoneEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(BlockSpreadEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(EntityBlockFormEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(LeavesDecayEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(NotePlayEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }

    public void onEvent(SignChangeEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_BLOCK");
        }
    }
}
