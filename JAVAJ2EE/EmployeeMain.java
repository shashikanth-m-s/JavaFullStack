package com.inter;

class EmployeeException extends Exception{
	public EmployeeException(String s) {
		super(s);
	}
}
class Employee{
	public void checkid(int eid) {
		try {
			if(eid<=0 || eid>=999) {
				throw new EmployeeException("invalid Employee ID");
				
			}else {
				System.out.println("employee id is valid");
			}
		}catch(EmployeeException e) {
			e.printStackTrace();
		}
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		Employee ob = new Employee();
		ob.checkid(1000);

	}

}
