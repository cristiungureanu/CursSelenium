package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavBlogPage {

	public WebDriver driver;
	
	public NavBlogPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locatori
	public By classicLink = By.linkText("Classic");
	
	public void navigateTo(By locator) {
		
		driver.findElement(locator).click();
	}
}
