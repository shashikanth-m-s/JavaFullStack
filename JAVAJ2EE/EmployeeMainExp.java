package com.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Employee{
	int eid;
	String ename;
	int eage;
	float esalary;
	
	public Employee() {
		super();
	}
	void inputEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee details");
		System.out.println("Enter name");
		ename=sc.next();
		System.out.println("enter employeeid");
		eid=sc.nextInt();
		System.out.println("enter age");
		eage=sc.nextInt();
		System.out.println("enter salary");
		esalary=sc.nextFloat();
	}
}

public class EmployeeMainExp {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4  = new Employee();
		e1.inputEmployee();
		e2.inputEmployee();
		e3.inputEmployee();
		e4.inputEmployee();
		
		
		ArrayList<Employee>eop=new ArrayList<Employee>();
		eop.add(e1);
		eop.add(e2);
		eop.add(e3);
		eop.add(e4);
		
		Iterator<Employee> eit = eop.iterator();
		System.out.println("employee details");
		System.out.println("ID\tname\tage\tsalary");
		while(eit.hasNext()) {
			Employee empobj =eit.next();
			System.out.println(empobj.eid+"\t"+empobj.ename+"\t"+empobj.eage+"\t"+empobj.esalary);
		}
		
		
		

	}

}
