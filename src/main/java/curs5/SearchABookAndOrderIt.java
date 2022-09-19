package curs5;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.BaseTest;

public class SearchABookAndOrderIt extends BaseTest{
	
	WebElement result;
	
	@Test (priority = 0)
		public void searchBook() throws InterruptedException {
		
		WebElement search = driver.findElement(By.cssSelector("button[class *= 'search_submit']"));
		
		search.sendKeys("The story about me");
		search.sendKeys(Keys.ENTER);
		
		WebElement searchResult = driver.findElement(By.cssSelector("h1[class='page_title']"));
		
		System.out.println(searchResult.getText());
		assertEquals(searchResult.getText(), "SEARCH: STORY ABOUT ME");
		//--------------
		
		//scroll down
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,2000)", "");
		
		WebElement loadMore = driver.findElement(By.cssSelector("a[href='#'][id='viewmore_link']"));
		
		loadMore.click();
		Thread.sleep(3000);
		
		result = driver.findElement(By.cssSelector("a[href *='the-story-about-me']"));
		
		SoftAssert softAssert = new SoftAssert();
		Thread.sleep(3000);	
		
		softAssert.assertTrue(result.isDisplayed());
		
		
		
	}
	
	@Test (priority = 1, dependsOnMethods = "searchBook")
	public void orderBook() throws InterruptedException {
		
		result.click();
		
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-story-about-me/");
		
		WebElement addToCart = driver.findElement(By.cssSelector("button[name='add-to-cart']"));
		addToCart.click();
		Thread.sleep(3000);	
		
		assertTrue(driver.findElement(By.cssSelector("div[class *='woocommerce-message']")).getText().contains("“The story about me” has been added to your cart."));
		
		WebElement viewCart = driver.findElement(By.cssSelector(".woocommerce-message>a[href='https://keybooks.ro/cart/']"));
		viewCart.click();
		
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/cart/");
	}	
	
	
	@Test(priority = 2, dependsOnMethods = "orderBook")
	public void updateQuantity() throws InterruptedException {
			
			WebElement quantity = driver.findElement(By.cssSelector(".q_inc"));
			quantity.click();
			
			WebElement updateCart = driver.findElement(By.cssSelector("button[value='Update cart']"));
			updateCart.click();
			Thread.sleep(3000);	
			
			System.out.println(driver.findElement(By.cssSelector("div[class='woocommerce-message']")).getText());
			
			assertEquals(driver.findElement(By.cssSelector(".woocommerce-message")).getText(), "Cart updated.");
			
			WebElement proceedToCheckout = driver.findElement(By.cssSelector("a[href='https://keybooks.ro/checkout/']"));
			proceedToCheckout.click();
			Thread.sleep(3000);	
			
			assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/checkout/");			
			assertEquals(driver.findElement(By.cssSelector("div[class='col-1']>.woocommerce-billing-fields>h3")).getText(), "Billing details");
			assertEquals(driver.findElement(By.cssSelector("div[class='col-2']>.woocommerce-additional-fields>h3")).getText(), "Additional information");
			
			
		}
		
	
}
