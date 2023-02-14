package com.lab;

abstract class Bird{
	abstract void makesound();
}

class Duck extends Bird{

	@Override
	void makesound() {
		System.out.println("quack quack");
		
	}
	
}
class Owl extends Bird{

	@Override
	void makesound() {
		System.out.println("hoot hoot");
		
	}
	
}
public class ExerciseTwentyThree {

	public static void main(String[] args) {
		
		Duck d = new Duck();
		d.makesound();
		
		Owl c = new Owl();
		c.makesound();
	

	}

}
