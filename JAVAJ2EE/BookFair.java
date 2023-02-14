package com.lab;

import java.util.Scanner;

public class BookFair {
	String Bname;
	double price,d;
	
	BookFair(){
		Bname="";
		price=0;
	}
	
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book name");
		Bname=sc.nextLine();
		System.out.println("Enter price");
		price=sc.nextDouble();
	}
	
	void calculate() {
		if(price<=1000) {
			d=2/100*price;
			}else if(price<=3000) {
				d=10/100*price;
			}else {
				d=15/100*price;
				}
		}
	void display() {
		System.out.println("Book name"+Bname);
		System.out.println("price "+price);
	}

	public static void main(String[] args) {
		BookFair book = new BookFair();
		book.input();
		book.calculate();
		book.display();
		

	}

}
