/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.food.meat.cooked;

import nebuladevelopment.skillproject.food.EdibleCookedFood;
import nebuladevelopment.skillproject.food.meat.base.IMeat;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class CookedMeat extends EdibleCookedFood implements IMeat
{
    private static final int HEALTHPOINTS = 3;
    
    public CookedMeat()
    {
        super(HEALTHPOINTS);
    }  
}
