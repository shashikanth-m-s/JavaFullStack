package com.edu;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		String sname;
		int sage;
		float ssalary;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		sname=sc.nextLine();
		System.out.println("Enter age");
		sage=sc.nextInt();
		System.out.println("Enter salary");
		ssalary=sc.nextFloat();
		
		System.out.println("Employee Details");
		System.out.println( "name="+sname);
		System.out.println("age="+sage);
		System.out.println("salary="+ssalary);
		
		
		

	}

}
