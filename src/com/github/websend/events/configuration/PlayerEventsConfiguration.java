package com.github.websend.events.configuration;

public class PlayerEventsConfiguration extends Configuration {

    @Override
    public String getFilename() {
        return "player.txt";
    }

    @Override
    public String[] getEventNameList() {
        return new String[]{
                    "AsyncPlayerChatEvent",
                    "AsyncPlayerPreLoginEvent",
                    "PlayerAnimationEvent",
                    "PlayerBedEnterEvent",
                    "PlayerBedLeaveEvent",
                    "PlayerBucketEmptyEvent",
                    "PlayerBucketFillEvent",
                    "PlayerChangedWorldEvent",
                    "PlayerChannelEvent",
                    "PlayerChatEvent",
                    "PlayerChatTabCompleteEvent",
                    "PlayerCommandPreprocessEvent",
                    "PlayerDropItemEvent",
                    "PlayerEggThrowEvent",
                    "PlayerExpChangeEvent",
                    "PlayerFishEvent",
                    "PlayerGameModeChangeEvent",
                    "PlayerInteractEntityEvent",
                    "PlayerInteractEvent",
                    "PlayerInventoryEvent",
                    "PlayerItemBreakEvent",
                    "PlayerItemHeldEvent",
                    "PlayerJoinEvent",
                    "PlayerKickEvent",
                    "PlayerLevelChangeEvent",
                    "PlayerLoginEvent",
                    "PlayerMoveEvent",
                    "PlayerPickupItemEvent",
                    "PlayerPortalEvent",
                    "PlayerPreLoginEvent",
                    "PlayerQuitEvent",
                    "PlayerRegisterChannelEvent",
                    "PlayerRespawnEvent",
                    "PlayerShearEntityEvent",
                    "PlayerTeleportEvent",
                    "PlayerToggleFlightEvent",
                    "PlayerToggleSneakEvent",
                    "PlayerToggleSprintEvent",
                    "PlayerUnregisterChannelEvent",
                    "PlayerVelocityEvent"};
    }
}
