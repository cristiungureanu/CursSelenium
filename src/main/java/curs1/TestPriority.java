package curs1;

import org.testng.annotations.Test;

public class TestPriority {

	@Test(priority = 4)
	public void one() {
		System.out.println("First");
	}
	
	@Test (priority = 5)
	public void two() {
		System.out.println("Two");
	}
	@Test
	public void three() {
		System.out.println("Third");
	}
	
	@Test
	public void four() {
		System.out.println("Fourth");
	}
	
	@Test
	public void five() {
		System.out.println("fifth");
	}
}
