package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {

	public WebDriver driver;
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By address = By.xpath("//a[@href='https://keybooks.ro/account/edit-address/'][contains(text(), 'Address')]");
	public By editShippingAddress = By.xpath("//a[@href='https://keybooks.ro/account/edit-address/shipping/']");
	
	
}
