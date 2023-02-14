package com.lab;

class ABC {
	public void print_ABC (){
		System.out.println("cooking");
		
	}
}
class XYZ extends ABC{
	public void print_XYZ() {
		System.out.println("emerging technology");
	}
}

public class ExerciseTwentyFour {

	public static void main(String[] args) {
		XYZ d = new XYZ();
		d.print_ABC();
		d.print_XYZ();
		

	}

}
