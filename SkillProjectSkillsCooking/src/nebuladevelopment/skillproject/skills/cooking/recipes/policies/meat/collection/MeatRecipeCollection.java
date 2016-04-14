/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.policies.meat.collection;

import java.util.function.Supplier;
import nebuladevelopment.skillproject.food.meat.base.IMeat;
import nebuladevelopment.skillproject.food.meat.cooked.CookedMeat;
import nebuladevelopment.skillproject.food.meat.raw.RawBearMeat;
import nebuladevelopment.skillproject.food.meat.raw.RawBeef;
import nebuladevelopment.skillproject.food.meat.raw.RawRatMeat;
import nebuladevelopment.skillproject.skills.cooking.recipes.meat.base.MeatRecipe;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.IRecipeCollection;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class MeatRecipeCollection implements IRecipeCollection<IMeat>
{
    private MeatRecipe getBearMeatRecipe()
    {
        return new MeatRecipe(RawBearMeat.class, CookedMeat.class);
    }

    private MeatRecipe getBeefRecipe()
    {
        return new MeatRecipe(RawBeef.class, CookedMeat.class);
    }

    private MeatRecipe getRatMeatRecipe()
    {
        return new MeatRecipe(RawRatMeat.class, CookedMeat.class);
    }

    @Override
    public Supplier[] getRecipes()
    {
        return new Supplier[]
        {
            this::getBearMeatRecipe,
            this::getBeefRecipe,
            this::getRatMeatRecipe
        };
    }
}
