package com.company;

import java.util.Arrays;

/**
 * Created by Diosdavi on 4/21/2015.
 */
public class AStackDwn implements Stack        // Array based stack class
{
    // Data members
    private int top;                // Index for the top element
    private Object [] element;      // Array containing stack elements

    // Constructors and helper method setup
    public AStackDwn()                 // Constructor: default size
    {
        setup(DEF_MAX_STACK_SIZE);
    }
    public AStackDwn(int size)         // Constructor: specific size
    {
        setup(size);
    }

    //Class methods
    private void setup(int size)    // Called by constructors only
    {
        this.element = new Object[size];
        top = element.length;
    }

    //----- Insert method implementations for the interface Stack here -----//
    public void push(Object newElement)
    {
        top--;
        this.element[top] = newElement;
    }

    public Object pop()
    {
        Object topElement = this.element[top];
        this.element[top] = null;
        top++;
        return topElement;
    }

    public void clear()
    {
        Arrays.fill(this.element, null);
        top = element.length;
    }

    public boolean isEmpty()
    {
        if (top >= element.length)
            return true;
        else
            return false;
    }

    public boolean isFull()
    {
        if (top <= 0)
            return true;
        else
            return false;
    }

    public void showStructure()
    {
        if (this.isEmpty())
            System.out.println("Empty stack");
        else
        {
            for (int i = 0; i < this.element.length; ++i)
            {
                if (this.element[i] != null)
                    System.out.print(this.element[i] + " ");
            }
            System.out.println("\n");
        }
    }

}   // class AStackDwn
