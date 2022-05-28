package com.greatlearning.ds.week5.mentor;

public class RotateArray {
	
	void leftRotate(int arr[]) {
		
		int temp = arr[0];
		for(int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = temp;
	}
	
	void leftRotate(int arr[], int leftRotation ) {
		
		while(leftRotation != 0) {
			leftRotate(arr);
			leftRotation--;
		}
		
	}
}
