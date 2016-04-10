/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.stove.base;

import nebuladevelopment.skillproject.food.meat.cooked.CookedMeat;
import nebuladevelopment.skillproject.food.meat.raw.RawBeef;
import nebuladevelopment.skillproject.food.meat.raw.RawRatMeat;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class StoveRecipeTest
{
    private final StoveRecipe stoveRecipe;
    
    public StoveRecipeTest()
    {
        this.stoveRecipe = new StoveRecipe(RawBeef.class, CookedMeat.class);
    }
    
    @Before
    public void setUp()
    {
    }
    
    @Test
    public void testConstructor() {
        assertNotNull(new StoveRecipe(RawRatMeat.class, CookedMeat.class));
    }
    
    @Test
    public void testGetInput() {
        assertEquals(this.stoveRecipe.getInput(), RawBeef.class);
    }
    
    @Test
    public void testGetOutput() {
        assertEquals(this.stoveRecipe.getOuput(), CookedMeat.class);
    }
}
