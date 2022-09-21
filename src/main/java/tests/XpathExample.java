package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample extends BaseTest{

	@Test
	public void xpathExample() throws InterruptedException {
		
		//  //li[@class='menu_user_login']    sau    li[class='menu_user_login']
		//  xpath                             vs     cssselector
		
		WebElement loginPopup = driver.findElement(By.xpath("//li[@class='menu_user_login']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid blue;')",loginPopup);
		
		loginPopup.click();
		
		//OR
		//   //input[@id='log' or @name='log']              sau       input[id='log'],[name='log']
		WebElement userField = driver.findElement(By.xpath("//input[@id='log' or @name='log']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid blue;')",userField);
		userField.sendKeys("TestUser");
		
		
		//AND
		//   //input[@id='password' and @name='pwd']
		WebElement passField = driver.findElement(By.xpath("//input[@id='password' and @name='pwd']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:green; border:4px solid blue;')",passField);
		passField.sendKeys("12345@67890");
		
		
		//     //input[@class='submit_button']
		//sau daca vrem sa urcam mai sus
		//     //div[contains(@class,'submit_field')]/input[@class='submit_button']
		WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit_button']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid blue;')",loginButton);
		
		Thread.sleep(4000);
		loginButton.click();
		
		
		
	}
	
}
