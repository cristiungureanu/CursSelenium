package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

	public WebDriver driver;
	
	public ProductPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public By productTitle = By.xpath("//h1[@class='product_title entry-title']");
	public By productStars = By.xpath("//div[@class='star-rating']/parent::div[@class='woocommerce-product-rating']");
	public By productPrice = By.xpath("//span[@class='woocommerce-Price-amount amount']");
	public By productPhoto = By.xpath("//img[contains(@src,'book4')]/ancestor::figure[@class='woocommerce-product-gallery__wrapper']");
	public By productQuantity = By.xpath("//div[@class='quantity']");
	public By productAddToCartButton = By.xpath("//button[@class='single_add_to_cart_button button alt']");
	public By productDescription = By.xpath("//div[@class='product_meta']");
	
	public boolean elementIsDisplayed(By locator) {
		
		return driver.findElement(locator).isDisplayed();
	}
}
