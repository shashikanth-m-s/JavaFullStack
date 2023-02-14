package com.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElectricityBill {
	String name;
	int units;
	double bill;
	
	void accept() throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("name of the customer ");
		name=reader.readLine();
		System.out.println("number of units");
		units=reader.read();
	}
	void calculate() {
		if(units <=100) {
			bill = 2*units;
			
		}else if(units<=300){
			bill = 3*units;
			
		}else if(units>300){
			bill = 5*units;
		}
	}
	void display() {
		System.out.println("name of the customer is"+name);
		System.out.println("number of units is"+units);
		System.out.println("bill is"+bill);
	}
	

	public static void main(String[] args) throws IOException {
		ElectricityBill ec=new ElectricityBill();
		ec.accept();
		ec.calculate();
		ec.display();

	}

}
