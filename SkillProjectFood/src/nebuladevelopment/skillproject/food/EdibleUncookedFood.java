/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.food;

import nebuladevelopment.skillproject.food.cooked.IUncooked;
import nebuladevelopment.skillproject.food.edibility.IEdible;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public abstract class EdibleUncookedFood extends EdibleFood implements IEdible, IUncooked
{
    public EdibleUncookedFood(int healthPoints)
    {
        super(healthPoints);
    }
}
