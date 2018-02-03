package com.java.practice.series;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExecutionTest {
	
	@BeforeClass
	public static void sample0(){
		System.out.println("BeforeClass0");
	}
	
	@BeforeClass
	public static void sample3(){
		System.out.println("BeforeClass3");
	}
	
	@Before
	public void sample4(){
		System.out.println("Before4");
	}
	
	@Before
	public void sample1(){
		System.out.println("Before1");
	}
	
	@After
	public void sample2(){
		System.out.println("After2");
	}
	
	@After
	public void sample5(){
		System.out.println("After5");
	}
	
	
	@AfterClass
	public static void sample6(){
		System.out.println("AfterClass6");
	}
	
	@AfterClass
	public static void sample7(){
		System.out.println("AfterClass7");
	}
	
	@Test
	public void factTest(){
		Execution execution = new Execution();
		int actual = execution.factorial(5);
		assertEquals(120, actual);
		assertTrue(true);
		assertFalse(false);
		assertNotNull(1);
		assertNull(null);
		assertSame(120, actual);
		System.out.println("Pass5");
		
	}
	
	@Test
	public void factTest1(){
		Execution execution = new Execution();
		int actual = execution.factorial(4);
		assertNotSame(120, actual);
		
		assertEquals(24, actual);
		System.out.println("Pass4");
		
	}
}
