/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.stove.rules.test;

import nebuladevelopment.skillproject.skills.cooking.recipes.base.IRecipeCollector;
import nebuladevelopment.skillproject.skills.cooking.recipes.stove.rules.StoveRecipeCollector;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class StoveRecipeCollectorTest
{
    IRecipeCollector<StoveRecipeCollector> stoveRecipes;
    
    public StoveRecipeCollectorTest()
    {
        this.stoveRecipes = new StoveRecipeCollector<>();
    }
    
    @Before
    public void setUp()
    {
    }
    
    @Test
    public void testCollectRecipes() {
        assertTrue(!this.stoveRecipes.collectRecipes().isEmpty());
    }
}
