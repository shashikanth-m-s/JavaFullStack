package com.loop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num,digit,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		num=sc.nextInt();
		while(num!=0) {
			digit=num%10;
			System.out.println(digit);
			rev=rev*10+digit;
			num=num/10;
			
		}
		System.out.println("Reverse number is"+rev);
		if(num==rev) {
			System.out.println("palindrome");
			
		}else {
			System.out.println("not a plaimdrome");
		}
	}

}
