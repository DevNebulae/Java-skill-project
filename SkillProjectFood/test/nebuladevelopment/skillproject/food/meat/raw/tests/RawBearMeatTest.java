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
import nebuladevelopment.skillproject.food.meat.raw.RawBearMeat;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class RawBearMeatTest
{
    private final RawBearMeat rawBearMeat;

    public RawBearMeatTest()
    {
        this.rawBearMeat = new RawBearMeat();
    }

    @Before
    public void setUp()
    {
    }

    @Test
    public void testIsCooked()
    {
        assertFalse(this.rawBearMeat instanceof ICooked);
        assertTrue(this.rawBearMeat instanceof IUncooked);
    }

    @Test
    public void testIsEdible()
    {
        assertFalse(this.rawBearMeat instanceof IEdible);
        assertTrue(this.rawBearMeat instanceof IInedible);
    }

    @Test
    public void testIsFood()
    {
        assertTrue(this.rawBearMeat instanceof IFood);
    }

    @Test
    public void testIsMeat()
    {
        assertTrue(this.rawBearMeat instanceof IMeat);
    }
}
