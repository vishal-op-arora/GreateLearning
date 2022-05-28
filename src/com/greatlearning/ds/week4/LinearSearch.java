package com.greatlearning.ds.week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		// Array
		int[]  array = {1, 3, 5, 7, 2, 32, 56, 11, 9, 8, 15};
		printArray("Array", array);
		
		// Key element for which index needs to find
		int keyElement = 32;
		int keyElementIndex = linearSearch(array, keyElement);
		System.out.println("Key element " + keyElement + " index is :: " + keyElementIndex);
		System.out.println("----------");
		
		// List
		List<Integer> list = new ArrayList<Integer>();
		for(int arr : array) {
			list.add(arr);
		}
		printList("List", list);
		
		// Key element for which index needs to find
		keyElement = 56;
		keyElementIndex = linearSearch(list, keyElement);
		System.out.println("Key element " + keyElement + " index is :: " + keyElementIndex);

	}
	
	public static int linearSearch(int intArray[], int keyElement) {
		int index = 0;
		for (int num : intArray) {
			if(num == keyElement) {
				break;
			}
			index++;
		}
		return index;
	}
	
	// Print Array
	public static void printArray(String msg, int[] array) {
		System.out.print(msg + " : ");
		for(int arr : array) {
			System.out.print(arr + " ");
		}
		System.out.println();
	}
	
	
	public static int linearSearch(List<Integer> list, int keyElement) {
		int index = 0;
		for (Integer num : list) {
			if(num.intValue() == keyElement) {
				break;
			}
			index++;
		}
		return index;
	}
	
	// Print List
	public static void printList(String msg, List<Integer> list) {
		System.out.print(msg + " : ");
		for(int eachElement : list) {
			System.out.print(eachElement + " ");
		}
		System.out.println();
	}
	
}