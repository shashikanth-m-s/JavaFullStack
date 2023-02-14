package com.loop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int i,num,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		for(i=2;i<=num/2;i++) {
			if(num%i==0) {
			s++;
			}
		}
		if(s==0) {
			System.out.println(num+"is an prime number");
		}else
				System.out.println(num+"is not prime number");
		}

	}

