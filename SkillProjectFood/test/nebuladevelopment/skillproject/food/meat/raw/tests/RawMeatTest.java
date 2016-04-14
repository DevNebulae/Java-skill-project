/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.food.meat.raw.tests;

import nebuladevelopment.skillproject.food.InedibleFood;
import nebuladevelopment.skillproject.food.InedibleUncookedFood;
import nebuladevelopment.skillproject.food.base.IFood;
import nebuladevelopment.skillproject.food.cooked.IUncooked;
import nebuladevelopment.skillproject.food.edibility.IInedible;
import nebuladevelopment.skillproject.food.meat.base.IMeat;
import nebuladevelopment.skillproject.food.meat.raw.RawBearMeat;
import nebuladevelopment.skillproject.food.meat.raw.RawBeef;
import nebuladevelopment.skillproject.food.meat.raw.RawRatMeat;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class RawMeatTest
{
    public RawMeatTest()
    {
    }

    @Test
    public void testConstructors()
    {
        for (InedibleUncookedFood food : this.getMeat())
            assertNotNull(food);
    }

    @Test
    public void testInstanceOfIFood()
    {
        for (InedibleUncookedFood food : this.getMeat())
            assertThat(food, instanceOf(IFood.class));
    }

    @Test
    public void testInstanceOfIInedible()
    {
        for (InedibleUncookedFood food : this.getMeat())
            assertThat(food, instanceOf(IInedible.class));
    }

    @Test
    public void testInstanceOfInedibleFood()
    {
        for (InedibleUncookedFood food : this.getMeat())
            assertThat(food, instanceOf(InedibleFood.class));
    }

    @Test
    public void testInstanceOfIMeat()
    {
        for (InedibleUncookedFood food : this.getMeat())
            assertThat(food, instanceOf(IMeat.class));
    }

    @Test
    public void testInstanceOfIUncooked()
    {
        for (InedibleUncookedFood food : this.getMeat())
            assertThat(food, instanceOf(IUncooked.class));
    }

    private InedibleUncookedFood[] getMeat()
    {
        return new InedibleUncookedFood[]
        {
            new RawBearMeat(),
            new RawBeef(),
            new RawRatMeat()
        };
    }
}
