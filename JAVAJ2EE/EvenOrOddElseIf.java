package com.edu;

import java.util.Scanner;

public class EvenOrOddElseIf {

	
		int num;
		void inputNum() {
			Scanner sc=new Scanner(System.in);
			System.out.println("EnterNumber");
			num=sc.nextInt();
		}
		void checkEvenOdd() {
			if(num%2==0) {
				System.out.println(num+" even num");
						
			}
			else {
				System.out.println(num+" even odd");
			}
		}
		public static void main(String[] args) {
			EvenOrOddElseIf ob=new EvenOrOddElseIf();
			ob.inputNum();
			ob.checkEvenOdd();
		}
}