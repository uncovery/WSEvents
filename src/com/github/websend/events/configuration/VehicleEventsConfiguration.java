package com.github.websend.events.configuration;

public class VehicleEventsConfiguration extends Configuration {

    @Override
    public String getFilename() {
        return "vehicle.txt";
    }

    @Override
    public String[] getEventNameList() {
        return new String[]{
                    "VehicleBlockCollisionEvent",
                    "VehicleCreateEvent",
                    "VehicleDamageEvent",
                    "VehicleDestroyEvent",
                    "VehicleEnterEvent",
                    "VehicleEntityCollisionEvent",
                    "VehicleExitEvent",
                    "VehicleMoveEvent",
                    "VehicleUpdateEvent"
                };
    }
}
