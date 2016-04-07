/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.base.implementation;

import java.util.HashSet;
import java.util.function.Supplier;
import nebuladevelopment.skillproject.skills.cooking.recipes.base.IRecipeCollector;

/**
 *
 * @author Ivo Huntjens, I.J.
 * @param <T>
 */
public class RecipeCollector<T> implements IRecipeCollector<T>
{
    @Override
    public HashSet<T> mergeRecipes(Supplier<T>... recipes)
    {
        HashSet<T> recipeCollection = new HashSet<>();

        for (Supplier<T> recipe : recipes)
            recipeCollection.add(recipe.get());
        
        return recipeCollection;
    }
}
