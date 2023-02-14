package com.branch;

import java.util.Scanner;

public class VowelsOrNot {

	public static void main(String[] args) {
		char ch;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER A CHARACTER");
		ch=sc.next().charAt(0);
		switch(ch) {
		case 'A':System.out.println("A IS AN VOWEL");
		break;
		case 'a':System.out.println("a is an vowel");
		break;
		case 'E':System.out.println("E IS AN VOWEL");
		break;
		case 'e':System.out.println("e is an vowel");
		break;
		case 'I':System.out.println("I IS AN VOWEL");
		break;
		case 'i':System.out.println("i is an vowel");
		break;
		case 'O':System.out.println("O IS AN VOWEL");
		break;
		case 'o':System.out.println("o is an vowel");
		break;
		case 'U':System.out.println("U IS  AN VOWEL");
		break;
		case 'u':System.out.println("u is an vowel");
		break;
		default : System.out.println("ENTERED CHARACTER IS NOT AN VOWEL");
		}
	

	}

}
