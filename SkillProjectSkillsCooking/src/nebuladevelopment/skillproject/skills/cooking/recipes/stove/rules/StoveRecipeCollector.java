/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.stove.rules;

import java.util.HashSet;
import java.util.function.Supplier;
import nebuladevelopment.skillproject.skills.cooking.recipes.base.IRecipeCollector;
import nebuladevelopment.skillproject.skills.cooking.recipes.base.IRecipeMerger;
import nebuladevelopment.skillproject.skills.cooking.recipes.base.implementation.RecipeCollector;
import nebuladevelopment.skillproject.skills.cooking.recipes.base.implementation.RecipeMerger;
import nebuladevelopment.skillproject.skills.cooking.recipes.stove.StoveRecipe;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class StoveRecipeCollector
{
    private final IRecipeCollector<StoveRecipe> recipeCollector;
    private final IRecipeMerger<StoveRecipe> recipeMerger;
    private final HashSet<StoveRecipe> stoveRecipes;
    
    public StoveRecipeCollector()
    {
        this.recipeCollector = new RecipeCollector<>();
        this.recipeMerger = new RecipeMerger<>();
        this.stoveRecipes = new HashSet<>();
    }

    private <R> HashSet<R> mergeRecipes(Supplier<R>... rules)
    {
        HashSet<R> recipes = new HashSet<>();

        for (Supplier<R> rule : rules)
            recipes.add(rule.get());

        return recipes;
    }

    @Override
    public HashSet<T> collectRecipes()
    {
        HashSet<T> recipes = new HashSet<>();

        //Add fish recipes
        recipes.addAll((HashSet<T>) this.mergeRecipes(StoveRecipeRulesFish::anchovyRule, StoveRecipeRulesFish::codRule, StoveRecipeRulesFish::herringRule, StoveRecipeRulesFish::lobsterRule, StoveRecipeRulesFish::mackerelRule, StoveRecipeRulesFish::pikeRule, StoveRecipeRulesFish::salmonRule, StoveRecipeRulesFish::sardineRule, StoveRecipeRulesFish::shrimpRule, StoveRecipeRulesFish::troutRule, StoveRecipeRulesFish::tunaRule));
        //Add meat recipes
        recipes.addAll((HashSet<T>) this.mergeRecipes(StoveRecipeRulesMeat::bearMeatRule, StoveRecipeRulesMeat::beefRule, StoveRecipeRulesMeat::ratMeatRule));

        return recipes;
    }
}
