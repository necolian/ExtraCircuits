package com.necolian.extracircuits.block.gui.container;

import com.necolian.extracircuits.ExtraCircuits;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ExtraCircuitsContainerTypes {

    public static final DeferredRegister<MenuType<?>> MENU_TYPES = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ExtraCircuits.MODID);

    public static final RegistryObject<MenuType<PAMMenu>> precision_assembling_machine = MENU_TYPES.register("precision_assembling_machine", () -> set(PAMMenu::new));
    private static <T extends AbstractContainerMenu> MenuType<T> set(MenuType.MenuSupplier<T> supplier){
        return new MenuType<>(supplier, FeatureFlags.REGISTRY.allFlags());
    }

    public static void resister(IEventBus eventBus) {
        MENU_TYPES.register(eventBus);
    }
}
