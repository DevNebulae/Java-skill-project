/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.food.fish.raw.tests;

import java.util.HashSet;
import nebuladevelopment.skillproject.food.InedibleUncookedFood;
import nebuladevelopment.skillproject.food.base.IFood;
import nebuladevelopment.skillproject.food.edibility.IEdible;
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
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class RawFishTests
{
    private final HashSet<InedibleUncookedFood> rawFish;

    public RawFishTests()
    {
        this.rawFish = new HashSet<>();
    }

    @Before
    public void setUp()
    {
        this.rawFish.add(new RawAnchovies());
        this.rawFish.add(new RawCod());
        this.rawFish.add(new RawHerring());
        this.rawFish.add(new RawLobster());
        this.rawFish.add(new RawMackerel());
        this.rawFish.add(new RawPike());
        this.rawFish.add(new RawSalmon());
        this.rawFish.add(new RawSardine());
        this.rawFish.add(new RawShrimps());
        this.rawFish.add(new RawTrout());
        this.rawFish.add(new RawTuna());
    }

    @Test
    public void testIsEdible()
    {
        for (InedibleUncookedFood fish : this.rawFish)
        {
            assertFalse(fish instanceof IEdible);
            assertTrue(fish instanceof IInedible);
        }
    }

    @Test
    public void testIsFish()
    {
        for (InedibleUncookedFood fish : this.rawFish)
            assertTrue(fish instanceof IFish);
    }

    @Test
    public void testIsFood()
    {
        for (InedibleUncookedFood fish : this.rawFish)
            assertTrue(fish instanceof IFood);
    }

    @Test
    public void testIsInedibleUncookedFood()
    {
        for (InedibleUncookedFood fish : this.rawFish)
            assertTrue(fish instanceof InedibleUncookedFood);
    }
}
