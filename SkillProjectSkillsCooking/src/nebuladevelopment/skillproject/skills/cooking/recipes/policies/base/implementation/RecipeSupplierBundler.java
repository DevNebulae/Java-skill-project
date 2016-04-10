/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.implementation;

import java.util.HashSet;
import java.util.function.Supplier;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.IRecipe;

/**
 *
 * @author Ivo Huntjens, I.J.
 * @param <T>
 */
public class RecipeSupplierBundler<T extends IRecipe>
{
    public HashSet<T> bundleRecipeSuppliers(Supplier<T>... recipeSuppliers)
    {
        HashSet<T> recipes = new HashSet<>();

        for (Supplier<T> recipeSupplier : recipeSuppliers)
            recipes.add(recipeSupplier.get());

        return recipes;
    }
}
