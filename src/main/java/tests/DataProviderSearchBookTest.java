package tests;

import utils.BaseTest;
import utils.DataProviderClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.NavMenuPage;

public class DataProviderSearchBookTest extends BaseTest {

	@Test(dataProviderClass = DataProviderClass.class, dataProvider = "bookNamesDataProvider")
	public void searchBookTest(String book, String picture) throws InterruptedException {
		
		NavMenuPage menu = new NavMenuPage(driver);

		menu.searchBook(book);
				
		assertTrue(menu.isBookPictureDisplayed(picture));
		

		
	}
	
}