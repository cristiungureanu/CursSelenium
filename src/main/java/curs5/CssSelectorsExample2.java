package curs5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class CssSelectorsExample2 extends BaseTest{

	
	//@Test
	public void cssSelectorTest() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// * --> contains
		WebElement bookTitle = driver.findElement(By.cssSelector("h3[class*='sc_title_regular']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid black;')",bookTitle);
		Thread.sleep(3000);
		
		// ~ --> contains word
		WebElement bookTitle2 = driver.findElement(By.cssSelector("h3[class~='sc_title_regular']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:red; border:4px solid black;')",bookTitle2);
		
		//^ --> starts with
		WebElement bookTitle3 = driver.findElement(By.cssSelector("a[href^='its']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:green; border:4px solid black;')",bookTitle3);
		
		//$ --> ends with
		WebElement bookTitle4 = driver.findElement(By.cssSelector("a[href$='garden']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:blue; border:4px solid black;')",bookTitle4);
				
	}
	
	@Test
	public void cssSelectorTest2() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement menuEntry = driver.findElement(By.cssSelector("nav[class='menu_main_nav_area']>nav[class='menu_main_nav_area']ul>li:first-of-type"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid black;')",menuEntry);
	}
	
	
}
