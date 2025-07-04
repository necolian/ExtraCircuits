package com.necolian.extracircuits;

import com.necolian.extracircuits.item.ExtraCircuitsItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ExtraCircuitsCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB_REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExtraCircuits.MODID);

    public static final RegistryObject<CreativeModeTab> main = CREATIVE_MODE_TAB_REGISTER.register("extra_circuits",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ExtraCircuitsItems.basis.get()))
                    .title(Component.literal("Extra Circuits"))
                    .displayItems((parameters, output) ->
                            ExtraCircuitsItems.ITEMS.getEntries()
                                    .forEach(item ->
                                            output.accept(item.get())))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB_REGISTER.register(eventBus);
    }
}
