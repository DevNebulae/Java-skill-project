/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.policies.stove;

import java.util.HashSet;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.IRecipePolicy;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.implementation.RecipeSupplierBundler;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.stove.suppliers.StoveRecipeFishSupplier;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.stove.suppliers.StoveRecipeMeatSupplier;
import nebuladevelopment.skillproject.skills.cooking.recipes.stove.base.StoveRecipe;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class StoveRecipePolicy implements IRecipePolicy<StoveRecipe>
{
    private final StoveRecipeFishSupplier<StoveRecipe> fishRecipes;
    private final StoveRecipeMeatSupplier<StoveRecipe> meatRecipes;
    private final RecipeSupplierBundler<StoveRecipe> recipeBundler;

    public StoveRecipePolicy()
    {
        this.fishRecipes = new StoveRecipeFishSupplier<>();
        this.meatRecipes = new StoveRecipeMeatSupplier<>();
        this.recipeBundler = new RecipeSupplierBundler<>();
    }

    @Override
    public HashSet<StoveRecipe> getRecipePolicy()
    {
        HashSet<StoveRecipe> recipes = new HashSet<>();
        
        recipes.addAll(this.recipeBundler.bundleRecipeSuppliers(this.fishRecipes.getRecipes()));
        recipes.addAll(this.recipeBundler.bundleRecipeSuppliers(this.meatRecipes.getRecipes()));
        
        return recipes;
    }
}
