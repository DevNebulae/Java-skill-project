/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.items.item;

import nebuladevelopment.skillproject.items.bankable.IBankable;

/**
 *
 * @author Ivo Huntjens, I.J.
 */
public abstract class Item implements IBankable
{
    protected final String name;

    public Item(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
}
