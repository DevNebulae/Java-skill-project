/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import nebuladevelopment.skillproject.food.cooked.ICooked;
import nebuladevelopment.skillproject.skills.base.ISkill;
import nebuladevelopment.skillproject.skills.cooking.recipes.policies.base.IRecipe;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class CookingSkill implements ISkill
{
    private final HashSet<IRecipe> recipes;

    public CookingSkill()
    {
        this.recipes = new HashSet<>();
    }

    public void addRecipe(IRecipe recipe)
    {
        this.recipes.add(recipe);
    }

    public void addRecipes(IRecipe... recipes)
    {
        for (IRecipe recipe : recipes)
            this.addRecipe(recipe);
    }

    public void addRecipes(Collection<? extends IRecipe> recipes)
    {
        recipes.forEach(recipe -> this.addRecipe(recipe));
    }

    public HashSet getRecipesOfType(Class type)
    {
        return (HashSet) this.recipes.stream().filter(r -> r.getClass() == type);
    }

    public <T extends ICooked> T cook(Class foodKey) throws IllegalAccessException, IllegalArgumentException, InstantiationException, InvocationTargetException, NoSuchMethodException
    {
        return null;
    }
}
