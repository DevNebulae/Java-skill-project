/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.meat.base.tests;

import nebuladevelopment.skillproject.food.meat.base.IMeat;
import nebuladevelopment.skillproject.food.meat.cooked.CookedMeat;
import nebuladevelopment.skillproject.food.meat.raw.RawBeef;
import nebuladevelopment.skillproject.skills.cooking.recipes.meat.base.MeatRecipe;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.IRecipe;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class MeatRecipeTest
{
    private final IRecipe<IMeat, RawBeef, CookedMeat> recipe;

    public MeatRecipeTest()
    {
        this.recipe = new MeatRecipe<>(RawBeef.class, CookedMeat.class);
    }

    @Test
    public void testGetIngredient()
    {
        assertEquals(RawBeef.class, this.recipe.getIngredient());
    }

    @Test
    public void testGetOutput()
    {
        assertEquals(CookedMeat.class, this.recipe.getOutput());
    }
}
