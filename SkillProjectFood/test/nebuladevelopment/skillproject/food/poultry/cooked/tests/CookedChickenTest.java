/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.food.poultry.cooked.tests;

import nebuladevelopment.skillproject.food.EdibleFood;
import nebuladevelopment.skillproject.food.base.IFood;
import nebuladevelopment.skillproject.food.cooked.ICooked;
import nebuladevelopment.skillproject.food.cooked.IUncooked;
import nebuladevelopment.skillproject.food.edibility.IEdible;
import nebuladevelopment.skillproject.food.edibility.IInedible;
import nebuladevelopment.skillproject.food.poultry.base.IPoultry;
import nebuladevelopment.skillproject.food.poultry.cooked.CookedChicken;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class CookedChickenTest
{
    private final CookedChicken cookedChicken;
    
    public CookedChickenTest()
    {
        this.cookedChicken = new CookedChicken();
    }
    
    @Before
    public void setUp()
    {
    }
    
    @Test
    public void testGetHealthPoints()
    {
        assertEquals(this.cookedChicken.getHealthPoints(), 3);
    }
    
    @Test
    public void testIsCooked() {
        assertTrue(this.cookedChicken instanceof ICooked);
        assertFalse(this.cookedChicken instanceof IUncooked);
    }
    
    @Test
    public void testIsEdible() {
        assertTrue(this.cookedChicken instanceof IEdible);
        assertFalse(this.cookedChicken instanceof IInedible);
    }
    
    @Test
    public void testIsEdibleFood() {
        assertTrue(this.cookedChicken instanceof EdibleFood);
    }
    
    @Test
    public void testIsFood() {
        assertTrue(this.cookedChicken instanceof IFood);
    }
    
    @Test
    public void testIsPoultry() {
        assertTrue(this.cookedChicken instanceof IPoultry);
    }
}
