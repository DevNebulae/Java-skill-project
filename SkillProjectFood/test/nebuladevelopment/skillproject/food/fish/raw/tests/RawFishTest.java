/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.food.fish.raw.tests;

import nebuladevelopment.skillproject.food.InedibleFood;
import nebuladevelopment.skillproject.food.InedibleUncookedFood;
import nebuladevelopment.skillproject.food.base.IFood;
import nebuladevelopment.skillproject.food.cooked.IUncooked;
import nebuladevelopment.skillproject.food.edibility.IInedible;
import nebuladevelopment.skillproject.food.fish.base.IFish;
import nebuladevelopment.skillproject.food.fish.raw.RawAnchovies;
import nebuladevelopment.skillproject.food.fish.raw.RawCod;
import nebuladevelopment.skillproject.food.fish.raw.RawHerring;
import nebuladevelopment.skillproject.food.fish.raw.RawLobster;
import nebuladevelopment.skillproject.food.fish.raw.RawMackerel;
import nebuladevelopment.skillproject.food.fish.raw.RawPike;
import nebuladevelopment.skillproject.food.fish.raw.RawSalmon;
import nebuladevelopment.skillproject.food.fish.raw.RawSardine;
import nebuladevelopment.skillproject.food.fish.raw.RawShrimps;
import nebuladevelopment.skillproject.food.fish.raw.RawTrout;
import nebuladevelopment.skillproject.food.fish.raw.RawTuna;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class RawFishTest
{
    public RawFishTest()
    {
    }

    @Test
    public void testConstructors()
    {
        for (InedibleUncookedFood food : this.getFish())
            assertNotNull(food);
    }

    @Test
    public void testInstanceOfIFish()
    {
        for (InedibleUncookedFood food : this.getFish())
            assertThat(food, instanceOf(IFish.class));
    }

    @Test
    public void testInstanceOfIFood()
    {
        for (InedibleUncookedFood food : this.getFish())
            assertThat(food, instanceOf(IFood.class));
    }

    @Test
    public void testInstanceOfIInedible()
    {
        for (InedibleUncookedFood food : this.getFish())
            assertThat(food, instanceOf(IInedible.class));
    }

    @Test
    public void testInstanceOfInedibleFood()
    {
        for (InedibleUncookedFood food : this.getFish())
            assertThat(food, instanceOf(InedibleFood.class));
    }

    @Test
    public void testInstanceOfIUncooked()
    {
        for (InedibleUncookedFood food : this.getFish())
            assertThat(food, instanceOf(IUncooked.class));
    }

    private InedibleUncookedFood[] getFish()
    {
        return new InedibleUncookedFood[]
        {
            new RawAnchovies(),
            new RawCod(),
            new RawHerring(),
            new RawLobster(),
            new RawMackerel(),
            new RawPike(),
            new RawSalmon(),
            new RawSardine(),
            new RawShrimps(),
            new RawTrout(),
            new RawTuna()
        };
    }
}
