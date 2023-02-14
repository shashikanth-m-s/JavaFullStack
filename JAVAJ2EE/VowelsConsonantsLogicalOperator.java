package com.edu;

import java.util.Scanner;

public class VowelsConsonantsLogicalOperator {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		ch=sc.next().charAt(0);
		
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' ||ch=='o'||ch=='u'){
			System.out.println("It is an vowel");
			
			
		}else {
			System.out.println("It is not an vowel");
		}
	}

}
