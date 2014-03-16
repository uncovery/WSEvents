package com.github.websend.events.configuration;

public class WorldEventsConfiguration extends Configuration {

    @Override
    public String getFilename() {
        return "world.txt";
    }

    @Override
    public String[] getEventNameList() {
        return new String[]{
                    "ChunkEvent",
                    "ChunkLoadEvent",
                    "ChunkPopulateEvent",
                    "ChunkUnloadEvent",
                    "PortalCreateEvent",
                    "SpawnChangeEvent",
                    "StructureGrowEvent",
                    "WorldInitEvent",
                    "WorldLoadEvent",
                    "WorldSaveEvent",
                    "WorldUnloadEvent"
                };
    }
}
