package com.greatlearning.ds.week5.mentor;

public class MergeSort {
	
	void sort(int arr[], int left, int right) {
		if(left < right) {
			int mid = (left + right) / 2;
			sort(arr, left, mid);
			sort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}
	

	void merge(int arr[], int left, int mid, int right) {
		
		// find the size of 2 sub arrays
		int n1 = mid-left+1;
		int n2 = right - mid;
		
		// Create Left temp Array
		int[] leftArray = new int[n1];
		
		// Create Right temp Array
		int[] rightArray = new int[n2];
		
		// Copy data from orignal array to left array
		for(int i =0; i < leftArray.length ; i++) {
			leftArray[i] = arr[left + i];
		}
		
		// Copy data from orignal array to right array
		for(int i =0; i < rightArray.length ; i++) {
			rightArray[i] = arr[mid + 1 + i];
		}
		
		// Merg the array
		int i = 0, j = 0;
		int k = left;
		
		while(i < n1 && j < n2) {
			if(leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;			
			}
			else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		
		while(j < n1) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}
}
