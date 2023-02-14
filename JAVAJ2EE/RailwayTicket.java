package com.lab;

import java.util.Scanner;

public class RailwayTicket {
	String name,coach;
	long mobilenumber;
	int amount,totalamount;
	
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		name=sc.nextLine();
		System.out.println("enter coach");
		coach=sc.nextLine();
		System.out.println("enter mobilenumber");
		mobilenumber=sc.nextInt();
		System.out.println("enter amount");
		amount=sc.nextInt();
	}
	
	void update() {
		if(coach.equals("first_Ac")) {
			totalamount=amount+700;
		}else if(coach.equals("second_AC")) {
			totalamount=amount+500;
	}else if(coach.equals("third_Ac")) {
		totalamount=amount+250;
	}else if(coach.equals("sleeper")) {
		System.out.println("none");
	}
	}
	void display() {
		System.out.println("name is:"+name);
		System.out.println("coach is:"+coach);
		System.out.println("totalamount is:"+totalamount);
		System.out.println("mobilenumber is:"+mobilenumber);
	}
public  static void main(String[] args) {
	RailwayTicket tic=new RailwayTicket();
	tic.accept();
	tic.update();
	tic.display();
		

	}

}
