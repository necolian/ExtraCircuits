package com.necolian.extracircuits.recipes;

import com.necolian.extracircuits.ExtraCircuits;
import com.necolian.extracircuits.recipes.PAM.PAMRecipe;
import com.necolian.extracircuits.recipes.PAM.PAMRecipeSerializer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ExtraCircuitsRecipeSerializer {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, ExtraCircuits.MODID);

    public static final RegistryObject<RecipeSerializer<PAMRecipe>> precision_assembling =
            SERIALIZERS.register("precision_assembling", PAMRecipeSerializer::new);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
