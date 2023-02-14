package com.edu.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyFirstTestCase {

	@Test
	public void test() {
	//	fail("Not yet implemented");
	}
@Test // positive
	public void add() {
		int a,b,s;
		a=10;
		b=5;
		s=a+b;
		
		assertEquals(15,s);
		
		
	}
@Test // subraction
public void sub() {
	int a,b,v;
	a=20;
	b=10;
	v=a-b;
	
	assertEquals(10,v);
}
@Test // multiplication
public void multi() {
	int a,b,m;
	a=15;
	b=2;
	m=a*b;
	
	assertEquals(30,m);
}
@Test // division
public void div() {
	int a,b,d;
	a=9;
	b=3;
	d=a/b;
	
	assertEquals(3,d);
}
}
