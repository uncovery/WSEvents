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
                    "VehicleCollisionEvent",
                    "VehicleCreateEvent",
                    "VehicleDamageEvent",
                    "VehicleDestroyEvent",
                    "VehicleEnterEvent",
                    "VehicleEntityCollisionEvent",
                    "VehicleEvent",
                    "VehicleExitEvent",
                    "VehicleMoveEvent",
                    "VehicleUpdateEvent"
                };
    }
}
