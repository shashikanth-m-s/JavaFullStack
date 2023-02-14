package com.lab;

class Books{
	
	void run() {
		System.out.println("books not in stock");
	}
}


public class ExerciseTwentyTwo extends Books{
	
	void run() {
		System.out.println("books are available");
	}

	public static void main (String[] args){
		
		 ExerciseTwentyTwo ob = new  ExerciseTwentyTwo ();
		 ob.run();
		
		
		

	}

}
