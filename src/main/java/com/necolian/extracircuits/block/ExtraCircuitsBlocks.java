package com.necolian.extracircuits.block;

import com.necolian.extracircuits.ExtraCircuits;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ExtraCircuitsBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, ExtraCircuits.MODID);

    public static final RegistryObject<Block> precision_assembling_machine_tier1 = BLOCKS.register("precision_assembling_machine_tier1",
            () -> new AutoRotateBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f)));
    public static final RegistryObject<Block> precision_assembling_machine_tier2 = BLOCKS.register("precision_assembling_machine_tier2",
            () -> new AutoRotateBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f)));
    public static final RegistryObject<Block> precision_assembling_machine_tier3 = BLOCKS.register("precision_assembling_machine_tier3",
            () -> new AutoRotateBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f)));
    public static final RegistryObject<Block> precision_assembling_machine_tier4 = BLOCKS.register("precision_assembling_machine_tier4",
            () -> new AutoRotateBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f)));
    public static final RegistryObject<Block> precision_assembling_machine_tier5 = BLOCKS.register("precision_assembling_machine_tier5",
            () -> new AutoRotateBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f)));

    public static void resister(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    public static String getBlockName(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block).toString();
    }
}
