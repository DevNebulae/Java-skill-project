/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.policies.fish.collection.tests;

import nebuladevelopment.skillproject.skills.cooking.recipes.policies.fish.collection.FishRecipeCollection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class FishRecipeCollectionTest
{
    private final FishRecipeCollection recipeCollection;

    public FishRecipeCollectionTest()
    {
        this.recipeCollection = new FishRecipeCollection();
    }

    @Test
    public void testGetRecipes()
    {
        assertTrue(this.recipeCollection.getRecipes().length > 0);
    }
}
