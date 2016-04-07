/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.items.stackable;

import nebuladevelopment.skillproject.items.item.Item;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public abstract class StackableItem extends Item
{
    protected final int maximumStackSize;
    
    public StackableItem(int maximumStackSize, String name) {
        super(name);
        this.maximumStackSize = maximumStackSize;
    }
}
