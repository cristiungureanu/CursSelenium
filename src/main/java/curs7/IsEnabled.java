package curs7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class IsEnabled extends BaseTest{
	
	@Test
	public void isEnabledExample() throws InterruptedException {
		
		WebElement loginPopUp = driver.findElement(By.cssSelector("li[class='menu_user_login']"));

		System.out.println(loginPopUp.isEnabled());
			
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('disabled','');", loginPopUp);	
		System.out.println(loginPopUp.isEnabled());
		
		loginPopUp.click();
		
		WebElement usernameFiled = driver.findElement(By.id("log"));
		//usernameFiled.click();
		System.out.println("username : " + usernameFiled.isEnabled());
		jse.executeScript("arguments[0].setAttribute('disabled','');", usernameFiled);	
		usernameFiled.sendKeys("TestUser");
		System.out.println("username2 : " + usernameFiled.isEnabled());

		Thread.sleep(3000);
		
		
		
	}
	

}