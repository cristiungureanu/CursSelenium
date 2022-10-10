package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumWrappers {

	public WebDriver driver;
	
	public SeleniumWrappers(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public void sendKeys(By locator, String value) {
			
		WebElement element = driver.findElement(locator);
		
		try {
			element.clear();
			element.sendKeys(value);
			
		}catch(Exception e) {
			System.out.println("Something went wrong");
		}
		}
}
