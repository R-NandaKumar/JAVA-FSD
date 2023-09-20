package com.binarysearch;

import java.util.*;  
class BinarySearchApp{  
    public static void main(String args[]){  
        int arr[] = {10,20,30,40,50};  
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the Number to be searched");
        int sc = scan.nextInt();
        int key = sc;  
        int result = Arrays.binarySearch(arr,key);  
        if (result < 0)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
    }  
}  
