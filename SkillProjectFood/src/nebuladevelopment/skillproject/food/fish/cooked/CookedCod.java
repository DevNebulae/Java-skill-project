/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.food.fish.cooked;

import nebuladevelopment.skillproject.food.EdibleCookedFood;
import nebuladevelopment.skillproject.food.fish.base.IFish;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class CookedCod extends EdibleCookedFood implements IFish
{
    private static final int HEALTHPOINTS = 3;
    
    public CookedCod() {
        super(HEALTHPOINTS);
    }
}
