package curs2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.BaseTest;

public class VerifyElementsVisibility extends BaseTest{

	@Test
	public void VerifyElements() {
		/*
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
		*/
		
		WebElement loginMenu = driver.findElement(By.className("menu_user_login"));
		WebElement usernameField = driver.findElement(By.id("log"));
		WebElement passwordField = driver.findElement(By.id("password"));
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertFalse(usernameField.isDisplayed());
		   softAssert.assertFalse(passwordField.isDisplayed());
		   loginMenu.click();
		   softAssert.assertTrue(usernameField.isDisplayed());
		   softAssert.assertTrue(passwordField.isDisplayed());
		   softAssert.assertAll();

		
	}
	
}
