package com.lab;

interface A{
	public void print_A();
}
interface B{
	public void print_B();
}
interface C extends A,B{
	public void print_C();
}

class Children implements C{

	@Override
	public void print_A() {
		System.out.println("run");
		
	}

	@Override
	public void print_B() {
	System.out.println("roars");
		
	}

	@Override
	public void print_C() {
		System.out.println("ROARS");
		
	}
	
}
public class ExerciseTwentyEight {

	public static void main(String[] args) {
		Children x = new Children();
		x.print_A();
		x.print_B();
		x.print_C();
		

	}

}

