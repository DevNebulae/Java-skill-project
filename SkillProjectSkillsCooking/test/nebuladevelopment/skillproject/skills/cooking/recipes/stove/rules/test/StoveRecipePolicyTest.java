/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.stove.rules.test;

import nebuladevelopment.skillproject.skills.cooking.recipes.stove.StoveRecipe;
import nebuladevelopment.skillproject.skills.cooking.rules.base.IRecipeCollection;
import nebuladevelopment.skillproject.skills.cooking.rules.base.IRecipePolicy;
import nebuladevelopment.skillproject.skills.cooking.rules.policies.StoveRecipePolicy;
import nebuladevelopment.skillproject.skills.cooking.rules.stove.StoveRecipeCollectionMeat;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class StoveRecipePolicyTest
{
    private final IRecipePolicy<StoveRecipe> stoveRecipePolicy;
    
    public StoveRecipePolicyTest()
    {
        this.stoveRecipePolicy = new StoveRecipePolicy<>();
    }

    @Before
    public void setUp()
    {
    }

    @Test
    public void testGetRecipePolicy()
    {
        IRecipeCollection<StoveRecipe> stoveRecipesMeat = new StoveRecipeCollectionMeat<>();
        assertEquals(this.stoveRecipePolicy.getRecipePolicy(stoveRecipesMeat.getRecipes()).size(), 3);
    }
}
