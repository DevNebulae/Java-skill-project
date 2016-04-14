/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.policies.fish;

import java.util.HashSet;
import nebuladevelopment.skillproject.skills.cooking.recipes.fish.base.FishRecipe;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.IRecipePolicy;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.implementation.RecipePolicy;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.fish.collection.FishRecipeCollection;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class FishRecipePolicy extends RecipePolicy<FishRecipe> implements IRecipePolicy<FishRecipe>
{
    private final FishRecipeCollection recipeCollection;

    public FishRecipePolicy()
    {
        this.recipeCollection = new FishRecipeCollection();
    }

    @Override
    public HashSet<FishRecipe> getRecipePolicy()
    {
        return this.getRecipes(this.recipeCollection.getRecipes());
    }
}
