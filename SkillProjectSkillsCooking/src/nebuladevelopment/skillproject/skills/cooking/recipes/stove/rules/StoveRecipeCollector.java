/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.stove.rules;

import java.util.HashSet;
import java.util.function.Supplier;
import nebuladevelopment.skillproject.skills.cooking.recipes.base.IRecipeBundler;
import nebuladevelopment.skillproject.skills.cooking.recipes.base.IRecipeCollector;
import nebuladevelopment.skillproject.skills.cooking.recipes.base.implementation.RecipeBundler;
import nebuladevelopment.skillproject.skills.cooking.recipes.base.implementation.RecipeCollector;
import nebuladevelopment.skillproject.skills.cooking.recipes.stove.StoveRecipe;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class StoveRecipeCollector
{
    private final IRecipeBundler<StoveRecipe> recipeCollector;
    private final IRecipeCollector<StoveRecipe> recipeMerger;
    private final HashSet<StoveRecipe> stoveRecipes;
    
    public StoveRecipeCollector()
    {
        this.recipeCollector = new RecipeBundler<>();
        this.recipeMerger = new RecipeCollector<>();
        this.stoveRecipes = new HashSet<>();
    }
    
    
}
