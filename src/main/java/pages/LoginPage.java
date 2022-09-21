package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	
	
	//public By usernameField = By.id("log");
	public By usernameField = By.cssSelector("ul input[id='log']");  // punerea intr o variabila
	
	//public By passwordField = By.id("password");
	public By passwordField = By.cssSelector("ul input[id='password']");
	public By submitButton = By.cssSelector("ul input[class='submit_button']");
	
	public By loginErrorMessage = By.cssSelector("div[class*='sc_infobox_style_error']");
	public By loginSuccessMessage = By.cssSelector("div[class*='sc_infobox_style_success']");
	
	public By logoutButton = By.cssSelector("li[class='menu_user_logout']");
	
	public void loginInApp(String username, String password) {
		
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(submitButton).click();
	}
	
	public void logoutFromApp() {
		
		driver.findElement(logoutButton).click();
	}
	
	
	public boolean loginSuccessMessageIsDisplayed() {
		
		return driver.findElement(loginSuccessMessage).isDisplayed(); // isDisplayed intoarce valoarea booleana - true sau false
	}
	
	public boolean loginErrorMessageIsDisplayed() {
		
		return driver.findElement(loginErrorMessage).isDisplayed(); 
	}
	
	public boolean loginMessageIsDisplayed(By locator) {
		
		return driver.findElement(locator).isDisplayed();
	}
}
