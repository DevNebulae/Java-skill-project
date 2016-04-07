/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.base.implementation;

import java.util.HashSet;
import nebuladevelopment.skillproject.skills.cooking.recipes.base.IRecipeCollector;

/**
 *
 * @author Ivo Huntjens, I.J.
 * @param <T>
 */
public class RecipeCollector<T> implements IRecipeCollector<T>
{
    @Override
    public void collectRecipes(HashSet<T> recipes)
    {
        recipes.addAll(recipes);
    }
}
