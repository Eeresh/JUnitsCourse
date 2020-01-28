package com.in28minutes.helper;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	// @Before
	@BeforeClass
	public static void setUp() {
		System.out.println("Inside before method");
	}
	@Test
	public void test1() {
		System.out.println("inside test1");
	}

	@Test
	public void test2() {
		System.out.println("inside test2");
	}

	// @After
	@AfterClass
	public static void tearDown() {
		System.out.println("Inside tear down method");
	}

}
