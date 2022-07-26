package com.koche.practice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice {
	@Test
	public static void add() {
		System.out.println("@test");
	}
	@BeforeMethod
	public static void beforeMethod() {
		System.out.println("@BeforeMethod");
	}
	@BeforeSuite
	public static void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	public static void BeforeTest() {
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}
}
