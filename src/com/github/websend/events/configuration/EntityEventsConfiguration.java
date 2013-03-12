package com.github.websend.events.configuration;

public class EntityEventsConfiguration extends Configuration {

    @Override
    public String getFilename() {
        return "entity.txt";
    }

    @Override
    public String[] getEventNameList() {
        return new String[]{
                    "CreatureSpawnEvent",
                    "CreeperPowerEvent",
                    "EntityBreakDoorEvent",
                    "EntityChangeBlockEvent",
                    "EntityCombustByBlockEvent",
                    "EntityCombustByEntityEvent",
                    "EntityCombustEvent",
                    "EntityCreatePortalEvent",
                    "EntityDamageByBlockEvent",
                    "EntityDamageByEntityEvent",
                    "EntityDamageEvent",
                    "EntityDeathEvent",
                    "EntityEvent",
                    "EntityExplodeEvent",
                    "EntityInteractEvent",
                    "EntityPortalEnterEvent",
                    "EntityPortalEvent",
                    "EntityPortalExitEvent",
                    "EntityRegainHealthEvent",
                    "EntityShootBowEvent",
                    "EntityTameEvent",
                    "EntityTargetEvent",
                    "EntityTargetLivingEntityEvent",
                    "EntityTeleportEvent",
                    "ExpBottleEvent",
                    "ExplosionPrimeEvent",
                    "FoodLevelChangeEvent",
                    "ItemDespawnEvent",
                    "ItemSpawnEvent",
                    "PigZapEvent",
                    "PlayerDeathEvent",
                    "PotionSplashEvent",
                    "ProjectileHitEvent",
                    "ProjectileLaunchEvent",
                    "SheepDyeWoolEvent",
                    "SheepRegrowWoolEvent",
                    "SlimeSplitEvent"
                };
    }
}
