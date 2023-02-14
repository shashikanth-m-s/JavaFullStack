package com.inter;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		float a,b,c=0;
		System.out.println("enter a,b");
		Scanner sc = new Scanner(System.in);
		a=sc.nextFloat();
		b=sc.nextFloat();
		System.out.println("before division");
		try {
			c=a/b;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		finally {
			System.out.println("executes always");
		}
		System.out.println("c="+c);
		System.out.println("After divsion");

	}

}
