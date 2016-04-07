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
import nebuladevelopment.skillproject.food.meat.raw.RawBeef;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class RawBeefTest
{
    private final RawBeef rawBeef;

    public RawBeefTest()
    {
        this.rawBeef = new RawBeef();
    }

    @Before
    public void setUp()
    {
    }

    @Test
    public void testIsCooked()
    {
        assertFalse(this.rawBeef instanceof ICooked);
        assertTrue(this.rawBeef instanceof IUncooked);
    }

    @Test
    public void testIsEdible()
    {
        assertFalse(this.rawBeef instanceof IEdible);
        assertTrue(this.rawBeef instanceof IInedible);
    }

    @Test
    public void testIsFood()
    {
        assertTrue(this.rawBeef instanceof IFood);
    }

    @Test
    public void testIsMeat()
    {
        assertTrue(this.rawBeef instanceof IMeat);
    }
}
