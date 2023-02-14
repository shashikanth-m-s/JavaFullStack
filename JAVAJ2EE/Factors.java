package com.loop;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Print factors");
		System.out.println("enter number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}

	}

}
