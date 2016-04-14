/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.policies.meat;

import java.util.HashSet;
import nebuladevelopment.skillproject.skills.cooking.recipes.meat.base.MeatRecipe;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.IRecipePolicy;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.implementation.RecipePolicy;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.meat.collection.MeatRecipeCollection;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class MeatRecipePolicy extends RecipePolicy<MeatRecipe> implements IRecipePolicy<MeatRecipe>
{
    private final MeatRecipeCollection recipeCollection;

    public MeatRecipePolicy()
    {
        this.recipeCollection = new MeatRecipeCollection();
    }

    @Override
    public HashSet<MeatRecipe> getRecipePolicy()
    {
        return this.getRecipes(this.recipeCollection.getRecipes());
    }
}
