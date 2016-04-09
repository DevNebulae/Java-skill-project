/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.food.poultry.raw.tests;

import nebuladevelopment.skillproject.food.InedibleFood;
import nebuladevelopment.skillproject.food.InedibleUncookedFood;
import nebuladevelopment.skillproject.food.base.IFood;
import nebuladevelopment.skillproject.food.cooked.IUncooked;
import nebuladevelopment.skillproject.food.edibility.IInedible;
import nebuladevelopment.skillproject.food.poultry.base.IPoultry;
import nebuladevelopment.skillproject.food.poultry.raw.RawChicken;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class RawPoultryTest
{
    public RawPoultryTest()
    {
    }
    
    @Test
    public void testConstructors()
    {
        for (InedibleUncookedFood food : this.getPoultry())
            assertNotNull(food);
    }
    
    @Test
    public void testInstanceOfIFood()
    {
        for (InedibleUncookedFood food : this.getPoultry())
            assertThat(food, instanceOf(IFood.class));
    }

    @Test
    public void testInstanceOfIInedible()
    {
        for (InedibleUncookedFood food : this.getPoultry())
            assertThat(food, instanceOf(IInedible.class));
    }

    @Test
    public void testInstanceOfInedibleFood()
    {
        for (InedibleUncookedFood food : this.getPoultry())
            assertThat(food, instanceOf(InedibleFood.class));
    }
    
    @Test
    public void testInstanceOfIPoultry()
    {
        for (InedibleUncookedFood food : this.getPoultry())
            assertThat(food, instanceOf(IPoultry.class));
    }

    @Test
    public void testInstanceOfIUncooked()
    {
        for (InedibleUncookedFood food : this.getPoultry())
            assertThat(food, instanceOf(IUncooked.class));
    }

    private InedibleUncookedFood[] getPoultry()
    {
        return new InedibleUncookedFood[]
        {
            new RawChicken()
        };
    }
}
