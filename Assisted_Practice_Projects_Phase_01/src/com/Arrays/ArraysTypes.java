package com.Arrays;

public class ArraysTypes{
    public static void main(String[] args) {
        // Single-Dimensional Array
        int[] singleDimensionalArray = {1, 2, 3, 4, 5};
        
        System.out.println("Single-Dimensional Array:");
        for (int i = 0; i < singleDimensionalArray.length; i++) {
            System.out.println("Element " + i + ": " + singleDimensionalArray[i]);
        }

        // 2D array
        int[][] multiDimensionalArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("\nMulti-Dimensional Array (2D Array):");
        for (int row = 0; row < multiDimensionalArray.length; row++) {
            for (int col = 0; col < multiDimensionalArray[row].length; col++) {
                System.out.println("Element at [" + row + "][" + col + "]: " + multiDimensionalArray[row][col]);
            }
        }
    
        
    }
}

