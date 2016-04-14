/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.meat.base;

import nebuladevelopment.skillproject.food.meat.base.IMeat;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.implementation.Recipe;

/**
 *
 * @author Ivo Huntjens, I.J.
 * @param <U>
 * @param <V>
 */
public class MeatRecipe<U extends IMeat, V extends IMeat> extends Recipe<IMeat, U, V>
{
    public MeatRecipe(Class<U> ingredient, Class<V> output)
    {
        super(ingredient, output);
    }
}
