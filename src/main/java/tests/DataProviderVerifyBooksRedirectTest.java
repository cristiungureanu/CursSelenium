package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.NavMenuPage;
import utils.BaseTest;
import utils.DataProviderClass;
import utils.DataProviderURLs;

public class DataProviderVerifyBooksRedirectTest extends BaseTest{

	@Test(dataProviderClass = DataProviderURLs.class, dataProvider = "urlsDataProvider")
	public void verifyURLsTest(String name, String url) throws InterruptedException {
		
		NavMenuPage menu = new NavMenuPage(driver);
		
		menu.clickABook(name);
		assertEquals(driver.getCurrentUrl(), url);	
		driver.navigate().back();
		Thread.sleep(2000);		
	}
}
