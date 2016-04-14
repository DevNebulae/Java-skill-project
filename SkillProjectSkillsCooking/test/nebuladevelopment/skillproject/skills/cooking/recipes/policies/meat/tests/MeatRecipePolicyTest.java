/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.policies.meat.tests;

import nebuladevelopment.skillproject.skills.cooking.recipes.policies.meat.MeatRecipePolicy;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class MeatRecipePolicyTest
{
    private final MeatRecipePolicy recipePolicy;

    public MeatRecipePolicyTest()
    {
        this.recipePolicy = new MeatRecipePolicy();
    }

    @Test
    public void testGetRecipePolicy()
    {
        assertTrue(this.recipePolicy.getRecipePolicy().size() > 0);
    }
}
