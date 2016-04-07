/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.base.implementation;

import java.util.HashSet;
import nebuladevelopment.skillproject.skills.cooking.recipes.base.IRecipeBundler;

/**
 *
 * @author Ivo Huntjens, I.J.
 * @param <T>
 */
public class RecipeBundler<T> implements IRecipeBundler<T>
{
    @Override
    public void bundleRecipes(HashSet<T> recipes, HashSet<T> bundledRecipes)
    {
        recipes.addAll(bundledRecipes);
    }
}
