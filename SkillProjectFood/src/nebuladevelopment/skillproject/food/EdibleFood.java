/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.food;

import nebuladevelopment.skillproject.food.base.IFood;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public abstract class EdibleFood implements IFood
{
    private final int healthPoints;

    public EdibleFood(int healthPoints)
    {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints()
    {
        return this.healthPoints;
    }
}
