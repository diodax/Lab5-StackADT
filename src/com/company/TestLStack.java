package com.company;

import java.util.Scanner;

/**
 * Created by Diosdavi on 4/21/2015.
 */
public class TestLStack
{
    public static void main(String[] args)
    {
        //int stackLength = 9;
        LStack stackElement = new LStack();
        menu(stackElement);
    }

    static void menu(Stack stackElement)
    {
        Scanner input = new Scanner(System.in);
        String command;
        String[] menuList = new String[6];
        char[] order;

        do
        {
            System.out.println("------Command List------\n");
            menuList[0] = "[1] +x: Push element x onto the top of the stack.";
            menuList[1] = "[2] - : Pop the top element and output it.";
            menuList[2] = "[3] E : Report whether the stack is empty.";
            menuList[3] = "[4] F : Report whether the stack is full.";
            menuList[4] = "[5] C : Clear the stack.";
            menuList[5] = "[6] Q : Exit the test program.";

            for (int i = 0; i < menuList.length; ++i)
                System.out.println(menuList[i]);
            System.out.println("Write a command: ");
            command = input.next();
            order = command.toCharArray();

            switch (order[0])
            {
                case '+':
                    System.out.println("Input the data to push into the stack: ");
                    Scanner data = new Scanner(System.in);
                    stackElement.push(Integer.valueOf(data.nextInt()));
                    stackElement.showStructure();
                    break;
                case '-':
                    stackElement.pop();
                    stackElement.showStructure();
                    break;
                case 'E':
                case 'e':
                    if(stackElement.isEmpty())
                        System.out.println("The stack is empty.");
                    else
                        System.out.println("The stack has one or more elements.");
                    break;
                case 'F':
                case 'f':
                    if(stackElement.isFull())
                        System.out.println("The stack is full.");
                    else
                        System.out.println("The stack is not full.");
                    break;
                case 'C':
                case 'c':
                    stackElement.clear();
                    break;
                case 'Q':
                case 'q':
                    break;
                default:
                    System.out.println("Invalid command, try again.");
                    break;
            }
        } while (order[0] != 'Q' && order[0] != 'q');
    }
}
