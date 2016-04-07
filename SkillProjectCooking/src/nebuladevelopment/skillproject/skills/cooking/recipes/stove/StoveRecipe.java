/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.skills.cooking.recipes.stove;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class StoveRecipe
{
    private final Class input;
    private final Class output;
    
    public StoveRecipe(Class input, Class output) {
        this.input = input;
        this.output = output;
    }
    
    public Class getInput() {
        return this.input;
    }
    
    public Class getOuput() {
        return this.output;
    }
}
