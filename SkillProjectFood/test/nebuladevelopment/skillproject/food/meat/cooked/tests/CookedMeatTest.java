/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.food.meat.cooked.tests;

import nebuladevelopment.skillproject.food.EdibleCookedFood;
import nebuladevelopment.skillproject.food.EdibleFood;
import nebuladevelopment.skillproject.food.base.IFood;
import nebuladevelopment.skillproject.food.cooked.ICooked;
import nebuladevelopment.skillproject.food.edibility.IEdible;
import nebuladevelopment.skillproject.food.meat.base.IMeat;
import nebuladevelopment.skillproject.food.meat.cooked.CookedMeat;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class CookedMeatTest
{

    public CookedMeatTest()
    {
    }

    @Test
    public void testConstructors()
    {
        for (EdibleCookedFood food : this.getMeat())
            assertNotNull(food);
    }

    @Test
    public void testGetHealthPoints()
    {
        for (EdibleCookedFood food : this.getMeat())
            assertThat(food.getHealthPoints(), instanceOf(Integer.class));
    }

    @Test
    public void testInstanceOfEdibleFood()
    {
        for (EdibleCookedFood food : this.getMeat())
            assertThat(food, instanceOf(EdibleFood.class));
    }

    @Test
    public void testInstanceOfICooked()
    {
        for (EdibleCookedFood food : this.getMeat())
            assertThat(food, instanceOf(ICooked.class));
    }

    @Test
    public void testInstanceOfIEdible()
    {
        for (EdibleCookedFood food : this.getMeat())
            assertThat(food, instanceOf(IEdible.class));
    }

    @Test
    public void testInstanceOfIFood()
    {
        for (EdibleCookedFood food : this.getMeat())
            assertThat(food, instanceOf(IFood.class));
    }

    @Test
    public void testInstanceOfIMeat()
    {
        for (EdibleCookedFood food : this.getMeat())
            assertThat(food, instanceOf(IMeat.class));
    }

    private EdibleCookedFood[] getMeat()
    {
        return new EdibleCookedFood[]
        {
            new CookedMeat()
        };
    }
}
