package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.NavMenuPage;
import pages.ShopPage;
import utils.BaseTest;

public class DropdownTest extends BaseTest{

	
	@Test (priority=1)
	public void selectByValueTest() {
		
		//NavMenuPage navMenu = new NavMenuPage(driver);
		//navMenu.navigateTo(navMenu.shopLink);
		//ShopPage shopPage = new ShopPage(driver);
		ShopPage shopPage = navMenu.navigateToShop(); // metoda simplificata a celor 2 linii de mai sus
		
		shopPage.selectByValue("price");
		//assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/?orderby=price");
		
		//sau
		assertEquals(shopPage.getSelectedOption(), "Sort by price: low to high");	
	}
	
	@Test (priority=2, groups = "ProductFunctionality")
	public void selectByVisibleTextTest() {
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.shopLink);
		
		ShopPage shopPage = new ShopPage(driver);
		shopPage.selectByVisibleText("Sort by popularity");
		assertEquals(shopPage.getSelectedOption(), "Sort by popularity");
	}
	
	@Test (priority=3)
	public void selectByIndexTest() {
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.shopLink);
		
		ShopPage shopPage = new ShopPage(driver);
		shopPage.selectByIndex(3);
		assertEquals(shopPage.getSelectedOption(), "Sort by latest");
	}
	
	@Test (priority=4)
	public void exceptionExample() {
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.shopLink);
		
		WebElement dropdown = driver.findElement(By.name("orderby"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Sort by popularity");
	//refresh
		WebElement dropdown2 = driver.findElement(By.name("orderby"));
		Select select2 = new Select(dropdown2);
		select.selectByVisibleText("Sort by latest");
	}
}
