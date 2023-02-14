package com.branch;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int num;
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER A NUMBER FROM 1 TO 5");
		num=sc.nextInt();
		switch(num) {
		case 1: System.out.println("ONE");
		break;
		case 2:System.out.println("two");
		break;
		case 3:System.out.println("THREE");
		break;
		case 4:System.out.println("FOUR");
		break;
		case 5:System.out.println("FIVE");
		break;
		default:System.out.println("INVALID INPUT");
		}
	}

}
