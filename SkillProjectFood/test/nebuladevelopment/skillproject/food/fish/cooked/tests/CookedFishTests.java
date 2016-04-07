/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.food.fish.cooked.tests;

import java.util.HashSet;
import nebuladevelopment.skillproject.food.EdibleCookedFood;
import nebuladevelopment.skillproject.food.EdibleFood;
import nebuladevelopment.skillproject.food.base.IFood;
import nebuladevelopment.skillproject.food.cooked.ICooked;
import nebuladevelopment.skillproject.food.cooked.IUncooked;
import nebuladevelopment.skillproject.food.edibility.IEdible;
import nebuladevelopment.skillproject.food.edibility.IInedible;
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
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class CookedFishTests
{
    private final HashSet<EdibleFood> cookedFish;

    public CookedFishTests()
    {
        this.cookedFish = new HashSet<>();
    }

    @Before
    public void setUp()
    {
        this.cookedFish.add(new CookedAnchovies());
        this.cookedFish.add(new CookedCod());
        this.cookedFish.add(new CookedHerring());
        this.cookedFish.add(new CookedLobster());
        this.cookedFish.add(new CookedMackerel());
        this.cookedFish.add(new CookedPike());
        this.cookedFish.add(new CookedSalmon());
        this.cookedFish.add(new CookedSardine());
        this.cookedFish.add(new CookedShrimps());
        this.cookedFish.add(new CookedTrout());
        this.cookedFish.add(new CookedTuna());
    }

    @Test
    public void testGetHealthPoints()
    {
        for (EdibleFood fish : this.cookedFish)
            assertTrue(fish.getHealthPoints() >= 0);
    }

    @Test
    public void testIsCooked()
    {
        for (EdibleFood fish : this.cookedFish)
        {
            assertTrue(fish instanceof ICooked);
            assertFalse(fish instanceof IUncooked);
        }
    }

    @Test
    public void testIsEdible()
    {
        for (EdibleFood fish : this.cookedFish)
        {
            assertTrue(fish instanceof IEdible);
            assertFalse(fish instanceof IInedible);
        }
    }

    @Test
    public void testIsEdibleFood()
    {
        for (EdibleFood fish : this.cookedFish)
            assertTrue(fish instanceof EdibleFood);
    }

    @Test
    public void testIsEdibleCookedFood()
    {
        for (EdibleFood fish : this.cookedFish)
            assertTrue(fish instanceof EdibleCookedFood);
    }

    @Test
    public void testIsFish()
    {
        for (EdibleFood fish : this.cookedFish)
            assertTrue(fish instanceof IFish);
    }

    @Test
    public void testIsFood()
    {
        for (EdibleFood fish : this.cookedFish)
            assertTrue(fish instanceof IFood);
    }
}
