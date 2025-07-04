package com.necolian.extracircuits;

import com.mojang.logging.LogUtils;
import com.necolian.extracircuits.block.ExtraCircuitsBlocks;
import com.necolian.extracircuits.item.ExtraCircuitsItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExtraCircuits.MODID)
public class ExtraCircuits {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "extracircuits";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public ExtraCircuits() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ExtraCircuitsItems.register(modEventBus);
        ExtraCircuitsBlocks.resister(modEventBus);
        ExtraCircuitsCreativeTab.register(modEventBus);
    }
}
