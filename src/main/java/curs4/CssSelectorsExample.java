package curs4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class CssSelectorsExample extends BaseTest{

	
	@Test
	public void testCssSelectors() {
		
		//#menu_user --> gaseste orice element care are id(#) egal cu 'menu_user'
		//ul#menu_user --> gaseste orice element de tip ul care are id(#) egal cu 'menu_user'
		// ul --> tagul html
		// # --> id=
		// menu_user --> valoarea atributului id
		// ul[id='menu_user'] == ul#menu_user
		
		//css selector
		//ul[id=menu_user]
		// xpath
		// //ul[@id=menu_user]
		
		//#-->id
		WebElement loginMenu = driver.findElement(By.cssSelector("#menu_user"));
		System.out.println(loginMenu.getText());
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange; border:4px solid red')", loginMenu);
		
		//.-->class
		WebElement logoSlogan = driver.findElement(By.cssSelector(".logo_slogan"));
		System.out.println(logoSlogan.getText());
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange; border:4px solid red')", logoSlogan);
		
		WebElement updatesTitle = driver.findElement(By.cssSelector("h3[style='text-align:center;color:#ffffff;']"));
		System.out.println(updatesTitle.getText());
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange; border:4px solid red')", updatesTitle);
		
		
		WebElement inspireText = driver.findElement(By.cssSelector("div.column-1_2 h3.sc_title_underline"));
		System.out.println(inspireText.getText());
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange; border:4px solid red')", inspireText);
		
		
	}
	
	@Test
	public void testCssSelector2() {
		
		WebElement loginPopup = driver.findElement(By.cssSelector("a[class*='popup_link'"));
		loginPopup.click();
		
		//Logical AND
		WebElement usernameField = driver.findElement(By.cssSelector("input[id='log'][name='log']"));
		usernameField.sendKeys("TestUser");
		
		//OR
		
		WebElement passwordField = driver.findElement(By.cssSelector("input[id='password'],[name='pwd2']"));
		passwordField.sendKeys("TestUser");
		
	}
}
