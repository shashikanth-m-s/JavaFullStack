package com.edubridge;

public class Employee {
	private String name;
	
	
	public Employee() {
		System.out.println("constructor is called");
	}
	
	public Employee(String name) {
		super();
		this.name = name;
		System.out.println("Hello "+name);
		
		
	}

}
