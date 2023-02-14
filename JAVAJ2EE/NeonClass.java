package com.cons;

import java.util.Scanner;

public class NeonClass {

	public static void main(String[] args) {
		int sum=0,number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		
		int square=number*number;
		while(square!=0) {
			int digit = square%10;
			sum = sum+digit;
			square=square/10;
		}
		if(number==sum) {
			System.out.println(number+"is a neon number");
		}else {
				System.out.println(number+"is not a neon number");
		}
	}

}
