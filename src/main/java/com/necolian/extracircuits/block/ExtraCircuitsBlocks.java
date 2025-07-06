package com.necolian.extracircuits.block;

import com.necolian.extracircuits.ExtraCircuits;
import com.necolian.extracircuits.block.machine.pam.PAM;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ExtraCircuitsBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, ExtraCircuits.MODID);

    public static final RegistryObject<Block> precision_assembling_machine_tier1 = BLOCKS.register("precision_assembling_machine_tier1",
            () -> new PAM(1));
    public static final RegistryObject<Block> precision_assembling_machine_tier2 = BLOCKS.register("precision_assembling_machine_tier2",
            () -> new PAM(2));
    public static final RegistryObject<Block> precision_assembling_machine_tier3 = BLOCKS.register("precision_assembling_machine_tier3",
            () -> new PAM(3));
    public static final RegistryObject<Block> precision_assembling_machine_tier4 = BLOCKS.register("precision_assembling_machine_tier4",
            () -> new PAM(4));
    public static final RegistryObject<Block> precision_assembling_machine_tier5 = BLOCKS.register("precision_assembling_machine_tier5",
            () -> new PAM(5));

    public static void resister(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    public static String getBlockName(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block).toString();
    }
}
