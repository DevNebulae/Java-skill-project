/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.policies.fish.tests;

import nebuladevelopment.skillproject.skills.cooking.recipes.policies.fish.FishRecipePolicy;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class FishRecipePolicyTest
{
    private final FishRecipePolicy recipePolicy;

    public FishRecipePolicyTest()
    {
        this.recipePolicy = new FishRecipePolicy();
    }

    @Test
    public void testGetRecipePolicy()
    {
        assertTrue(this.recipePolicy.getRecipePolicy().size() > 0);
    }
}
