/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.tests;

import java.lang.reflect.InvocationTargetException;
import nebuladevelopment.skillproject.food.fish.cooked.CookedShrimps;
import nebuladevelopment.skillproject.food.fish.raw.RawShrimps;
import nebuladevelopment.skillproject.food.meat.cooked.CookedMeat;
import nebuladevelopment.skillproject.food.meat.raw.RawBearMeat;
import nebuladevelopment.skillproject.food.meat.raw.RawBeef;
import nebuladevelopment.skillproject.food.meat.raw.RawRatMeat;
import nebuladevelopment.skillproject.skills.cooking.CookingSkill;
import nebuladevelopment.skillproject.skills.cooking.recipes.base.IRecipeCollector;
import nebuladevelopment.skillproject.skills.cooking.recipes.stove.StoveRecipe;
import nebuladevelopment.skillproject.skills.cooking.recipes.stove.rules.StoveRecipeCollector;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class CookingSkillTest
{
    private final CookingSkill cookingSkill;
    private final IRecipeCollector<StoveRecipe> stoveRecipeCollector;

    public CookingSkillTest()
    {
        this.cookingSkill = new CookingSkill();
        this.stoveRecipeCollector = new StoveRecipeCollector<>();
    }

    @Before
    public void setUp()
    {
        this.cookingSkill.addStoveRecipes(this.stoveRecipeCollector.collectRecipes());
    }

    @Test
    public void testAddStoveRecipes()
    {
        assertTrue(!this.cookingSkill.getStoveRecipes().isEmpty());
    }

    @Test
    public void testLookupStoveRecipe() throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        CookedShrimps cookedShrimps = this.cookingSkill.<CookedShrimps>lookupStoveRecipe(RawShrimps.class);
        assertNotNull(cookedShrimps);
        assertEquals(cookedShrimps.getHealthPoints(), 3);
    }
    
    @Test
    public void testLookupMultipleStoveRecipe() throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        CookedMeat cookedMeat = this.cookingSkill.<CookedMeat>lookupStoveRecipe(RawBearMeat.class);
        assertNotNull(cookedMeat);
        assertEquals(cookedMeat.getHealthPoints(), 3);
        
        cookedMeat = this.cookingSkill.<CookedMeat>lookupStoveRecipe(RawBeef.class);
        assertNotNull(cookedMeat);
        assertEquals(cookedMeat.getHealthPoints(), 3);
        
        cookedMeat = this.cookingSkill.<CookedMeat>lookupStoveRecipe(RawRatMeat.class);
        assertNotNull(cookedMeat);
        assertEquals(cookedMeat.getHealthPoints(), 3);
    }
}
