package com.necolian.extracircuits.datagen;

import com.necolian.extracircuits.ExtraCircuits;
import com.necolian.extracircuits.datagen.language.ENUSLanguageProvider;
import com.necolian.extracircuits.datagen.language.JAJPLanguageProvider;
import com.necolian.extracircuits.datagen.model.ExtraCircuitsItemModelProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = ExtraCircuits.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExtraCircuitsDataProvider {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new ENUSLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new JAJPLanguageProvider(packOutput));

        generator.addProvider(event.includeClient(), new ExtraCircuitsItemModelProvider(packOutput, existingFileHelper));
    }
}
