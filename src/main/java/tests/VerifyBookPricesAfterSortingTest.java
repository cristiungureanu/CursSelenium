package tests;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.AccountPage;
import pages.NavMenuPage;
import pages.ShippingAddressPage;
import pages.ShopPage;
import utils.BaseTest;

public class VerifyBookPricesAfterSortingTest extends BaseTest{

	/**
	 * 	Folosind modelul POM.
		Facem un test care va rula dintr-un fisier testing.xml
		Navigam catre shop
	  	In shop sortam dupa Price Low to high
		Verificam daca prima carte care ne apare are pretul mai mic decat ultima carte care apare
	 * 
	 */
	
	
	@Test (priority = 1)
	public void selectByVisibleTextTest() {
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.shopLink);
		
		ShopPage shopPage = new ShopPage(driver);
		shopPage.selectByVisibleText("Sort by price: low to high");
		assertEquals(shopPage.getSelectedOption(), "Sort by price: low to high");
	}
	
	@Test (priority = 2)
	public void verifyPrices() throws InterruptedException {
		
		List<WebElement> bookPrices = driver.findElements(By.xpath("//span[@class='price']"));
		System.out.println(bookPrices.size());
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", bookPrices.get(1));
		
		System.out.println(bookPrices.get(0).getText().substring(1));
		System.out.println(bookPrices.get(11).getText().substring(1));
		
		int totalNoOfBooks = bookPrices.size();
		//int priceFirstElement = Integer.parseInt(bookPrices.get(0).getText().substring(1));
		double priceFirstElement = Double.parseDouble(bookPrices.get(0).getText().substring(1));
		double priceLastElement = Double.parseDouble(bookPrices.get(totalNoOfBooks-1).getText().substring(1));
		
		
		
		if (priceFirstElement<priceLastElement) {
			System.out.println("First book is cheaper than the last book");
		} else {
			System.out.println("Last book is cheaper than first book! Test failed");
		}
		Thread.sleep(20);
	}
	
}
