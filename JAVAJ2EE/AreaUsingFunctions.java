package com.branch;

import java.util.Scanner;


		class Area{
		int choice;
		float length,breadth,radius,base,area,height,pi=3.14159f;
		Scanner sc=new Scanner(System.in);
		
		
		public void areaSquare() {
		 System.out.println("Enter length of the square");
		length=sc.nextFloat();
		area = length*length;
		System.out.println("Area of square="+area);
		}
		
		public void areaRectangle() {
			System.out.println("Enter Length and Breadth of the rectangle");
		length=sc.nextFloat();
		breadth=sc.nextFloat();
		area = length*breadth;
		System.out.println("Area of rectangle="+area);
		}
		
		public void areaTriangle() {
		
		System.out.println("Enter base of height of triangle");
		base=sc.nextFloat();
		height=sc.nextFloat();
		area = (base*height)/2;
		System.out.println("Area of triangle="+area);
		
		}
		
		public void areaCircle() {
		
		System.out.println("Enter radius of circle");
		radius=sc.nextFloat();
		area= pi*radius*radius;
		System.out.println("Area of circle="+area);

		}
		
		public class AreaUsingFunctions{
			
			public static void main(String[] args) {
				int choice;
				
				Area aob=new Area();
				Scanner sc=new Scanner(System.in);
				System.out.println("***********MENU**********");
				System.out.println("1.Area of square");
				System.out.println("2.Area of Rectangle");
				System.out.println( "3.Area of triangle");
				System.out.println("4.Area of circle");
				System.out.println("Enter Your Choice");
				choice=sc.nextInt();
				
				switch(choice) {
				case 1:aob.areaSquare();
				break;
				case 2:aob.areaRectangle();
				break;
				case 3:aob.areaTriangle();
				break;
				case 4:aob.areaCircle();
				break;
				default : System.out.println("invalid");
				}
		
		
		
		}

	}

}

