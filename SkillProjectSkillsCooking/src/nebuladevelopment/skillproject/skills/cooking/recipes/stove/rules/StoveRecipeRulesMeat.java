/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.stove.rules;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import nebuladevelopment.skillproject.food.meat.cooked.CookedMeat;
import nebuladevelopment.skillproject.food.meat.raw.RawBearMeat;
import nebuladevelopment.skillproject.food.meat.raw.RawBeef;
import nebuladevelopment.skillproject.food.meat.raw.RawRatMeat;
import nebuladevelopment.skillproject.skills.cooking.recipes.stove.StoveRecipe;
import nebuladevelopment.skillproject.skills.cooking.rules.base.IRecipeRule;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class StoveRecipeRulesMeat<T> implements IRecipeRule<T>
{
    private final StoveRecipe bearMeatRule()
    {
        return new StoveRecipe(RawBearMeat.class, CookedMeat.class);
    }

    private final StoveRecipe beefRule()
    {
        return new StoveRecipe(RawBeef.class, CookedMeat.class);
    }

    private final StoveRecipe ratMeatRule()
    {
        return new StoveRecipe(RawRatMeat.class, CookedMeat.class);
    }

    @Override
    public Supplier<T>[] getRecipeRules()
    {
        return new Supplier<T>[]
        {
            this::bearMeatRule,
            this::beefRule,
            this::ratMeatRule
        }
    }
