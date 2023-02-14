package com.inter;

interface Myinterface {
	int i = 35; //all variables are by default they are public static final 
	void m1(); //methods are public and abstract
}
class MyClass implements Myinterface{
String name;
	@Override
	public void m1() {
		System.out.println("interface method implementation");
		System.out.println("the value of i is="+i);
		
	}
	void m2() {
		name="Kiran";
		System.out.println("Name="+name);
	}
}

public class InterfaceMainApp {

	public static void main(String[] args) {
		//object creation is not possible for interface
		//Myinterface ob1=new Myinterface();//error
		MyClass ob=new MyClass();
		ob.m1();
		ob.m2();
		Myinterface ob1 =new MyClass();//allocate memory only for interface
		ob1.m1();

	}
}

