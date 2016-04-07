/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.base;

import java.util.HashSet;

/**
 *
 * @author Ivo Huntjens, I.J.
 * @param <T>
 */
public interface IRecipeCollector<T>
{
    public void collectRecipes(HashSet<T> recipes);
}