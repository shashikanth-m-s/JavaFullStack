package com.herri;
class Base{
	private int i;
	Base(int i){ //i=8
		this.i=i;
		
		System.out.println("The value of i="+i);
	}
}
class SubClass extends Base{
	SubClass(int j){ //j=8
		super(j);//super is used to call parent class constructor from child class
		             //when you are calling super should be the first line
		  }
}

public class Constructorcalling {

	public static void main(String[] args) {
		SubClass sob=new SubClass(8);

	}


}
