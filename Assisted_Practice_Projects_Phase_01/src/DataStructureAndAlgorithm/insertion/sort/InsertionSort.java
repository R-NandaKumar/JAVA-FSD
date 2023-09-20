package com.insertion.sort;


import java.util.Arrays;

public class InsertionSort {

  public static void insertionSort(int[] arr) {
    int len = arr.length;

    for (int i = 1; i < len; i++) {
      // store the current value at current in key
      int key = arr[i];

      // pointer to index just before the key's index
      int j = i - 1;

      /* move values in arr[0...i-1] greater
       * than key one position to their right
       */
      while (j >= 0 && key < arr[j]) {
        arr[j + 1] = arr[j];
        j--;
      }

      /* store the key just before the last shifted element
       * or after the element just smaller than or equal to the key
       */
      arr[j + 1] = key;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 15, 11, 7, 10, 9 };

    insertionSort(arr);

    System.out.println(Arrays.toString(arr));
  }
}

