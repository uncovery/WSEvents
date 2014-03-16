package com.github.websend.events.configuration;

public class InventoryEventsConfiguration extends Configuration {

    @Override
    public String getFilename() {
        return "inventory.txt";
    }

    @Override
    public String[] getEventNameList() {
        return new String[]{
                    "BrewEvent",
                    "CraftItemEvent",
                    "FurnaceBurnEvent",
                    "FurnaceExtractEvent",
                    "FurnaceSmeltEvent",
                    "InventoryClickEvent",
                    "InventoryCloseEvent",
                    "InventoryCreativeEvent",
                    "InventoryDragEvent",
                    "InventoryInteractEvent",
                    "InventoryMoveItemEvent",
                    "InventoryOpenEvent",
                    "InventoryPickupItemEvent",
                    "PrepareItemCraftEvent"};
    }
}
