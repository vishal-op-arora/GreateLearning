package com.greatlearning.ds.week5;

public class StudentThis {
	
	/*
	 * this() or this(name)... constructor called inside other constructuor 
	 */
	StudentThis(){
		System.out.println("1. This is default Constructor");
	}
	
	StudentThis(String name){
		this();
		System.out.println("2. This single Parameter Constructor " + name);
	}
	
	StudentThis(String name, int num){
		this(name);
		System.out.println("3. This two Parameters Constructor " + name + "  " + num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentThis stu = new StudentThis("--name---", 101);
		
		int i = 4 ;
		int[] num = new int[i];
		
		TestClass[] myTectClassObj = new TestClass[4];
	}

}
