package com.cons;

public class ConstructorOverloading {
	int i,j,k;
	
	ConstructorOverloading(){
		System.out.println("constructor with no argument");
	}
	ConstructorOverloading(int i){
		System.out.println("constructor with one argument"+i);
	}
	ConstructorOverloading(int i,int j){
		System.out.println("constructor with two argument"+i+" and "+j);
	}

	public static void main(String[] args) {
		ConstructorOverloading ob = new ConstructorOverloading();

		ConstructorOverloading ob1 = new ConstructorOverloading(2);
		

		ConstructorOverloading ob2 = new ConstructorOverloading(2,3);

	}

}
