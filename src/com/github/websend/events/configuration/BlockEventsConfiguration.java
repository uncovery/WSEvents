package com.github.websend.events.configuration;

public class BlockEventsConfiguration extends Configuration {

    @Override
    public String getFilename() {
        return "block.txt";
    }

    @Override
    public String[] getEventNameList() {
        return new String[]{
                    "BlockBreakEvent",
                    "BlockBurnEvent",
                    "BlockCanBuildEvent",
                    "BlockDamageEvent",
                    "BlockDispenseEvent",
                    "BlockExpEvent",
                    "BlockFadeEvent",
                    "BlockFormEvent",
                    "BlockFromToEvent",
                    "BlockGrowEvent",
                    "BlockIgniteEvent",
                    "BlockPhysicsEvent",
                    "BlockPistonExtendEvent",
                    "BlockPistonRetractEvent",
                    "BlockPlaceEvent",
                    "BlockRedstoneEvent",
                    "BlockSpreadEvent",
                    "EntityBlockFormEvent",
                    "LeavesDecayEvent",
                    "NotePlayEvent",
                    "SignChangeEvent"
                };
    }
}
