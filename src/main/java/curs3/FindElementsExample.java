package curs3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class FindElementsExample extends BaseTest {

	
	@Test
	public void findElementsRxample() {
		List<WebElement> bookPictures = driver.findElements(By.className("sc_image"));
		System.out.println(bookPictures.size());
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", bookPictures.get(3));
	}
}
