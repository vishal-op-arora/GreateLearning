/*
	Question 1
	
	In a stable, there are N horses, with different speeds, None of the two horses has the same speed.
	The speed of the horse i is represented by S[i]. Find the two horses from the group such that the difference between their speeds is minimum, print the difference as output.
	
	Time Complexity Restraint = O(nlogn)
	
	Sample input
	
	N=5
	S[]= { 4,9,32,1,18,13}
	
	Sample Output
	The minimum difference between the speeds of various horses is 3 {4-1}

 */

package com.greatlearning.ds.week5.question;

import java.util.Scanner;

public class HorseSpeed {

	void merge(int arr[], int left, int mid, int right) {
		// Find sizes of two sub arrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;

		/* Create temporary arrays */
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		/* Copy data to temporary arrays */
		for (int i = 0; i < n1; ++i)
			leftArray[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = arr[mid + 1 + j];

		/* Merge the temporary arrays */

		// Initial indexes of first and second sub-arrays
		int i = 0, j = 0;

		// Initial index of merged sub-array array
		int k = left;
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
                       /* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	// Main function that sorts array[left...right] using merge()
	void sort(int arr[], int left, int right) {
		if (left < right) {
			// Find the middle point
			int mid = (left + right) / 2;

			// Sort first and second halves
			sort(arr, left, mid);
			sort(arr, mid + 1, right);

			// Merge the sorted halves
			merge(arr, left, mid, right);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("enter the no of horses");
		size = sc.nextInt();
		int speed[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the speed of horse " + (i + 1));
			speed[i] = sc.nextInt();
		}

		HorseSpeed horseSpeed = new HorseSpeed();
		horseSpeed.sort(speed, 0, speed.length - 1);

		System.out.println("the sorted array is");
		for (int i = 0; i < size; i++)
			System.out.print(speed[i] + " ");
		System.out.println();
		
		System.out.println("the minimum difference among the speeds of horses is ");
		int minimumDifference = Integer.MAX_VALUE;
		
		for (int i = 0; i < size - 1; i++) {
			if ((speed[i + 1] - speed[i]) < minimumDifference)
				minimumDifference = speed[i + 1] - speed[i];
		}

		System.out.println(minimumDifference);
	}

}

