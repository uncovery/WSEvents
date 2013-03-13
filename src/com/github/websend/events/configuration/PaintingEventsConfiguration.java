package com.github.websend.events.configuration;

public class PaintingEventsConfiguration extends Configuration {

    @Override
    public String getFilename() {
        return "painting.txt";
    }

    @Override
    public String[] getEventNameList() {
        return new String[]{
                    "PaintingBreakByEntityEvent",
                    "PaintingBreakEvent",
                    "PaintingPlaceEvent"
                };
    }
}
