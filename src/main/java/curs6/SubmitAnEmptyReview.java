package curs6;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class SubmitAnEmptyReview extends BaseTest{

	@Test
	public void submitAnEmptyReview() throws InterruptedException {
		
		WebElement book = driver.findElement(By.cssSelector("a[href*='the-forest']"));
		book.click();
		
		WebElement reviews = driver.findElement(By.cssSelector("a[href*='reviews']"));
		reviews.click();
		
		WebElement submitButton = driver.findElement(By.cssSelector("input[id='submit']"));
		submitButton.click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		WebElement stars = driver.findElement(By.cssSelector("p[class='stars']>span>a[class='star-3']"));
		stars.click();
		
		WebElement message = driver.findElement(By.cssSelector("textarea[id='comment']"));
		message.sendKeys("some random review");
		
		WebElement name = driver.findElement(By.cssSelector("input[id='author']"));
		name.sendKeys("cristi");
		
		WebElement email = driver.findElement(By.cssSelector("input[id='email']"));
		email.sendKeys("cristi@yahoo.com");
		submitButton.click();
		
		WebElement approval = driver.findElement(By.cssSelector("em[class*='awaiting-approval']"));
		assertEquals(approval.getText(), "Your review is awaiting approval");
	}
}
