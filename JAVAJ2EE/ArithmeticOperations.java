package com.branch;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		int ch;
		float num1,num2,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("MENU");
		
		System.out.println("1.ADDITION");
		
		
			System.out.println("2.SUBRACTION");
			System.out.println("3.MULTIPLICATION");
			System.out.println("4.DIVISION");
			System.out.println("enter YOUR CHOICE");
			 ch=sc.nextInt();
			System.out.println("ENTER 2 NUMBERS");
			num1=sc.nextFloat();
			num2=sc.nextFloat();
			switch(ch) {
			case 1: result=num1+num2;
			System.out.println("SUM="+result);
			break;
			case 2: result=num1-num2;
			System.out.println("difference ="+result);
			break;
			case 3: result=num1/num2;
			System.out.println("division="+result);
			break;
			case 4: result=num1*num2;
			System.out.println("Multiplication="+result);
			break;
			default : System.out.println("invalid");
			
			}
		
		
		

	}

}
