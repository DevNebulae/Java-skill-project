/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.food.poultry.cooked;

import nebuladevelopment.skillproject.food.EdibleCookedFood;
import nebuladevelopment.skillproject.food.poultry.base.IPoultry;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public class CookedChicken extends EdibleCookedFood implements IPoultry
{
    private static final int HEALTHPOINTS = 3;

    public CookedChicken()
    {
        super(HEALTHPOINTS);
    }
}
