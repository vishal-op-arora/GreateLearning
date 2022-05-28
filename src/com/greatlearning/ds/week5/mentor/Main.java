package com.greatlearning.ds.week5.mentor;

public class Main {
	
	public static void main(String[] args) {
		
		int arr[] = {3, 4, 2, 1, 9, 8, 7};

		printArray("Original Array", arr);
		
		int array[] = {9, 8, 7, 6, 5, 4, 3, 2};
		
		printArray("Original Array", array);
		MergeSort ms = new MergeSort();
		ms.sort(array, 0, array.length - 1);
		printArray("Sorted Array", array);
	
		RotateArray ra = new RotateArray();
		ra.leftRotate(array);
		printArray("Rotated Array", array);
		ra.leftRotate(array, 2);
		printArray("Rotated Array", array);
	}
	
	
	
	
	// Print Elements
	public static void printArray(String msg, int arr[]) {
		System.out.print(msg + " : ");
		for(int ar : arr) {
			System.out.print(ar + " ");
		}
		System.out.println();
	}
}
