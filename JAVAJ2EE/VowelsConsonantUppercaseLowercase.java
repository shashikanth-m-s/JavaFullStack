package com.edu;

import java.util.Scanner;

public class VowelsConsonantUppercaseLowercase {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a char");
		ch=sc.next().charAt(0);
		
		
		if(ch=='A'|| ch=='a') {
			System.out.println("A is an vowel");
			
		}else if(ch=='E'|| ch=='e') {
			System.out.println("E is an vowel");
			
		}else if(ch=='I' || ch=='i') {
			System.out.println("I is an vowel");
		}else if(ch=='O' || ch=='o') {
			System.out.println("O is an vowel");
		}else if(ch=='U' || ch=='u') {
			System.out.println("U is an vowel");
		}else {
			System.out.println("it is consonant");
		}


	}

}
