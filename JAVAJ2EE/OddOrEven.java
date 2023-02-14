package com.branch;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
	 
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		switch(num%2){   //0 or 1
		case 0:
			System.out.println(num+"is an even number");
			break;
		case 1:
			System.out.println(num+"is an odd number");
			break;
		//default : System.out.println( "invalid");
			
		}

	}

}
