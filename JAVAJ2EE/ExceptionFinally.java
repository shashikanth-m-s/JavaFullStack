package com.inter;


public class ExceptionFinally {

	public static void main(String[] args) {
		int a[]= {6,4,2};
		System.out.println("Before Array element display");
		System.out.println("First Element "+a[0]);
		System.out.println("Second Element "+a[1]);
		System.out.println("Third Element "+a[2]);
		try {
		System.out.println("Fourth Element "+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("hello");
			e.printStackTrace();
		}
		System.out.println("Hello everyone");
	}

}
