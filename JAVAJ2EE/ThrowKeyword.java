package com.inter;

import java.util.Scanner;

public class ThrowKeyword {

	public static void main(String[] args) {
		int a,b,c=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("value of a");
		a = sc.nextInt();
		System.out.println("value of b");
		b = sc.nextInt();
		try {
			if(b==0) {
				throw new ArithmeticException("divide by zero");
				
			}
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
