package com.necolian.extracircuits.recipes.PAM;

import com.necolian.extracircuits.recipes.ExtraCircuitsRecipeSerializer;
import com.necolian.extracircuits.recipes.ExtraCircuitsRecipeTypes;
import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class PAMRecipe implements Recipe<Container> {
    public record IngredientWithCount(Ingredient ingredient, int count) {}

    private final ResourceLocation id;
    private final List<IngredientWithCount> ingredients;
    private final ItemStack result;
    private final int requiredTier;
    private final int processingTime;

    public PAMRecipe(ResourceLocation id, List<IngredientWithCount> ingredients, ItemStack result, int requiredTier, int processingTime) {
        this.id = id;
        this.ingredients = ingredients;
        this.result = result;
        this.requiredTier = requiredTier;
        this.processingTime = processingTime;
    }

    public int getRequiredTier() {
        return requiredTier;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    @Override
    public boolean matches(Container inv, Level level) {
        for (int i = 0; i < ingredients.size(); i++) {
            IngredientWithCount ing = ingredients.get(i);
            ItemStack stack = inv.getItem(i);

            if (!ing.ingredient().test(stack) || stack.getCount() < ing.count()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public ItemStack assemble(Container pContainer, RegistryAccess pRegistryAccess) {
        return result.copy();
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResultItem(@Nullable RegistryAccess pRegistryAccess) {
        return result;
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ExtraCircuitsRecipeSerializer.precision_assembling.get();
    }

    @Override
    public RecipeType<?> getType() {
        return ExtraCircuitsRecipeTypes.precision_assembling.get();
    }

    public List<IngredientWithCount> getIngredientsWithCount() {
        return ingredients;
    }
}