package curs1;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestDependency {

	
	@Test (priority = 0)
	public void method1() {
		assertTrue(false);
		System.out.println("method 1");
	}
	
	@Test (priority = 1)
	public void method2() {
		System.out.println("method 2");
	}
	
	@Test(priority = 2, dependsOnMethods = "method1", alwaysRun = true)
	public void method3() {
		
		System.out.println("method 3");
	}
}
