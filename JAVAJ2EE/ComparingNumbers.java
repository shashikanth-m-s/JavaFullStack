package com.edu;

import java.util.Scanner;

public class ComparingNumbers {
	int num;
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		num=sc.nextInt();
		
	}
	void checknum() {
		if(num==10) {
			System.out.println("the number is 10");
			
		}else if(num==20) {
			System.out.println("The number is 20");
			
		}else if(num==30) {
			System.out.println("The number is 30");
			
		}else {
			System.out.println("The number is 40");
		}
	}

	public static void main(String[] args) {
		ComparingNumbers ob=new ComparingNumbers();
		ob.inputData();
		ob.checknum();
	}

		

	}


