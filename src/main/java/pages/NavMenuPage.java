package pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SeleniumWrappers;

public class NavMenuPage extends SeleniumWrappers{

	//public WebDriver driver;
	
	public NavMenuPage(WebDriver driver) {
		//this.driver = driver;
		super(driver);
	}
	
	//locatori
	//driver.findElement(By.linkText("BOOKS"));
	public By shopLink = By.linkText("BOOKS");
	public By loginLink = By.linkText("Login");
	public By contactLink = By.linkText("CONTACTS");
	public By singleAuthor = By.linkText("SINGLE AUTHOR");
	public By blog = By.linkText("BLOG");
	public By aboutLink = By.linkText("ABOUT");
	public By postFormatsBlogLink = By.linkText("Post Formats");
	public By portfolioLink = By.xpath("//a[@class='sf-with-ul'][contains(text(), 'Portfolio')]");
	public By portfolio2ColumnsLink = By.linkText("Portfolio 2 columns");
	
	public By searchIcon = By.cssSelector("button[class*='search_submit']");
	public By searchField =By.cssSelector("input[class*='search_field']");
	
	public By product = By.xpath("//div[@id='sc_tab_1456822345_1_17']/descendant::a[contains(@href,'garden')]");
	
	public By userName = By.xpath("//span[@class='user_name']");
	public By settingsLink = By.xpath("//a[@href='https://keybooks.ro/wp-admin/profile.php']");
	
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
	
	public void searchBook(String value) {
		click(searchIcon);
		sendKeys(searchField, value);
		click(searchIcon);
	}
	
	public boolean isBookPictureDisplayed(String picture) {
		WebElement element =  driver.findElement(By.cssSelector("div[data-image*='"+picture+"']"));
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.isDisplayed();
	}
	
	public void clickABook(String value) {
		WebElement element =  driver.findElement(By.linkText(value));
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		element.click();
	}
	
}
