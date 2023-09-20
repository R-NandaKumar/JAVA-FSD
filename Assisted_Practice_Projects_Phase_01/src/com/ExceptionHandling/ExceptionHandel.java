package com.ExceptionHandling;

public class ExceptionHandel {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // This block is executed no matter what
            System.out.println("Program completed.");
        }
    }

    public static int divide(int dividend, int divisor) {
        // Attempt to divide two numbers
        return dividend / divisor;
    }
}

