package com.necolian.extracircuits.datagen.model;

import com.necolian.extracircuits.ExtraCircuits;
import com.necolian.extracircuits.block.ExtraCircuitsBlocks;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.List;

public class ExtraCircuitsBlockStateProvider extends BlockStateProvider {
    public ExtraCircuitsBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ExtraCircuits.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        horizontalFacingBlockWithRotations(ExtraCircuitsBlocks.precision_assembling_machine_tier1.get(), null);
    }

    private void normalMachineHorizontalFacingBlockWithRotations(Block block) {
        String name = ExtraCircuitsBlocks.getBlockName(block);

        String[] Directory = {
                "block/",
                "block/",
                "block/",
                "block/",
                "block/",
                "block/"
        };

        horizontalFacingBlockWithRotations(block, Directory);
    }


    private void horizontalFacingBlockWithRotations(Block block, String[] Directory) {
        String name = ExtraCircuitsBlocks.getBlockName(block);

        ModelFile model = models().cube(name,
                modLoc(Directory[0]), //下
                modLoc(Directory[1]), //上
                modLoc(Directory[2]), //北
                modLoc(Directory[3]), //南
                modLoc(Directory[4]), //西
                modLoc(Directory[5])); //東

        getVariantBuilder(block)
                .forAllStates(state -> {
                    Direction facing = state.getValue(HorizontalDirectionalBlock.FACING);
                    int yRot = (int) facing.toYRot();

                    return ConfiguredModel.builder()
                            .modelFile(model)
                            .rotationY(yRot)
                            .build();
                });

        simpleBlockItem(block, model);
    }
}
