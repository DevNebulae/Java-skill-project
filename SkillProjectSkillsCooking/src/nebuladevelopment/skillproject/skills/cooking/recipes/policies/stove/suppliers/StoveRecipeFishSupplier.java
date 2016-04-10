/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.policies.stove.suppliers;

import java.util.function.Supplier;
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
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.IRecipe;
import nebuladevelopment.skillproject.skills.cooking.recipes.stove.base.StoveRecipe;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.IRecipeSupplier;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class StoveRecipeFishSupplier<T extends IRecipe> implements IRecipeSupplier<T>
{
    private final StoveRecipe anchovyRule()
    {
        return new StoveRecipe(RawAnchovies.class, CookedAnchovies.class);
    }

    private final StoveRecipe codRule()
    {
        return new StoveRecipe(RawCod.class, CookedCod.class);
    }

    private final StoveRecipe herringRule()
    {
        return new StoveRecipe(RawHerring.class, CookedHerring.class);
    }

    private final StoveRecipe lobsterRule()
    {
        return new StoveRecipe(RawLobster.class, CookedLobster.class);
    }

    private final StoveRecipe mackerelRule()
    {
        return new StoveRecipe(RawMackerel.class, CookedMackerel.class);
    }

    private final StoveRecipe pikeRule()
    {
        return new StoveRecipe(RawPike.class, CookedPike.class);
    }
    
    private final StoveRecipe salmonRule()
    {
        return new StoveRecipe(RawSalmon.class, CookedSalmon.class);
    }
    
    private final StoveRecipe sardineRule()
    {
        return new StoveRecipe(RawSardine.class, CookedSardine.class);
    }
    
    private final StoveRecipe shrimpRule()
    {
        return new StoveRecipe(RawShrimps.class, CookedShrimps.class);
    }
    
    private final StoveRecipe troutRule()
    {
        return new StoveRecipe(RawTrout.class, CookedTrout.class);
    }
    
    private final StoveRecipe tunaRule()
    {
        return new StoveRecipe(RawTuna.class, CookedTuna.class);
    }

    @Override
    public Supplier<T>[] getRecipes()
    {
        return new Supplier[] {
            this::anchovyRule,
            this::codRule,
            this::herringRule,
            this::lobsterRule,
            this::mackerelRule,
            this::pikeRule,
            this::salmonRule,
            this::sardineRule,
            this::shrimpRule,
            this::troutRule,
            this::tunaRule
        };
    }
}
