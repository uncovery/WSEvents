package com.github.websend.events.configuration;

public class ServerEventsConfiguration extends Configuration {

    @Override
    public String getFilename() {
        return "server.txt";
    }

    @Override
    public String[] getEventNameList() {
        return new String[]{
                    "MapInitializeEvent",
                    "PluginDisableEvent",
                    "PluginEnableEvent",
                    "PluginEvent",
                    "RemoteServerCommandEvent",
                    "ServerCommandEvent",
                    "ServerEvent",
                    "ServerListPingEvent",
                    "ServiceEvent",
                    "ServiceRegisterEvent",
                    "ServiceUnregisterEvent"
                };
    }
}
