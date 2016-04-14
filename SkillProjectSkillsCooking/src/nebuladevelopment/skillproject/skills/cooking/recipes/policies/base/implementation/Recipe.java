/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.implementation;

import nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.IRecipe;

/**
 *
 * @author Ivo Huntjens, I.J.
 * @param <T>
 * @param <U>
 * @param <V>
 */
public class Recipe<T, U extends T, V extends T> implements IRecipe<T, U, V>
{
    private final Class<U> ingredient;
    private final Class<V> output;

    public Recipe(Class<U> ingredient, Class<V> output)
    {
        this.ingredient = ingredient;
        this.output = output;
    }

    @Override
    public Class<U> getIngredient()
    {
        return this.ingredient;
    }

    @Override
    public Class<V> getOutput()
    {
        return this.output;
    }
}
