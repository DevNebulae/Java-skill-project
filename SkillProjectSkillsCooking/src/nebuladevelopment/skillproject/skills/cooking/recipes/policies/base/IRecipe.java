/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.policies.base;

/**
 *
 * @author Ivo Huntjens, I.J.
 * @param <T>
 * @param <U>
 * @param <V>
 */
public interface IRecipe<T, U extends T, V extends T>
{
    public Class<U> getIngredient();

    public Class<V> getOutput();
}
