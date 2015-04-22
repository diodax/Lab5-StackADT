package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Diosdavi on 4/22/2015.
 */
public class PostFix
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String chain = input.next();
        char[] pfxExpression = chain.toCharArray();
        LStack stackElement = new LStack(pfxExpression.length);
        System.out.println("Evaluation of: " + new String(pfxExpression));

        for (int i = 0; i < pfxExpression.length; ++i) {
            if (pfxExpression[i] >= '0' && pfxExpression[i] <= '9') {
                System.out.println("Number: " + pfxExpression[i]);
                stackElement.push(Float.valueOf(pfxExpression[i]) - 48);
            } else if (pfxExpression[i] == '+') {
                System.out.println("Addition: " + pfxExpression[i]);
                float operand1 = Float.valueOf(stackElement.pop().toString());
                float operand2 = Float.valueOf(stackElement.pop().toString());
                stackElement.push(Float.valueOf(operand1 + operand2));
            } else if (pfxExpression[i] == '-') {
                System.out.println("Subtraction: " + pfxExpression[i]);
                float operand1 = Float.valueOf(stackElement.pop().toString());
                float operand2 = Float.valueOf(stackElement.pop().toString());
                stackElement.push(Float.valueOf(operand1 - operand2));
            } else if (pfxExpression[i] == '*') {
                System.out.println("Multiplication: " + pfxExpression[i]);
                float operand1 = Float.valueOf(stackElement.pop().toString());
                float operand2 = Float.valueOf(stackElement.pop().toString());
                stackElement.push(Float.valueOf(operand1 * operand2));
            } else if (pfxExpression[i] == '/') {
                System.out.println("Division: " + pfxExpression[i]);
                float operand1 = Float.valueOf(stackElement.pop().toString());
                float operand2 = Float.valueOf(stackElement.pop().toString());
                stackElement.push(Float.valueOf(operand2 / operand1));
            }
            /*For debugging purposes*/
            //float ph = Float.valueOf(stackElement.pop().toString());
            //System.out.println(ph);
            //stackElement.push(Float.valueOf(ph));
        }
        float outResult = Float.valueOf(stackElement.pop().toString());
        DecimalFormat fmt = new DecimalFormat("0.##");
        System.out.println(fmt.format(outResult));
    }
}
