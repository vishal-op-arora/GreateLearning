package DynamicArray;

public class DynamicArray {
	
	int size = 0;
	int capacity = 0;
	public int [] array = null;
	DynamicArray(int size){
		this.array = new int[size];
	}
	
	
	/**
	 * 
	 * @param element
	 *//*
	void insertAtStart(int element) {
		
		int[] temp = null;
		
		if (size > getLength()) {
			temp = new int[size];
			for (int index = 0; index < )
		}
	}
	*/
	/**
	 * 
	 * @param element
	 */
	void insertAtEndOld(int element) {
		int[] temp = null;
		
		if(size < getLenght()) {
			array[size] = element;
		}
		else {
			temp = new int[size+1];
			for(int index = 0; index < getLenght(); index++) {
				temp[index] = array[index];
			}
			temp[size] = element;
			array = temp;
		}
		
		size++;
	}
	
	/**
	 * 
	 * @param element
	 */
	void insertAtEnd(int element) {
		
		int[] temp = new int[getLenght()+1];
		int index = 0;
		
		for(index = 0; index < getLenght(); index++) {
			temp[index] = array[index];
		}
		
		temp[index] = element;
		
		array = temp;
		
	}
	
	
	/**
	 * Get array
	 * @return
	 */
	int[] getArray() {
		return array;
	}
	
	/**
	 * 
	 * @return length of array
	 */
	int getLenght() {
		return array.length;
	}
	
	
	/**
	 * 
	 * @param index
	 * @return
	 */
	int getElement(int index) {
		if (getLenght() <= index) {
			return -1;
		}
		else {
			return array[index];
		}
	}
	
	
	/**
	 * 
	 */
	void displayElements() {
		for (int index = 0; index < getLenght(); index ++) {
			System.out.print(array[index]);
			if(index < getLenght()-1)
				System.out.print(", ");
		}
		System.out.println();
	}
}
