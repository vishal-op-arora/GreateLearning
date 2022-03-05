package JavaWeek01.GLCcode;

import java.util.Random;

public class Test1DArray {

	public static void main(String args[]) {

		int[] A = null;
		int size = 12;

		A = new int[size];
		Random rn = new Random();

		for (int i = 0; i < size; i++) {
			int elemVal = rn.nextInt(100);
			A[i] = elemVal;
		}

		System.out.println("\nlength of Arrary " + A.length);


		System.out.println("\nAll Element of the Arrary ");
		for (int i = 0; i < size; i++) {
			System.out.print(A[i] + ",");
			System.out.println("\n");
		}
		
		System.out.println("\nFinding Minimum of All Element of the Arrary ");
		int minVal=A[0];
		System.out.println("\nFirst Element of Arrary " + A[0]);		
		for (int i = 0; i < size; i++) {
			if(A[i]<minVal) {
				minVal=A[i];
			}
		}
		System.out.println("\nFinding the Average of All Element of the Arrary ");
		int avgVal=0;
		int sumOfAllElem=0;
		for (int i = 0; i < size; i++) {
			sumOfAllElem+=A[i];
		}
		System.out.println("\nSum of All Element of the Arrary "+sumOfAllElem);
		System.out.println("length of Arrary " + A.length);
		System.out.println("\nAverage of All Element of the Arrary "+sumOfAllElem/size);
		

	}

}