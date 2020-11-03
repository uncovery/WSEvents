package com.github.websend.events.configuration;

import com.github.websend.events.listener.AdvancementListener;

public class AdvancementEventsConfiguration  extends Configuration<AdvancementListener> {

    @Override
    public String getFilename() {
        return "advancement.txt";
    }

    @Override
    public String[] getEventNameList() {
        return new String[]{
                    "PlayerAdvancementDoneEvent",
                };
    }

}
