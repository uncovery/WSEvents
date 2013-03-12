package com.github.websend.events.configuration;

public class WeatherEventsConfiguration extends Configuration {

    @Override
    public String getFilename() {
        return "weather.txt";
    }

    @Override
    public String[] getEventNameList() {
        return new String[]{
                    "LightningStrikeEvent",
                    "ThunderChangeEvent",
                    "WeatherChangeEvent",
                    "WeatherEvent"
                };
    }
}
