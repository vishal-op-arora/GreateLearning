package DynamicArrays;

public class DynamicArrayTest {

	public static void main(String[] args) {
		DynamicArray array = new DynamicArray(5);
		System.out.println(array.getArray());
		array.displayElements();

		array.insertAtEnd(4);
		System.out.println(array.getArray());
		array.insertAtEnd(5);
		System.out.println(array.getArray());
		System.out.println(array.getArray());
		array.insertAtEnd(6);
		array.insertAtEnd(7);
		array.insertAtEnd(8);
		array.insertAtEnd(10);
		array.insertAtEnd(11);
		//array.displayElements();
		//System.out.println(array.getLenght());
		System.out.println(array.getArray());
		//array.displayElements();
		/*
		int[] newArray = new int [array.getLenght()];
		System.out.println(newArray.length);x
		System.out.println(newArray);
		newArray[1] = 15;
		System.out.println(newArray + " " + newArray[1] + " " + array.getElement(1));
		*/
	}

}
