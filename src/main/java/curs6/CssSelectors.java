package curs6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class CssSelectors extends BaseTest{
	

	//@Test
	public void cssSelectorTest2() {
		//first-of-type
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement menuEntry = driver.findElement(By.cssSelector("div[class='menu_main_wrap']>nav[class='menu_main_nav_area']>ul>li:first-of-type"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid black;')",menuEntry);

		//nth-of-type
		WebElement menuAbout = driver.findElement(By.cssSelector("div[class='menu_main_wrap']>nav[class='menu_main_nav_area']>ul>li[class*='menu']:nth-of-type(5)"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid black;')",menuAbout);

		//li[class*='sc_tabs_title']:last-of-type

		// Home page book categories menu entries
		
		//first-of-type ---> New releases
		WebElement menuNewReleases =  driver.findElement(By.cssSelector("li[class*='sc_tabs_title']:first-of-type"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid black;')",menuNewReleases);
		//nth-of-type(2) ---> Coming soon
		WebElement menuComingSoon =  driver.findElement(By.cssSelector("li[class*='sc_tabs_title']:nth-of-type(2)"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid black;')",menuComingSoon);
		//nth-of-type(3) ---> Best sellers
		WebElement menuBestSellers =  driver.findElement(By.cssSelector("li[class*='sc_tabs_title']:nth-of-type(3)"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid black;')",menuBestSellers);
		//last-of-type ---> Award winners
		WebElement menuAwardWinners =  driver.findElement(By.cssSelector("li[class*='sc_tabs_title']:last-of-type"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid black;')",menuAwardWinners);
	
	
	}
	
	@Test
	public void cssSelectorsTest3() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		//selectez doar elementul care are attributul (aria-selected=true)
		WebElement menuEntry =  driver.findElement(By.cssSelector("li[class*='sc_tabs_title'][aria-selected=true]"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:green; border:4px solid red;')",menuEntry);

		//selected tot in afara de elementul care are (aria-selected=true)
		// NOT
		List<WebElement> menuEntries =  driver.findElements(By.cssSelector("li[class*='sc_tabs_title']:not([aria-selected=true])"));
		
		for(WebElement elem : menuEntries) {
			Thread.sleep(3000);
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid blue;')",elem);

		//CSS 
		//  li[class*=sc_tabs_title]:nth-of-type(2)  
		//XPATH
		//  (//li[contains(@class, 'sc_tabs_title')])[2]
		}
			
	}
	
}