/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.rules.base.implementation;

import java.util.HashSet;
import java.util.function.Supplier;
import nebuladevelopment.skillproject.skills.cooking.recipes.base.IRecipe;
import nebuladevelopment.skillproject.skills.cooking.recipes.base.IRecipeCollector;
import nebuladevelopment.skillproject.skills.cooking.recipes.base.implementation.RecipeCollector;
import nebuladevelopment.skillproject.skills.cooking.rules.base.IRecipePolicy;

/**
 *
 * @author Ivo Huntjens, I.J.
 * @param <T>
 */
public abstract class RecipePolicy<T extends IRecipe> implements IRecipePolicy<T>
{
    private final IRecipeCollector<T> recipeCollector;

    public RecipePolicy()
    {
        this.recipeCollector = new RecipeCollector<>();
    }

    @Override
    public HashSet<T> getRecipePolicy(Supplier<T>... recipeRules)
    {
        return this.recipeCollector.mergeRecipes(recipeRules);
    }
}
