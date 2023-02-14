package com.cycle;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Cycle1 {

	@BeforeClass
	public static void beforeAll() {
		System.out.println("connect to the database");
	}
	@Before
	public void beforeEach() {
		System.out.println("load the schema");
	}
	@After
	public void afterEach() {
		System.out.println("drop the schema");
	}
	@AfterClass
	public static void afterAll() {
		System.out.println( "disconnect from the database");
	}
	@Test
	public void testOne() {
		System.out.println("test one");
		}
	@Test
	public void testTwo() {
		System.out.println("test two");
	}

}
