package curs2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utils.BaseTest;

public class WebElementExample  extends BaseTest{

	
	@Test
	public void login() throws InterruptedException {
		
		driver.findElement(By.className("menu_user_login")).click();
		System.out.println(driver.findElement(By.id("log")).isDisplayed()); //isDiplayed() --> verifica daca elementul este vizibil sau nu
		Thread.sleep(3000);//bad practice

		
	}
	
	
}
