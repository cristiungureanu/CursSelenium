package curs4;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.BaseTest;

public class SendMessageFromContactPage extends BaseTest{

	@Test
	public void sendMessage() throws InterruptedException {
		
		WebElement contactUs = driver.findElement(By.cssSelector("a[href*='contacts/']"));
		contactUs.click();
		
		WebElement name = driver.findElement(By.cssSelector("input[type='text'][name='your-name']"));
		WebElement email = driver.findElement(By.cssSelector("input[type='email'][name='your-email']"));
		WebElement subject = driver.findElement(By.cssSelector("input[type='text'][name='your-s']"));
		WebElement message = driver.findElement(By.cssSelector("textarea[name='your-message']"));
		WebElement sendButton = driver.findElement(By.cssSelector("input[type='submit'][value='Send Message']"));
		
		//SoftAssert softAssert = new SoftAssert();
		//softAssert.assertFalse(message.isDisplayed());
		
		name.sendKeys("Cristi");
		email.sendKeys("cristi@yahoo.com");
		subject.sendKeys("mysubject");
		message.sendKeys("some random comment");
		
		sendButton.click();
		Thread.sleep(3000);
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,500)", "");
		
		WebElement output = driver.findElement(By.cssSelector("div[class*='response-output'][aria-hidden='true']"));
		
		System.out.println(output.getText());
		assertEquals(output.getText(), "Thank you for your message. It has been sent.");
		
		
	}
	
}
