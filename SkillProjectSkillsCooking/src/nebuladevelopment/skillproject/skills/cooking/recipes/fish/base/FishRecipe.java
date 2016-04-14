/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.fish.base;

import nebuladevelopment.skillproject.food.fish.base.IFish;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.implementation.Recipe;

/**
 *
 * @author Ivo Huntjens, I.J.
 * @param <U>
 * @param <V>
 */
public class FishRecipe<U extends IFish, V extends IFish> extends Recipe<IFish, U, V>
{
    public FishRecipe(Class<U> ingredient, Class<V> output)
    {
        super(ingredient, output);
    }
}
