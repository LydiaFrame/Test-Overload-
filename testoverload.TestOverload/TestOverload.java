/*
 * Program: TestOverload.java
 * Student: Lydia Frame 
 * Purpose: a program that uses overloaded methods to find the square root of two integer values 
 * and two floating point value. Have one method return the values and one void method. 
 * Print all results with formatted print statements.
*/

import java.util.Scanner;

public class TestOverload {
    
    public static void main(String[] args) {
        // Call methods to get square roots
        double intResult1 = sqrt(6);
        double intResult2 = sqrt(8);

        double floatResult1 = overload(6.0f);
        double floatResult2 = overload(8.0f);

        // Print results
        System.out.println("Integer results:");
        System.out.println("Square root of 6 = " + intResult1);
        System.out.println("Square root of 8 = " + intResult2);

        System.out.println("Float results:");
        System.out.println("Square root of 6.0f = " + floatResult1);
        System.out.println("Square root of 8.0f = " + floatResult2);

        // Print square roots using void method
        method(6, 8);
    }

    // Method to return the square root of an integer
    public static double sqrt(int num1) {
        return Math.sqrt(num1);
    }

    // Method to return the square root of a floating-point number
    public static double overload(float num1) {
        return Math.sqrt(num1); 
    }

    // Method to print the square roots of two numbers
    public static void method(double num1, double num2) {
        System.out.println("Square root of " + num1 + " = " + Math.sqrt(num1));
        System.out.println("Square root of " + num2 + " = " + Math.sqrt(num2));
    }
}




