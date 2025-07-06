package com.necolian.extracircuits.recipes.PAM;

import com.necolian.extracircuits.ExtraCircuits;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;

public class PAMRecipeType<T extends Recipe<?>> implements RecipeType<T> {
    @Override
    public String toString() {
        return ExtraCircuits.MODID + ":precision_assembling";
    }
}