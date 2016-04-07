/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.food.poultry.raw.tests;

import nebuladevelopment.skillproject.food.base.IFood;
import nebuladevelopment.skillproject.food.cooked.ICooked;
import nebuladevelopment.skillproject.food.cooked.IUncooked;
import nebuladevelopment.skillproject.food.edibility.IEdible;
import nebuladevelopment.skillproject.food.edibility.IInedible;
import nebuladevelopment.skillproject.food.meat.base.IMeat;
import nebuladevelopment.skillproject.food.poultry.base.IPoultry;
import nebuladevelopment.skillproject.food.poultry.raw.RawChicken;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class RawChickenTest
{
    private final RawChicken rawChicken;

    public RawChickenTest()
    {
        this.rawChicken = new RawChicken();
    }

    @Before
    public void setUp()
    {
    }

    @Test
    public void testIsCooked()
    {
        assertFalse(this.rawChicken instanceof ICooked);
        assertTrue(this.rawChicken instanceof IUncooked);
    }

    @Test
    public void testIsEdible()
    {
        assertFalse(this.rawChicken instanceof IEdible);
        assertTrue(this.rawChicken instanceof IInedible);
    }

    @Test
    public void testIsFood()
    {
        assertTrue(this.rawChicken instanceof IFood);
    }

    @Test
    public void testIsPoultry()
    {
        assertTrue(this.rawChicken instanceof IPoultry);
    }
}
