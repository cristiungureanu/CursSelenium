package curs1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAfterExample {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	
}
