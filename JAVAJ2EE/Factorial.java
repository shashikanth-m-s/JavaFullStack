package com.loop;

public class Factorial {

	public static void main(String[] args) {
		int i; double factorial=1;
		int number=100;
		for(i=1;i<=number;i++) {
			factorial=factorial*i;
		}
		System.out.println( "factorial of number is:"+factorial);
		

	}

}
