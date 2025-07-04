package com.necolian.extracircuits.datagen.model;

import com.necolian.extracircuits.ExtraCircuits;
import com.necolian.extracircuits.block.ExtraCircuitsBlocks;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ExtraCircuitsBlockStateProvider extends BlockStateProvider {
    public ExtraCircuitsBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ExtraCircuits.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        normalMachineHorizontalFacingBlockWIthRotations(ExtraCircuitsBlocks.precision_assembling_machine_tier1.get());
        normalMachineHorizontalFacingBlockWIthRotations(ExtraCircuitsBlocks.precision_assembling_machine_tier2.get());
        normalMachineHorizontalFacingBlockWIthRotations(ExtraCircuitsBlocks.precision_assembling_machine_tier3.get());
        normalMachineHorizontalFacingBlockWIthRotations(ExtraCircuitsBlocks.precision_assembling_machine_tier4.get());
        normalMachineHorizontalFacingBlockWIthRotations(ExtraCircuitsBlocks.precision_assembling_machine_tier5.get());
    }

    private void normalMachineHorizontalFacingBlockWIthRotations(Block block){
        String[] name = ExtraCircuitsBlocks.getBlockName(block).split("_");

        String hoge = Arrays.stream(name, 0, name.length - 1)
                .collect(Collectors.joining("_"));
        String[] fuga = hoge.split(":");

        String machineName = fuga.length > 1 ? fuga[1] : hoge;
        String tier = name[name.length - 1];

        horizontalFacingBlockWithRotations(
                block,
                new String[] {
                        "block/machine/machine_bottom",
                        "block/machine/machine_top",
                        "block/machine/" + tier + "/" + machineName,
                        "block/machine/" + tier + "/back",
                        "block/machine/" + tier + "/side",
                        "block/machine/" + tier + "/side"
                });

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


        horizontalBlock(block, model);
        simpleBlockItem(block, model);
    }
}
