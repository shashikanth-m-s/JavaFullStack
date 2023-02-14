package com.array;

public class CloneArray2 {

	public static void main(String[] args) {
		int intArray[][]= {{1,2,3,4,5},{6,7,8,9,10}};
		
		int cloneArray[][]=intArray.clone();
		
		System.out.println(intArray[0]==cloneArray[0]);
		System.out.println(intArray[1]==cloneArray[1]);

	}

}
