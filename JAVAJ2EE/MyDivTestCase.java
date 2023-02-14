package com.division;

import static org.junit.Assert.*;

import org.junit.Test;

import com.div.DivisionClass;

public class MyDivTestCase {
	DivisionClass ob1=new DivisionClass(10,2);
	DivisionClass ob2=new DivisionClass(10,0);
	

	@Test
	public void test() {
		assertEquals(5,ob1.divisionNum());
		
	
	}
	@Test(expected = ArithmeticException.class)
	public void test1() {
		assertEquals(5,ob2.divisionNum());
	}
	

}
