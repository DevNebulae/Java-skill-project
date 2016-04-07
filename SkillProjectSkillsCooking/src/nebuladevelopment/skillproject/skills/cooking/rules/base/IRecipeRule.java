/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.rules.base;

import java.util.function.Supplier;

/**
 *
 * @author Ivo Huntjens, I.J.
 * @param <T>
 */
public interface IRecipeRule<T>
{
    public Supplier<T>[] getRecipeRules();
}
