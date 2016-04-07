/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.food.meat.raw.tests;

import nebuladevelopment.skillproject.food.base.IFood;
import nebuladevelopment.skillproject.food.cooked.ICooked;
import nebuladevelopment.skillproject.food.cooked.IUncooked;
import nebuladevelopment.skillproject.food.edibility.IEdible;
import nebuladevelopment.skillproject.food.edibility.IInedible;
import nebuladevelopment.skillproject.food.meat.base.IMeat;
import nebuladevelopment.skillproject.food.meat.raw.RawRatMeat;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class RawRatMeatTest
{
    private final RawRatMeat rawRatMeat;
    
    public RawRatMeatTest()
    {
        this.rawRatMeat = new RawRatMeat();
    }
    
    @Before
    public void setUp()
    {
    }
    
    @Test
    public void testIsCooked()
    {
        assertFalse(this.rawRatMeat instanceof ICooked);
        assertTrue(this.rawRatMeat instanceof IUncooked);
    }

    @Test
    public void testIsEdible()
    {
        assertFalse(this.rawRatMeat instanceof IEdible);
        assertTrue(this.rawRatMeat instanceof IInedible);
    }
    
    @Test
    public void testIsMeat() {
        assertTrue(this.rawRatMeat instanceof IMeat);
    }
    
    @Test
    public void testIsFood() {
        assertTrue(this.rawRatMeat instanceof IFood);
    }
}
