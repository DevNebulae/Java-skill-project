/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebuladevelopment.skillproject.items.notes;

import nebuladevelopment.skillproject.items.bankable.IBankable;
import nebuladevelopment.skillproject.items.unstackable.UnstackableItem;

/**
 * A note is a stack of non-stackable items.
 *
 * @author Ivo Huntjens, I.J.
 * @param <T>
 */
public class Note<T extends UnstackableItem> implements IBankable
{
    protected T item;
    protected int size;

    /**
     *
     * @param item
     * @param size
     */
    public Note(T item, int size)
    {
        this.item = item;
        this.size = size;
    }

    /**
     * Add items to the stack of non-stackable items.
     *
     * @param amount
     */
    public void deposit(int amount)
    {
        this.size += amount;
    }

    /**
     * Destroys the current note by setting the item reference to
     * <b><u>null</u></b> and setting the amount of items to 0.
     */
    public void destroy()
    {
        this.size = 0;
        this.item = null;
    }

    public T getItem()
    {
        return this.item;
    }

    public int getSize()
    {
        return this.size;
    }

    /**
     * Withdraw an amount from a note.
     *
     * @param amount
     * @return A new note with the amount withdrawn from the current note.
     */
    public Note<T> withdraw(int amount)
    {
        this.size -= amount;
        return new Note<>(this.item, amount);
    }
}
