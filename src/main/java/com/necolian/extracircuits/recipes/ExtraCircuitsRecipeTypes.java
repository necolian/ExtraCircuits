package com.necolian.extracircuits.recipes;

import com.necolian.extracircuits.ExtraCircuits;
import com.necolian.extracircuits.recipes.PAM.PAMRecipe;
import com.necolian.extracircuits.recipes.PAM.PAMRecipeType;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ExtraCircuitsRecipeTypes<T extends Recipe<?>> implements RecipeType<T> {
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES =
            DeferredRegister.create(Registries.RECIPE_TYPE, ExtraCircuits.MODID);

    public static final RegistryObject<RecipeType<PAMRecipe>> precision_assembling =
            RECIPE_TYPES.register("precision_assembling", PAMRecipeType::new);

    public static void register(IEventBus eventBus) {
        RECIPE_TYPES.register(eventBus);
    }
}