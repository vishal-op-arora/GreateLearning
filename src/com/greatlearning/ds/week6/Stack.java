package com.greatlearning.ds.week6;

class Stack {

	static final int sizeOfStack = 5;
	int currentPointer;
	int stackArray[] = new int[sizeOfStack];
	
	public Stack() {
		currentPointer = -1;
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println(stack.pop() + " Popped from stack");
		stack.push(2);
		stack.push(45);
		stack.push(65);
		stack.push(21);
		stack.push(60);
		stack.push(75);
		stack.printStack();
		System.out.println(stack.pop() + " Popped from stack");
		System.out.println(stack.pop() + " Popped from stack");
		stack.printStack();


	}
	
	boolean push(int num) {
		if(currentPointer >= (sizeOfStack-1)) {
			System.out.println(num + " not pushed. Stack Overflow");
			return false;
		}
		else {
			stackArray[++currentPointer] = num;
			System.out.println(num + " pushed into Stack");
			return false;
		}
	}
	
	int pop() {
		if(currentPointer < 0) {
			System.out.print("Stack Underflow ");
			return 0;
		}
		else {
			int num = stackArray[currentPointer--];
			return num;
		}
	}
	
	void printStack() {
		System.out.print("Stack Elements :: ");
		for(int i = currentPointer; i > -1; i--) {
			System.out.print(stackArray[i] + " ");
		}
		System.out.println();
	}

}
