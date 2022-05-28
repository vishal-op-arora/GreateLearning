package com.greatlearning.ds.week5;

public class LiearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LiearSearch ls = new LiearSearch();
		int array[] = {5, 3, 2, 1};
		ls.unsortedLinearSearch(array, 4, 0);
				

	}

	int unsortedLinearSearch(int arr[], int size, int element)
	{
	    int index = 0;

	    for(int i = 0; i <= size; i++)

	    {
	        if(arr[i] == element)

	        {
	            index = i;
	            break;
	        }
	    }
	    return index;
	}
}
