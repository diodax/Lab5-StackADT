package com.company;

/**
 * Created by Diosdavi on 4/21/2015.
 */
public class LStack implements Stack, Cloneable        // Linked stack class
{
    // Data member
    private StackNode top;                  // Reference to top of stack

    // Constructors and helper method setup
    public LStack()                         // Default Constructor1
    {
        setup();
    }
    public LStack(int size)                 // Constructor2: ignore size
    // for compatibility with AStack
    {
        setup();
    }
    public LStack(LStack valueStack)
    {
        this.top = valueStack.top;
    }

    // Class methods
    private void setup()                    // Called by Constructors only
    {
        this.top = null;
    }

    public LStack clone() {
        try
        {
            return (LStack)super.clone();
        }
        catch (CloneNotSupportedException var)
        {
            var.printStackTrace();
            return null;
        }
    }

    //----- Insert method implementations for the interface Stack here -----//
    public void push(Object newElement)
    {
        if (!this.isFull() && newElement != null)
            this.top = new StackNode(newElement, this.top);
        else
            System.out.println("Can't push this element into the stack.");
    }

    public Object pop()
    {
        if (!this.isEmpty())
        {
            Object topElement = this.top.getElement();
            this.top = this.top.getNext();
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
        this.top = null;        //Putting that garbage collector to use I guess
    }

    public boolean isEmpty()
    {
        if (top == null)
            return true;
        else
            return false;
    }

    public boolean isFull()
    {
        return false;
    }

    public void showStructure()
    {
        if (this.isEmpty())
            System.out.println("Empty stack");
        else
        {
            StackNode iterator = this.top;
            while (iterator != null)
            {
                System.out.print(iterator.getElement() + " ");
                iterator = iterator.getNext();
            }
            System.out.println("\n");
        }
    }

} // class LStack
