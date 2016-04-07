/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.stove.rules;

import nebuladevelopment.skillproject.food.fish.cooked.CookedAnchovies;
import nebuladevelopment.skillproject.food.fish.cooked.CookedCod;
import nebuladevelopment.skillproject.food.fish.cooked.CookedHerring;
import nebuladevelopment.skillproject.food.fish.cooked.CookedLobster;
import nebuladevelopment.skillproject.food.fish.cooked.CookedMackerel;
import nebuladevelopment.skillproject.food.fish.cooked.CookedPike;
import nebuladevelopment.skillproject.food.fish.cooked.CookedSalmon;
import nebuladevelopment.skillproject.food.fish.cooked.CookedSardine;
import nebuladevelopment.skillproject.food.fish.cooked.CookedShrimps;
import nebuladevelopment.skillproject.food.fish.cooked.CookedTrout;
import nebuladevelopment.skillproject.food.fish.cooked.CookedTuna;
import nebuladevelopment.skillproject.food.fish.raw.RawAnchovies;
import nebuladevelopment.skillproject.food.fish.raw.RawCod;
import nebuladevelopment.skillproject.food.fish.raw.RawHerring;
import nebuladevelopment.skillproject.food.fish.raw.RawLobster;
import nebuladevelopment.skillproject.food.fish.raw.RawMackerel;
import nebuladevelopment.skillproject.food.fish.raw.RawPike;
import nebuladevelopment.skillproject.food.fish.raw.RawSalmon;
import nebuladevelopment.skillproject.food.fish.raw.RawSardine;
import nebuladevelopment.skillproject.food.fish.raw.RawShrimps;
import nebuladevelopment.skillproject.food.fish.raw.RawTrout;
import nebuladevelopment.skillproject.food.fish.raw.RawTuna;
import nebuladevelopment.skillproject.skills.cooking.recipes.stove.StoveRecipe;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class StoveRecipeRulesFish
{
    protected static final StoveRecipe anchovyRule()
    {
        return new StoveRecipe(RawAnchovies.class, CookedAnchovies.class);
    }

    protected static final StoveRecipe codRule()
    {
        return new StoveRecipe(RawCod.class, CookedCod.class);
    }

    protected static final StoveRecipe herringRule()
    {
        return new StoveRecipe(RawHerring.class, CookedHerring.class);
    }

    protected static final StoveRecipe lobsterRule()
    {
        return new StoveRecipe(RawLobster.class, CookedLobster.class);
    }

    protected static final StoveRecipe mackerelRule()
    {
        return new StoveRecipe(RawMackerel.class, CookedMackerel.class);
    }

    protected static final StoveRecipe pikeRule()
    {
        return new StoveRecipe(RawPike.class, CookedPike.class);
    }
    
    protected static final StoveRecipe salmonRule()
    {
        return new StoveRecipe(RawSalmon.class, CookedSalmon.class);
    }
    
    protected static final StoveRecipe sardineRule()
    {
        return new StoveRecipe(RawSardine.class, CookedSardine.class);
    }
    
    protected static final StoveRecipe shrimpRule()
    {
        return new StoveRecipe(RawShrimps.class, CookedShrimps.class);
    }
    
    protected static final StoveRecipe troutRule()
    {
        return new StoveRecipe(RawTrout.class, CookedTrout.class);
    }
    
    protected static final StoveRecipe tunaRule()
    {
        return new StoveRecipe(RawTuna.class, CookedTuna.class);
    }
}
