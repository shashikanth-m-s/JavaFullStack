package com.function;

public class Constructor {
	int i;
	String s;
	float ino;
	
	Constructor(){
		i=9;
		s="days";
		ino=457.9f;
	}

	public static void main(String[] args) {
	Constructor ob=new Constructor();
	System.out.println("i="+ob.i);
	System.out.println("s="+ob.s);
	System.out.println("ino="+ob.ino);

	}

}
