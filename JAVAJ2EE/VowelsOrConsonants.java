package com.edu;
import java.util.Scanner;

public class VowelsOrConsonants{
	

	public static void main(String[] args) {
		
	char ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a char");
	ch=sc.next().charAt(0);
	
	
	if(ch=='A') {
		System.out.println("A is an vowel");
		
	}else if(ch=='E') {
		System.out.println("E is an vowel");
		
	}else if(ch=='I') {
		System.out.println("I is an vowel");
	}else if(ch=='O') {
		System.out.println("O is an vowel");
	}else if(ch=='U') {
		System.out.println("U is an vowel");
	}else {
		System.out.println("it is consonant");
	}

	}	
}

