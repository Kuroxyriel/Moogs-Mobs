package com.finndog.moogsmobs.event;

import com.finndog.moogsmobs.MoogsMobs;
import com.finndog.moogsmobs.entity.ModEntityTypes;
import com.finndog.moogsmobs.entity.custom.ChomperEntity;
import com.finndog.moogsmobs.entity.custom.GlowBugEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = MoogsMobs.MODID)
    public static class ForgeEvents {

    }

    @Mod.EventBusSubscriber(modid = MoogsMobs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.CHOMPER.get(), ChomperEntity.setAttributes());
            event.put(ModEntityTypes.GLOWBUG.get(), GlowBugEntity.setAttributes());
        }
    }
}