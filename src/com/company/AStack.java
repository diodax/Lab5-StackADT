package com.company;

import java.util.Arrays;

/**
 * Created by Diosdavi on 4/20/2015.
 */
public class AStack implements Stack        // Array based stack class
{
    // Data members
    private int top;                // Index for the top element
    private Object [] element;      // Array containing stack elements

    // Constructors and helper method setup
    public AStack()                 // Constructor: default size
    {
        setup(DEF_MAX_STACK_SIZE);
    }
    public AStack(int size)         // Constructor: specific size
    {
        if (size > 0)
            setup(size);
        else
            System.out.println("Constructor failed, stack size is less than 0.");
    }

    //Class methods
    private void setup(int size)    // Called by constructors only
    {
        this.element = new Object[size];
        top = -1;
    }

    //----- Insert method implementations for the interface Stack here -----//
    public void push(Object newElement)
    {
        if (!this.isFull() && newElement != null)
        {
            top++;
            this.element[top] = newElement;
        }
        else
            System.out.println("Can't push this element into the stack.");
    }

    public Object pop()
    {
        if (!this.isEmpty())
        {
            Object topElement = this.element[top];
            this.element[top] = null;
            top--;
            return topElement;
        }
        else
        {
            System.out.println("Can't pop, stack is empty.");
            return null;
        }
    }

    public void clear()
    {
        Arrays.fill(this.element, null);
        top = -1;
    }

    public boolean isEmpty()
    {
        if (top < 0)
            return true;
        else
            return false;
    }

    public boolean isFull()
    {
        if (top + 1 >= this.element.length)
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

}   // class AStack
