package com.thurs;

import static org.junit.Assert.*;

import org.junit.*;

public class JunitOp {
	@Test
	public void test1() {
		System.out.println("test case1");
	}
	@Test
	public void test2() {
		System.out.println("test case1");
	}
	@Before
	public void before() {
		System.out.println("before each test case");
	}
	@After
	public void after() {
		System.out.println("after each test case");
	}
	@BeforeClass
	public static void beforeClassMethod() {
		System.out.println( "before class method");
	}
	
	
	
	
	
}