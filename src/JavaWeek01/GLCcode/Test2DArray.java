package JavaWeek01.GLCcode;

import java.util.Random;

public class Test2DArray {

	public static void main(String args[]) {

		int[][] A = null;
		int rows = 4;
		int cols = 5;

		A = new int[rows][cols];
		Random rn= new Random();
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("[" + i + "][" + j + "] ");
				A[i][j]=rn.nextInt(100);
			}
			System.out.println("\n");
		}
		
		System.out.println("length of Arrary "+A.length);
		System.out.println("First Element of Arrary "+A[0][0]);
		
		System.out.println("\nAll Element of the Arrary ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(A[i][j]+ " ");
			}
			System.out.println("\n");
		}		

	}

}