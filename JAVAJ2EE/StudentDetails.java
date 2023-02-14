package com.edu;

import java.util.Scanner;

class Student{
	String studentname;
	int studentage;
	float studentfees;
	String studentemail;
	float total,average;
	int eng,math,sci,soci;


void studentInput() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name");
	studentname=sc.nextLine();
	System.out.println("Enter age");
	studentage=sc.nextInt();
	System.out.println("Enter fees");
	studentfees=sc.nextFloat();
	System.out.println("Enter email");
	studentemail=sc.next();
	}
void inputMarks() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Student Marks: English,maths,science,social");
	eng=sc.nextInt();
	math=sc.nextInt();
	sci=sc.nextInt();
	soci=sc.nextInt();
}
void calculateTotalAverage() {
	total=eng+math+sci+soci;
	average=total/4;
	System.out.println("total="+total);
	System.out.println("average="+average);
}



void StudentDisplay() {
	System.out.println("Name="+studentname);
	System.out.println("Age="+studentage);
	System.out.println("Fees="+studentfees);
	System.out.println("Email="+studentemail);
	
}
}
	


public class StudentDetails {
	public static void main(String[] args) {
	System.out.println("main method");
	Student studentobject=new Student();
	studentobject.studentInput();
	studentobject.StudentDisplay();
	studentobject.inputMarks();
	studentobject.calculateTotalAverage();
}
}
