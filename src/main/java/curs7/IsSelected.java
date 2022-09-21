package curs7;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class IsSelected extends BaseTest{
	
	/***
	 * element is an input element with a type attribute in the Checkbox- or Radio Button state
		The result of element’s checkedness.
		element is an option element
		The result of element’s selectedness.
		
		Otherwise
		False.
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void isSelectedExample() throws InterruptedException {
		
		driver.findElement(By.cssSelector("li>a[href='#popup_login']")).click();
		WebElement rememberMe = driver.findElement(By.cssSelector("ul input[id='rememberme']"));
		
		System.out.println(rememberMe.isSelected());
		
		Thread.sleep(3000);
		
		rememberMe.click();
		System.out.println(rememberMe.isSelected());
		assertTrue(rememberMe.isSelected());
		
		
		WebElement usernameFiled = driver.findElement(By.id("log"));
		usernameFiled.click();
		System.out.println("username : " + usernameFiled.isSelected());
		

		
		
	}

}