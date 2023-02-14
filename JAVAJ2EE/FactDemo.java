package com.cons;

import java.util.Scanner;

class FactorialNumber{
	
	int i;
	int number;
	double factorial;
	
	FactorialNumber(){
		factorial=1;
	}
	
	void inputData() {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
	}
	
	void calculate() {
		for(int i=1;i<=number;i++) {
			factorial=factorial*i;
		}
		System.out.println("factorial of number is:"+factorial);
	}
	
}
public class FactDemo {

	public static void main(String[] args) {
		FactorialNumber ob=new FactorialNumber();
		ob.inputData();
		ob.calculate();
		
		

	}

}
