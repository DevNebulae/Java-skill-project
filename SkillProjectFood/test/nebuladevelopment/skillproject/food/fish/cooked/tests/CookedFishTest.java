/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.food.fish.cooked.tests;

import nebuladevelopment.skillproject.food.EdibleCookedFood;
import nebuladevelopment.skillproject.food.EdibleFood;
import nebuladevelopment.skillproject.food.base.IFood;
import nebuladevelopment.skillproject.food.cooked.ICooked;
import nebuladevelopment.skillproject.food.edibility.IEdible;
import nebuladevelopment.skillproject.food.fish.base.IFish;
import nebuladevelopment.skillproject.food.fish.cooked.CookedAnchovies;
import nebuladevelopment.skillproject.food.fish.cooked.CookedCod;
import nebuladevelopment.skillproject.food.fish.cooked.CookedHerring;
import nebuladevelopment.skillproject.food.fish.cooked.CookedLobster;
import nebuladevelopment.skillproject.food.fish.cooked.CookedMackerel;
import nebuladevelopment.skillproject.food.fish.cooked.CookedPike;
import nebuladevelopment.skillproject.food.fish.cooked.CookedSalmon;
import nebuladevelopment.skillproject.food.fish.cooked.CookedSardine;
import nebuladevelopment.skillproject.food.fish.cooked.CookedShrimps;
import nebuladevelopment.skillproject.food.fish.cooked.CookedTrout;
import nebuladevelopment.skillproject.food.fish.cooked.CookedTuna;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class CookedFishTest
{
    public CookedFishTest()
    {
    }

    @Before
    public void setUp()
    {
    }

    @Test
    public void testConstructors()
    {
        for (EdibleCookedFood food : this.getFish())
            assertNotNull(food);
    }

    @Test
    public void testGetHealthPoints()
    {
        for (EdibleCookedFood food : this.getFish())
            assertThat(food.getHealthPoints(), instanceOf(Integer.class));
    }

    @Test
    public void testInstanceOfEdibleFood()
    {
        for (EdibleCookedFood food : this.getFish())
            assertThat(food, instanceOf(EdibleFood.class));
    }

    @Test
    public void testInstanceOfICooked()
    {
        for (EdibleCookedFood food : this.getFish())
            assertThat(food, instanceOf(ICooked.class));
    }

    @Test
    public void testInstanceOfIEdible()
    {
        for (EdibleCookedFood food : this.getFish())
            assertThat(food, instanceOf(IEdible.class));
    }

    @Test
    public void testInstanceOfIFish()
    {
        for (EdibleCookedFood food : this.getFish())
            assertThat(food, instanceOf(IFish.class));
    }

    @Test
    public void testInstanceOfIFood()
    {
        for (EdibleCookedFood food : this.getFish())
            assertThat(food, instanceOf(IFood.class));
    }

    private EdibleCookedFood[] getFish()
    {
        return new EdibleCookedFood[]
        {
            new CookedAnchovies(),
            new CookedCod(),
            new CookedHerring(),
            new CookedLobster(),
            new CookedMackerel(),
            new CookedPike(),
            new CookedSalmon(),
            new CookedSardine(),
            new CookedShrimps(),
            new CookedTrout(),
            new CookedTuna()
        };
    }
}
