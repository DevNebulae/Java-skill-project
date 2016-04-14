/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.policies.fish.collection;

import java.util.function.Supplier;
import nebuladevelopment.skillproject.food.fish.cooked.*;
import nebuladevelopment.skillproject.food.fish.raw.*;
import nebuladevelopment.skillproject.skills.cooking.recipes.fish.base.FishRecipe;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.IRecipeCollection;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class FishRecipeCollection implements IRecipeCollection<FishRecipe>
{
    private FishRecipe getAnchovyRecipe()
    {
        return new FishRecipe(RawAnchovies.class, CookedAnchovies.class);
    }

    private FishRecipe getCodRecipe()
    {
        return new FishRecipe(RawCod.class, CookedCod.class);
    }

    private FishRecipe getHerringRecipe()
    {
        return new FishRecipe(RawHerring.class, CookedHerring.class);
    }

    private FishRecipe getLobsterRecipe()
    {
        return new FishRecipe(RawLobster.class, CookedLobster.class);
    }

    private FishRecipe getMackerelRecipe()
    {
        return new FishRecipe(RawMackerel.class, CookedMackerel.class);
    }

    private FishRecipe getPikeRecipe()
    {
        return new FishRecipe(RawPike.class, CookedPike.class);
    }

    private FishRecipe getSalmonRecipe()
    {
        return new FishRecipe(RawSalmon.class, CookedSalmon.class);
    }

    private FishRecipe getSardineRecipe()
    {
        return new FishRecipe(RawSardine.class, CookedSardine.class);
    }

    private FishRecipe getShrimpRecipe()
    {
        return new FishRecipe(RawShrimps.class, CookedShrimps.class);
    }

    private FishRecipe getTroutRecipe()
    {
        return new FishRecipe(RawTrout.class, CookedTrout.class);
    }

    private FishRecipe getTunaRecipe()
    {
        return new FishRecipe(RawTuna.class, CookedTuna.class);
    }

    @Override
    public Supplier<FishRecipe>[] getRecipes()
    {
        return new Supplier[]
        {
            this::getAnchovyRecipe,
            this::getCodRecipe,
            this::getHerringRecipe,
            this::getLobsterRecipe,
            this::getMackerelRecipe,
            this::getPikeRecipe,
            this::getSalmonRecipe,
            this::getSardineRecipe,
            this::getShrimpRecipe,
            this::getTroutRecipe,
            this::getTunaRecipe
        };
    }
}
