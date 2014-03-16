package com.github.websend.events.configuration;

public class EnchantmentEventsConfiguration extends Configuration {

    @Override
    public String getFilename() {
        return "enchantment.txt";
    }

    @Override
    public String[] getEventNameList() {
        return new String[]{
                    "EnchantItemEvent",
                    "PrepareItemEnchantEvent"
                };
    }
}
