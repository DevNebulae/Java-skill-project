/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.rules.stove;

import java.util.function.Supplier;
import nebuladevelopment.skillproject.food.meat.cooked.CookedMeat;
import nebuladevelopment.skillproject.food.meat.raw.RawBearMeat;
import nebuladevelopment.skillproject.food.meat.raw.RawBeef;
import nebuladevelopment.skillproject.food.meat.raw.RawRatMeat;
import nebuladevelopment.skillproject.skills.cooking.recipes.base.IRecipe;
import nebuladevelopment.skillproject.skills.cooking.recipes.stove.StoveRecipe;
import nebuladevelopment.skillproject.skills.cooking.rules.base.IRecipeCollection;

/**
 *
 * @author Ivo Huntjens, I.J.
 * @param <T>
 */
public class StoveRecipeCollectionMeat<T extends IRecipe> implements IRecipeCollection<T>
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
    public Supplier<T>[] getRecipes()
    {
        Supplier<T>[] rules = new Supplier[]
        {
            this::bearMeatRule,
            this::beefRule,
            this::ratMeatRule
        };

        return rules;
    }
}
