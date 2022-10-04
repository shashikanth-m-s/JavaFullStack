package programs;

import java.util.Scanner;

public class AreaMain {
	static Scanner sc=new Scanner(System.in);
	public static  void square() {
		System.out.println("enter lenth ");
		int l=sc.nextInt();
		l=l*l;
		System.out.println("area is "+l);
	}
	public static void triangle() {
		System.out.println("enter the base and height");
		float base=sc.nextFloat();
		float height = sc.nextFloat();
		float area =(base*height)/2;
		System.out.println("area of traiangle= "+area);
	}
	public static void circle() {
		float pie=3.141f;
		System.out.println("enter radius");
		float radiuas=sc.nextFloat();
		float area= pie*radiuas*radiuas;
		System.out.println("area of circle= "+area);
	}
	public static void reactangle() {
		System.out.println("enter length and breadth");
		float length=sc.nextFloat();
		float breadth=sc.nextFloat();
		float area= length*breadth;
		System.out.println("area= "+area);
	}

	public static void main(String[] args) {
		
		System.out.println("Main Function App");
		System.out.println("1.Area of Triangle");
		System.out.println("2.Area of Square");
		System.out.println("3.Area of Rectangle");
		System.out.println("4.Area of Cirle");
		System.out.println("Enter Your choice b/n 1-4");
		int choice=sc.nextInt();
		switch(choice) {
		case 1: triangle();
		break;
		case 2: square();
		break;
		case 3: reactangle();
		break;
		case 4: circle();
		break;
		default:System.out.println("enter correct case");
		}

	}

}
