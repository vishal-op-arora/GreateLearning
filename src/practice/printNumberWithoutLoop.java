package practice;

public class printNumberWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumberWithoutLoop pn = new printNumberWithoutLoop();
		pn.printAssendingNumberRecursive(1, 20);
	}
	
	public void printAssendingNumberRecursive(int start, int end) {
		if(start <= end) {
			System.out.println(start);
			printAssendingNumberRecursive(start + 1, end);
		}
	}

}
