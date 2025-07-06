package com.necolian.extracircuits.block.machine;

import com.necolian.extracircuits.ExtraCircuits;
import com.necolian.extracircuits.block.ExtraCircuitsBlocks;
import com.necolian.extracircuits.block.machine.pam.PAMBlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ExtraCircuitsBlockEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPE = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ExtraCircuits.MODID);

    public static final RegistryObject<BlockEntityType<PAMBlockEntity>> precision_assembling_machine = BLOCK_ENTITY_TYPE.register("precision_assembling_machine",
            () -> set(PAMBlockEntity::new,
                    ExtraCircuitsBlocks.precision_assembling_machine_tier1.get()));

    private static <T extends BlockEntity> BlockEntityType<T> set (BlockEntityType.BlockEntitySupplier<T> entity, Block block) {
        return BlockEntityType.Builder.of(entity, block).build(null);
    }

    public static void resister(IEventBus eventBus) {
        BLOCK_ENTITY_TYPE.register(eventBus);
    }
}
