/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.policies.meat.collection.tests;

import nebuladevelopment.skillproject.skills.cooking.recipes.policies.fish.collection.FishRecipeCollection;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.meat.collection.MeatRecipeCollection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class MeatRecipeCollectionTest
{
    private final MeatRecipeCollection recipeCollection;

    public MeatRecipeCollectionTest()
    {
        this.recipeCollection = new MeatRecipeCollection();
    }

    @Test
    public void testGetRecipes()
    {
        assertTrue(this.recipeCollection.getRecipes().length > 0);
    }
}
