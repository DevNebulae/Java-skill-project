/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.food.meat.cooked.tests;

import nebuladevelopment.skillproject.food.EdibleFood;
import nebuladevelopment.skillproject.food.InedibleFood;
import nebuladevelopment.skillproject.food.base.IFood;
import nebuladevelopment.skillproject.food.cooked.ICooked;
import nebuladevelopment.skillproject.food.cooked.IUncooked;
import nebuladevelopment.skillproject.food.edibility.IEdible;
import nebuladevelopment.skillproject.food.edibility.IInedible;
import nebuladevelopment.skillproject.food.meat.base.IMeat;
import nebuladevelopment.skillproject.food.meat.cooked.CookedMeat;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class CookedMeatTest
{
    private final CookedMeat cookedMeat;

    public CookedMeatTest()
    {
        this.cookedMeat = new CookedMeat();
    }

    @Before
    public void setUp()
    {
    }
    
    @Test
    public void testGetHealthPoints()
    {
        assertEquals(this.cookedMeat.getHealthPoints(), 3);
    }
    
    @Test
    public void testIsCooked() {
        assertTrue(this.cookedMeat instanceof ICooked);
        assertFalse(this.cookedMeat instanceof IUncooked);
    }
    
    @Test
    public void testIsEdible() {
        assertTrue(this.cookedMeat instanceof IEdible);
        assertFalse(this.cookedMeat instanceof IInedible);
    }
    
    @Test
    public void testIsEdibleFood() {
        assertTrue(this.cookedMeat instanceof EdibleFood);
    }
    
    @Test
    public void testIsFood() {
        assertTrue(this.cookedMeat instanceof IFood);
    }
    
    @Test
    public void testIsMeat() {
        assertTrue(this.cookedMeat instanceof IMeat);
    }
}
