/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.pastry.base;

import nebuladevelopment.skillproject.food.pastry.base.IPastry;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.implementation.Recipe;

/**
 *
 * @author Ivo Huntjens, I.J.
 * @param <U>
 * @param <V>
 */
public class PastryRecipe<U extends IPastry, V extends IPastry> extends Recipe<IPastry, U, V>
{
    public PastryRecipe(Class<U> ingredient, Class<V> output)
    {
        super(ingredient, output);
    }
}
