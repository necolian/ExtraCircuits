package com.necolian.extracircuits.recipes.PAM;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;

import java.util.ArrayList;
import java.util.List;

public class PAMRecipeSerializer implements RecipeSerializer<PAMRecipe> {

    @Override
    public PAMRecipe fromJson(ResourceLocation id, JsonObject json) {
        JsonArray ingredientsJson = GsonHelper.getAsJsonArray(json, "ingredients");
        List<PAMRecipe.IngredientWithCount> ingredients = new ArrayList<>();

        for (int i = 0; i < ingredientsJson.size(); i++) {
            JsonObject ingJson = ingredientsJson.get(i).getAsJsonObject();
            Ingredient ing = Ingredient.fromJson(ingJson.get("item"));
            int count = ingJson.has("count") ? ingJson.get("count").getAsInt() : 1;
            ingredients.add(new PAMRecipe.IngredientWithCount(ing, count));
        }

        ItemStack result = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "result"));
        int tier = GsonHelper.getAsInt(json, "tier");
        int time = GsonHelper.getAsInt(json, "processingTime");

        return new PAMRecipe(id, ingredients, result, tier, time);
    }

    @Override
    public PAMRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
        int size = buf.readVarInt();
        List<PAMRecipe.IngredientWithCount> ingredients = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Ingredient ing = Ingredient.fromNetwork(buf);
            int count = buf.readVarInt();
            ingredients.add(new PAMRecipe.IngredientWithCount(ing, count));
        }

        ItemStack result = buf.readItem();
        int tier = buf.readVarInt();
        int time = buf.readVarInt();

        return new PAMRecipe(id, ingredients, result, tier, time);
    }

    @Override
    public void toNetwork(FriendlyByteBuf buf, PAMRecipe recipe) {
        buf.writeVarInt(recipe.getIngredientsWithCount().size());
        for (PAMRecipe.IngredientWithCount ing : recipe.getIngredientsWithCount()) {
            ing.ingredient().toNetwork(buf);
            buf.writeVarInt(ing.count());
        }

        buf.writeItem(recipe.getResultItem(null));
        buf.writeVarInt(recipe.getRequiredTier());
        buf.writeVarInt(recipe.getProcessingTime());
    }
}
