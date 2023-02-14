package com.edu;

import java.util.Scanner;

public class PositiveOrNegative {
	int num;
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		num=sc.nextInt();
	}
	void checkNum() {
		if(num >0) {
			System.out.println("The number is positive");
		}
		else
			if(num<0) {
				System.out.println("The number is negative");
			}
	}
	

	public static void main(String[] args) {
		PositiveOrNegative ob=new PositiveOrNegative();
		ob.inputData();
		ob.checkNum();
		

	}

}
