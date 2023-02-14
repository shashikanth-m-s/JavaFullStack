package com.series;
@FunctionalInterface

interface DefaultInterface{
	void add(int a, int b);
	
	default void mult(int a, int b) {
		System.out.println("Product="+(a*b));
	}
	static void display() {
		System.out.println("static method in interface");
	}
	
}
public class DefaultInterfaceOp implements DefaultInterface{
	@Override
	public void add(int a, int b) {
		System.out.println("sum="+(a+b));
		
	}

	public static void main(String[] args) {
		DefaultInterface dob=new DefaultInterfaceOp();
		dob.add(4, 2);
		dob.mult(9, 2);
		DefaultInterface.display();
		
		DefaultInterface lob=(a,b)->{
			System.out.println("sum="+(a+b));
		};
		lob.add(2, 6);
		lob.mult(2, 9);
		
	}
}

	



