package com.loop;

import java.util.Scanner;

class Fibonacci{
	
	int f1,f2,f3,terms;
	
	Fibonacci(){
		f1=0;
		f2=1;
	}
	
	void inputdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of terms");
		terms=sc.nextInt();
	}
	
	void generatefibo() {
		System.out.println("fibonacci series");
		System.out.println(f1);
		System.out.println(f2);
		for(int i=1;i<=terms-2;i++) {
			f3=f1+f2;
		System.out.println(f3);
		f1=f2;
		f2=f3;
		}
	}
}

public class FiboSeries {

	public static void main(String[] args) {
		
		Fibonacci ob = new Fibonacci();
		ob.inputdata();
		ob.generatefibo();
		
		

	}

}
