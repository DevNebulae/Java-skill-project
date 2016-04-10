/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.policies.stove.tests;

import nebuladevelopment.skillproject.skills.cooking.recipes.policies.stove.StoveRecipePolicy;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class StoveRecipePolicyTest
{
    private final StoveRecipePolicy stoveRecipes;
    
    public StoveRecipePolicyTest()
    {
        this.stoveRecipes = new StoveRecipePolicy();
    }
    
    @Before
    public void setUp()
    {
    }
    
    @Test
    public void testConstructor() {
        assertNotNull(new StoveRecipePolicy());
    }
    
    @Test
    public void testGetRecipePolicy() {
        assertTrue(!this.stoveRecipes.getRecipePolicy().isEmpty());
    }
}
