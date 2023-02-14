package com.loop;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int i,num,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		for(i=1;i<=num;i++) {
			if(num%i==0) {
			s++;
			}
		}
		if(s==2) {
			System.out.println(num+"is an prime number");
		}else
				System.out.println(num+"is not prime number");
		}

	}


