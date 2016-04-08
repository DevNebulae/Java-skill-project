/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.rule.stove;

import nebuladevelopment.skillproject.skills.cooking.recipes.stove.StoveRecipe;
import nebuladevelopment.skillproject.skills.cooking.rules.base.IRecipeCollection;
import nebuladevelopment.skillproject.skills.cooking.rules.stove.StoveRecipeCollectionMeat;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class StoveRecipeCollectionMeatTest
{
    private final IRecipeCollection<StoveRecipe> meatRecipeCollection;

    public StoveRecipeCollectionMeatTest()
    {
        this.meatRecipeCollection = new StoveRecipeCollectionMeat<>();
    }

    @Before
    public void setUp()
    {
    }

    @Test
    public void testGetRecipes()
    {
        int amountOfRecipes = 3;
        assertEquals(this.meatRecipeCollection.getRecipes().length, amountOfRecipes);
        assertEquals(new StoveRecipeCollectionMeat<StoveRecipe>().getRecipes(), amountOfRecipes);
    }
}
