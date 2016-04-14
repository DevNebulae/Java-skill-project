/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.fish.base.tests;

import nebuladevelopment.skillproject.food.fish.base.IFish;
import nebuladevelopment.skillproject.food.fish.cooked.CookedAnchovies;
import nebuladevelopment.skillproject.food.fish.raw.RawAnchovies;
import nebuladevelopment.skillproject.skills.cooking.recipes.fish.base.FishRecipe;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.IRecipe;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class FishRecipeTest
{
    private final IRecipe<IFish, RawAnchovies, CookedAnchovies> recipe;

    public FishRecipeTest()
    {
        this.recipe = new FishRecipe<>(RawAnchovies.class, CookedAnchovies.class);
    }

    @Test
    public void testGetIngredient()
    {
        assertEquals(RawAnchovies.class, this.recipe.getIngredient());
    }

    @Test
    public void testGetOutput()
    {
        assertEquals(CookedAnchovies.class, this.recipe.getOutput());
    }
}
