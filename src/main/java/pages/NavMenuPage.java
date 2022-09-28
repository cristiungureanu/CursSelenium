package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavMenuPage {

	public WebDriver driver;
	
	public NavMenuPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locatori
	//driver.findElement(By.linkText("BOOKS"));
	public By shopLink = By.linkText("BOOKS");
	public By loginLink = By.linkText("Login");
	public By contactLink = By.linkText("CONTACTS");
	public By singleAuthor = By.linkText("SINGLE AUTHOR");
	public By blog = By.linkText("BLOG");
	
	public By product = By.xpath("//div[@id='sc_tab_1456822345_1_17']/descendant::a[contains(@href,'garden')]");
	
	public void navigateTo(By locator) {
		
		driver.findElement(locator).click();
	}
	
	//ShopePage shp = new ShopPage(driver)
	//ori metoda de mai sus ori metoda de mai jos
	// pbiect care intoarce instanta paginii
	public ShopPage navigateToShop() {
		
		driver.findElement(shopLink).click();	
		return new ShopPage(driver);
	}
	
}
