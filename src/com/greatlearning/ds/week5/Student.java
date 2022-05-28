package com.greatlearning.ds.week5;

public class Student {
	final String schoolName = "DSP";
	public void printSchoolName() {
		System.err.println("SchoolName is " + schoolName);
	}
	
	public static void main(String[] args) {
		
		Student[] students = new Student [100];		
		students[2].printSchoolName();

	}
}
