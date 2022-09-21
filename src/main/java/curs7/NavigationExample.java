package curs7;

import org.testng.annotations.Test;

import utils.BaseTest;

public class NavigationExample extends BaseTest{
	
	@Test
	public void navigateExamples() throws InterruptedException {
		Thread.sleep(2000);	
		driver.get("https://emag.ro");
		Thread.sleep(2000);	
		driver.navigate().back();
		Thread.sleep(2000);	
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().to("https://altex.ro");
		driver.navigate().refresh();

		
		
	}
	

} 