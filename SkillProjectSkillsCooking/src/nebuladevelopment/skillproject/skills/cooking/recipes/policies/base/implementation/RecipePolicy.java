/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.implementation;

import java.util.HashSet;
import java.util.function.Supplier;

/**
 *
 * @author Ivo Huntjens, I.J.
 * @param <T>
 */
public abstract class RecipePolicy<T>
{
    protected HashSet<T> getRecipes(Supplier<T>... recipes)
    {
        HashSet<T> recipeCollection = new HashSet<>();

        for (Supplier<T> recipe : recipes)
            recipeCollection.add(recipe.get());

        return recipeCollection;
    }
}
