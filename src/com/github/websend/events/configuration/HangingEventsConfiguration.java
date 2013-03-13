package com.github.websend.events.configuration;

public class HangingEventsConfiguration extends Configuration {

    @Override
    public String getFilename() {
        return "hanging.txt";
    }

    @Override
    public String[] getEventNameList() {
        return new String[]{
                    "HangingBreakByEntityEvent",
                    "HangingBreakEvent",
                    "HangingPlaceEvent"
                };
    }
}
