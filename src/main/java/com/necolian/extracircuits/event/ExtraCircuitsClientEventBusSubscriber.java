package com.necolian.extracircuits.event;

import com.necolian.extracircuits.ExtraCircuits;
import com.necolian.extracircuits.block.gui.container.ExtraCircuitsContainerTypes;
import com.necolian.extracircuits.block.gui.screen.PAMBlockScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ExtraCircuits.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ExtraCircuitsClientEventBusSubscriber {
    @SubscribeEvent
    public static void cleanSetup(FMLClientSetupEvent event) {
        blockScreenRegister();
    }

    private static void blockScreenRegister() {
        MenuScreens.register(ExtraCircuitsContainerTypes.precision_assembling_machine.get(), PAMBlockScreen::new);
    }

}
