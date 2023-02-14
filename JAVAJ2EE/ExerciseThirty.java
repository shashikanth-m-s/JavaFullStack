package com.lab;

public class ExerciseThirty {

	public static void main(String[] args) {
	try {
		int[] numbers = {1,2,3};
		System.out.println(numbers[50]);
	}
	catch(Exception e) {
		System.out.println("error in code");
	}
	finally {
		System.out.println("important code will be executed");
	}

	}

}

