package curs2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class VerifyElementsVisibility extends BaseTest{

	@Test
	public void VerifyElements() {
		
		System.out.print("Login button visibility is: ");
		System.out.println(driver.findElement(By.className("menu_user_login")).isDisplayed());
		
		System.out.print("Login input field visibility is: ");
		System.out.println(driver.findElement(By.id("log")).isDisplayed());
		
		System.out.print("Password input field visibility is: ");
		System.out.println(driver.findElement(By.id("password")).isDisplayed());
		
		driver.findElement(By.className("menu_user_login")).click();
		System.out.print("After clicking Login button, Login input field visibility is: ");
		System.out.println(driver.findElement(By.id("log")).isDisplayed());
		
		System.out.print("After clicking Login button, Password input field visibility is: ");
		System.out.println(driver.findElement(By.id("password")).isDisplayed());
	}
	
}
