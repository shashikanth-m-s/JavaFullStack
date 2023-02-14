package com.lab;

interface Deer{
	public void print_Deer();
}
interface Lion{
	public void print_Lion();
}
interface Tiger extends Deer,Lion{
	public void print_Tiger();
}

class Child implements Tiger{

	@Override
	public void print_Deer() {
		System.out.println("run");
		
	}

	@Override
	public void print_Lion() {
	System.out.println("roars");
		
	}

	@Override
	public void print_Tiger() {
		System.out.println("ROARS");
		
	}
	
}
public class ExerciseTwentySeven {

	public static void main(String[] args) {
		Child x = new Child();
		x.print_Deer();
		x.print_Lion();
		x.print_Tiger();
		

	}

}
