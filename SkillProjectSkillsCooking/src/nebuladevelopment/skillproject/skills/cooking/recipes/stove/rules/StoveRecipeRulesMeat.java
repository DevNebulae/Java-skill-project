/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.stove.rules;

import nebuladevelopment.skillproject.food.meat.cooked.CookedMeat;
import nebuladevelopment.skillproject.food.meat.raw.RawBearMeat;
import nebuladevelopment.skillproject.food.meat.raw.RawBeef;
import nebuladevelopment.skillproject.food.meat.raw.RawRatMeat;
import nebuladevelopment.skillproject.skills.cooking.recipes.stove.StoveRecipe;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class StoveRecipeRulesMeat
{
    protected static final StoveRecipe bearMeatRule()
    {
        return new StoveRecipe(RawBearMeat.class, CookedMeat.class);
    }
    
    protected static final StoveRecipe beefRule()
    {
        return new StoveRecipe(RawBeef.class, CookedMeat.class);
    }
    
    protected static final StoveRecipe ratMeatRule()
    {
        return new StoveRecipe(RawRatMeat.class, CookedMeat.class);
    }
}
