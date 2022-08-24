package curs3;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class SeleniumLocators extends BaseTest{

	
	@Test(priority=0)
	public void tagNameLocator() {
		
		WebElement discoverText = driver.findElement(By.tagName("em"));
		System.out.println(discoverText.getText());
		assertEquals(discoverText.getText(), "Discover");
		
		//sau asa
		// assertEquals(driver.findElement(By.tagName("em")).getText(), "Discover");
		
		
		//    (//a[contains(text(), "DISCOVER MORE BOOKS")])[2]
	}
	
	@Test(priority=1)
	public void linkTextLocator() {
		driver.findElement(By.linkText("BOOKS")).click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/");
	}
	
	@Test(priority=2)
	public void partialLinkTextLocator() {
		driver.findElement(By.partialLinkText("Cooking")).click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/cooking-with-love/");
	}
	
	@Test(priority=3)
	public void classNameLocator() {
		WebElement price = driver.findElement(By.className("price"));
		assertTrue(price.isDisplayed());
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", price);
		assertTrue(price.getText().contains("20.55"));
	}
	
	@Test(priority=4)
	public void idLocator() {
		driver.findElement(By.id("tab-title-reviews")).click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/cooking-with-love/");
	}
	
	@Test(priority=5)
	public void nameLocator() throws InterruptedException {
		driver.findElement(By.name("comment")).sendKeys("comentul meu la aceasta carte");
		Thread.sleep(4000);
	}
}
