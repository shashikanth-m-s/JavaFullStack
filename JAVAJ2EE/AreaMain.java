package com.branch;

import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) {
		int choice;
		float length,breadth,radius,base,area,height,pi=3.14159f;
		Scanner sc=new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("1.AREA OF SQUARE");
		System.out.println("2. AREA OF RECTANGLE");
		System.out.println("3.AREA OF TRIANGLE");
		System.out.println( "4.AREA OF CIRCLE");
		System.out.println("ENTER YOUR CHOICE");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1: System.out.println("Enter length of the square");
		length=sc.nextFloat();
		area = length*length;
		System.out.println("Area of square="+area);
		break;
		
		case 2:System.out.println("Enter Length and Breadth of the rectangle");
		length=sc.nextFloat();
		breadth=sc.nextFloat();
		area = length*breadth;
		System.out.println("Area of rectangle="+area);
		
		break;
		
		case 3:System.out.println("Enter base of height of triangle");
		base=sc.nextFloat();
		height=sc.nextFloat();
		area = (base*height)/2;
		System.out.println("Area of triangle="+area);
		
		break;
		
		case 4:System.out.println("Enter radius of circle");
		radius=sc.nextFloat();
		area= pi*radius*radius;
		System.out.println("Area of circle="+area);

		break;
		default:System.out.println("invalid");
		
		
		
		}

	}

}
