package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.ContactsPage;
import pages.NavMenuPage;
import pages.PageFormatsPage;
import pages.ShopPage;
import utils.BaseTest;

public class ActionClassExample extends BaseTest{
	
	
	@Test
	public void dragAndDropTest() throws InterruptedException {
		
		NavMenuPage menu =  new NavMenuPage(driver);
		menu.navigateTo(menu.shopLink);
		
		ShopPage  shop = new ShopPage(driver);
		shop.dragAndDrop(shop.sliderInitialPosition, 100, 0);
		shop.dragAndDrop(shop.sliderFinalPosition, -100, 0);
		Thread.sleep(3000);
	}
	
	//@Test (priority = 1)
	public void hoverElement() throws InterruptedException{
		//NavMenuPage menu = new NavMenuPage(driver);
		//menu.hoverElement(menu.blog);
		
		app.menu.hoverElement(app.menu.aboutLink);
		Thread.sleep(3000);
		app.menu.hoverElement(app.menu.aboutLink);
		app.menu.hoverElement(app.menu.postFormatsBlogLink);
		app.menu.navigateTo(app.menu.postFormatsBlogLink);
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/category/post-formats/"); //sau
		assertEquals(app.menu.readUrl(), "https://keybooks.ro/category/post-formats/");
	}
	
	//@Test (priority = 2)
	public void sendkeysExample() throws InterruptedException {
		PageFormatsPage pageFormats = new PageFormatsPage(driver);
		pageFormats.hoverElement(pageFormats.searchField);
		
		WebElement searchElement = driver.findElement(app.pageFormatsPage.searchField);
		Actions action = new Actions(driver);
		action.keyDown(Keys.SHIFT).sendKeys(searchElement, "abracadabra").perform();
		
		Thread.sleep(3000);
	}
	
	//@Test (priority=3)
	public void sendKeysExample2() throws InterruptedException {
		
		
		//NavMenuPage menu = new NavMenuPage(driver);
		//menu.navigateTo(menu.contactLink);
		
		app.menu.navigateTo(app.menu.contactLink);
		ContactsPage contactPage = new ContactsPage(driver);
		
		WebElement nameElement = driver.findElement(app.contactPage.name);
		
		
		Actions action = new Actions(driver);
		action
			.moveToElement(nameElement)
			.sendKeys(nameElement, "Name")
			.sendKeys(Keys.TAB, "email@email.com")
			.sendKeys(Keys.TAB, "My subject")
			.sendKeys(Keys.TAB, "message message")
			.sendKeys(Keys.TAB, Keys.ENTER).perform();
		Thread.sleep(3000);
	}
	
	//@Test(priority=4)
	public void offSetExample() {
		
		WebElement nameElement = driver.findElement(app.contactPage.name);
		int getx = nameElement.getLocation().getX();
		System.out.println(getx);
		int gety = nameElement.getLocation().getY();
		System.out.println(gety);
		
		Actions action = new Actions(driver);
		action
			.moveByOffset(getx, gety)
			.click()
			.sendKeys("Test ceva")
			.sendKeys(Keys.TAB, "email@email.com")
			.sendKeys(Keys.TAB, "My subject")
			.sendKeys(Keys.TAB, "message message")
			.sendKeys(Keys.TAB, Keys.ENTER).perform();
		
	}

}