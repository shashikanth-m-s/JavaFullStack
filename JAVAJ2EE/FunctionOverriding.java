package com.herri;

class Parent{
	void show() {
		System.out.println("parent class");
	}
}
class Child extends Parent{
	void show() {
		System.out.println("child class");
		super.show();
	}
}

public class FunctionOverriding {

	public static void main(String[] args) {
		Child cob = new Child();
		cob.show();
		Parent pob = new Child();
		pob.show();// directly call parent class method
		

	}

}
