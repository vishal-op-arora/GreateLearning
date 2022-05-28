package com.greatlearning.ds.week5;

import java.util.*;
class Main{
    // Driver method to test above
    public static void main(String args[]) {
    	
    	int itr = 0;
        //declare an array of integers
        int intArray[] = {6,7,8,5,4};
        //print original array
        System.out.println("Original array: " + Arrays.toString(intArray));
        int n = intArray.length;
        //iterate over the array comparing adjacent elements
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                //if elements not in order, swap them    
                if (intArray[j] > intArray[j+1])  {
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                    itr++;
                }
        //print the sorted array        
        System.out.println("Sorted array: " + Arrays.toString(intArray));
        System.out.println(itr);
    }
}