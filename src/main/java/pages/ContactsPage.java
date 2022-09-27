package pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import utils.BaseTest;

public class ContactsPage {

	public WebDriver driver;
	
	public ContactsPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public By name = By.cssSelector("input[name='your-name']");
	public By name_error = By.cssSelector("span[class='wpcf7-form-control-wrap your-name']>span[class='wpcf7-not-valid-tip']");
	public By email = By.cssSelector("input[name='your-email']");
	public By email_error = By.cssSelector("span[class='wpcf7-form-control-wrap your-email']>span[class='wpcf7-not-valid-tip']");
	public By subject = By.cssSelector("input[name='your-s']");
	public By message = By.cssSelector("textarea[name='your-message']");
	public By message_error = By.cssSelector("span[class='wpcf7-form-control-wrap your-message']>span[class='wpcf7-not-valid-tip']");
	public By sendButton = By.cssSelector("input[value='Send Message']");
	
	public By fieldMissing = By.xpath("//div[text()='One or more fields have an error. Please check and try again.']");
	public By messageSent = By.xpath("//div[text()='Thank you for your message. It has been sent.']");
	
	
	public void sendMessage(String nume, String mail, String subiect, String mess) {
		
		driver.findElement(name).sendKeys(nume);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(subject).sendKeys(subiect);
		driver.findElement(message).sendKeys(mess);
		driver.findElement(sendButton).click();
	}
	
	public boolean checkMessages(By locator) {
		
		return driver.findElement(locator).isDisplayed();
	}
		//div[class='wpcf7-response-output']       -> 'One or more fields have an error. Please check and try again.'
		 	
/*
		if(driver.findElement(By.cssSelector("span[class='wpcf7-not-valid-tip']")).isDisplayed()) {
			assertEquals(driver.findElement(By.cssSelector("span[class='wpcf7-not-valid-tip']")).getText(), "The field is required.");
		}else {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='wpcf7-response-output']")));
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div[class='wpcf7-response-output']"), "Thank you for your message. It has been sent."));
			
			assertEquals(driver.findElement(By.cssSelector("div[class='wpcf7-response-output']")).getText(), "Thank you for your message. It has been sent.");
		}
	}*/
}
