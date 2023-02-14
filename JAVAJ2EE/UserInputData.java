package com.edu;

import java.util.Scanner;

public class UserInputData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		float f;
		double d;
		byte b;
		short s;
		char ch;
		String fname;
		
		System.out.println("Enter name");
		fname=sc.next();
		System.out.println("Enter integer value");
		i=sc.nextInt();
		System.out.println("Enter short int");
		s=sc.nextShort();
		System.out.println("Enter byte");
		b=sc.nextByte();
		System.out.println("Enter float value");
		f=sc.nextFloat();
		System.out.println("Enter double value");
		d=sc.nextDouble();
		System.out.println("Enter char value");
		ch=sc.next().charAt(0);
		
		System.out.println("name="+fname);
		System.out.println("Integer value="+i);
		System.out.println("short value="+s);
		System.out.println("byte value="+b);
		System.out.println("float value="+f);
		System.out.println("double value="+d);
		System.out.println("char value="+ch);
				

	}

}
