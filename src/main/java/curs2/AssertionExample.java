package curs2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AssertionExample {

	String actualTitle = "test";
	String ExpectedTitle = "masina";
	
	@Test
	public void checkTitle() {
		if(actualTitle.equals(ExpectedTitle)) {
			System.out.println("Test passed");
		}else {
			System.out.println("The strings do not match! Expected: " + ExpectedTitle + " but found: " + actualTitle);
		}
	}
	
	@Test
	public void checkTitle2() {
		assertEquals(actualTitle, ExpectedTitle);
	}
}
