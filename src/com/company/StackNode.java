package com.company;

/**
 * Created by Diosdavi on 4/21/2015.
 */

// Facilitator class for the Stack class
public class StackNode                  // A singly linked list node
{
    // Data members
    private Object element;             // Object for this node
    private StackNode next;             // Reference to next node in list

    // Because there is no access labels (public, private or protected),
    // access is limited to the package where these methods are declared

    // Constructor
    StackNode(Object newElement, StackNode nextVal)
    {
        this.element = newElement;
        this.setNext(nextVal);
    }

    // Class methods --
    // Other classes in this package need to know about next and element
    // or set next
    StackNode getNext()                 // Returns reference to next node
    {
        return this.next;
    }
    Object getElement()                 // Returns element's value
    {
        return this.element;
    }
    void setNext(StackNode nextVal)     // Sets value of next
    {
        this.next = nextVal;
    }
}   // class StackNode
