package curs3;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class VerifyBook extends BaseTest{
	
	@Test
	public void verifyBook() throws InterruptedException {
		
		List<WebElement> menuElements = driver.findElements(By.className("sc_tabs_title"));
		System.out.println(menuElements.size());
		

		for(WebElement nume : menuElements) {
			System.out.println(menuElements.indexOf(nume) + ": " + nume.getText());
			nume.click();
			Thread.sleep(3000);
		
			System.out.print("The mention booked is present in " + nume.getText() + " - ");
			System.out.println(driver.findElement(By.linkText("The forest")).isDisplayed());
			
			if(menuElements.indexOf(nume)==(menuElements.size()-1)) {
				driver.findElement(By.linkText("The forest")).click();
				assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-forest/");
			}
			
		}
	}

}
