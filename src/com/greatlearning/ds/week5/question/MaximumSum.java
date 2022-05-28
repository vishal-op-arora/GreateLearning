/*
 * 
Maximum Pair

You have given a sequence a1, a2, ..., aN. Find the maximum possible value of ai + aj, where 1 ≤ i < j ≤ N.
Sort the array using Quick Sort algorithm

Input:
1
4
5 1 3 4

Output:
9
 */

package com.greatlearning.ds.week5.question;

import java.util.Scanner;

public class MaximumSum {

	static int partition(int array[], int low, int high)
	    {
	        int pivot = array[high]; 
	        int i = (low-1); // index of smaller element
	        for (int j=low; j<high; j++)
	        {
	            // If current element is smaller than or
	            // equal to pivot
	            if (array[j] <= pivot)
	            {
	                i++;
	  
	                // swap arr[i] and arr[j]
	                int temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }
	  
	        // swap arr[i+1] and arr[high] (or pivot)
	        int temp = array[i+1];
	        array[i+1] = array[high];
	        array[high] = temp;
	  
	        return i+1;
	    }
	  
	  
	    /* The main function that implements QuickSort()
	      arr[] --> Array to be sorted,
	      low  --> Starting index,
	      high  --> Ending index */
	  static void sort(int arr[], int low, int high)
	    {
	        if (low < high)
	        {
	            /* pi is partitioning index, arr[pi] is 
	              now at right place */
	            int pi = partition(arr, low, high);
	  
	            // Recursively sort elements before
	            // partition and after partition
	            sort(arr, low, pi-1);
	            sort(arr, pi+1, high);
	        }
	    }
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("enter the size of array");
		size = sc.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the value " + (i + 1));
			array[i] = sc.nextInt();
		}
		
		MaximumSum.sort(array, 0, array.length-1);
		
		System.out.println("array after sorting is");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		System.out.println("the max sum possible is "+(array[size-1]+array[size-2]));
	}
}

