package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.SeleniumWrappers;

public class ShopPage extends SeleniumWrappers{

	//public WebDriver driver;
	public WebElement dropdown;
	public Select select;
	
	public ShopPage (WebDriver driver) {
		//this.driver = driver;
		super(driver);
	}
	
	public By orderDropdown = By.name("orderby");
	public By sliderInitialPosition = By.cssSelector("span[style='left: 0%;']");
	public By sliderFinalPosition = By.cssSelector("span[style='left: 100%;']");
	
	
	public void selectByValue(String value) {
		
		dropdown = driver.findElement(orderDropdown);
		select = new Select(dropdown);
		select.selectByValue(value);
	}
	
	public void selectByIndex(int index) {
		
		dropdown = driver.findElement(orderDropdown);
		select = new Select(dropdown);
		select.selectByIndex(index);
	}
	
	public void selectByVisibleText(String text) {
		
		dropdown = driver.findElement(orderDropdown);
		select = new Select(dropdown);
		select.selectByVisibleText(text);
	}
	
	public String getSelectedOption() { 
		
		dropdown = driver.findElement(orderDropdown);
		select = new Select(dropdown);
		return select.getFirstSelectedOption().getText();
	}
	
	
}
