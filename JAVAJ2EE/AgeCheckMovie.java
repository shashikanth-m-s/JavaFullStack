package com.inter;

import java.util.Scanner;

public class AgeCheckMovie {

	public static void checkAge(int age) {
		try {

		if(age<18) {
			throw new ArithmeticException("Not eligible for voting");// 
		}else {
			System.out.println("Yor are eligible for voting");
		}
		
	}//try
	catch(ArithmeticException e) {
		e.printStackTrace();
	}
}
public static void main(String[] args) {
  int prage;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter age");
  prage=sc.nextInt();
  checkAge(prage);

}
}


	
