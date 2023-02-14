package com.lab;

public class LocalVariable {
	public void studentAge(){
		int age=0;
		age=age+30;
		System.out.println("student's age is "+age);
	}

	public static void main(String[] args) {
		LocalVariable temp=new LocalVariable();
		temp.studentAge();
		

	}

}
