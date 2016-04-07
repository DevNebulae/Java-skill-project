/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking;

import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import nebuladevelopment.skillproject.food.cooked.ICooked;
import nebuladevelopment.skillproject.skills.cooking.recipes.pastry.PastryRecipe;
import nebuladevelopment.skillproject.skills.cooking.recipes.stove.StoveRecipe;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class CookingSkill
{
    private final HashSet<PastryRecipe> pastryRecipes;
    private final HashMap<Class, Class> stoveRecipes;

    public CookingSkill()
    {
        this.pastryRecipes = new HashSet<>();
        this.stoveRecipes = new HashMap<>();
    }

    public void addStoveRecipe(StoveRecipe recipe)
    {
        this.stoveRecipes.put(recipe.getInput(), recipe.getOuput());
    }

    public void addStoveRecipes(StoveRecipe... recipes)
    {
        for (StoveRecipe recipe : recipes)
            this.addStoveRecipe(recipe);
    }

    public void addStoveRecipes(HashSet<StoveRecipe> recipes)
    {
        recipes.stream().forEach((recipe) -> this.addStoveRecipe(recipe));
    }

    public Map<Class, Class> getStoveRecipes()
    {
        return Collections.unmodifiableMap(this.stoveRecipes);
    }

    public <T extends ICooked> T lookupStoveRecipe(Class foodKey) throws IllegalAccessException, IllegalArgumentException, InstantiationException, InvocationTargetException, NoSuchMethodException
    {
        if (this.stoveRecipes.containsKey(foodKey))
            return (T) this.stoveRecipes.get(foodKey).getConstructor().newInstance();
        else
            return null;
    }
}
