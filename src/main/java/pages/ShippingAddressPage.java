package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.SeleniumWrappers;

public class ShippingAddressPage extends SeleniumWrappers{

	public WebElement dropdown;
	public Select select;
	
	public ShippingAddressPage (WebDriver driver) {
		super(driver);
	}
	
	//public By countryDropdown = By.xpath("//span[@id='select2-shipping_country-container']");
	public By countryDropdown = By.name("shipping_country");
	//public By provinceDropdown = By.xpath("//select[@name='shipping_state']/parent::span[@class='woocommerce-input-wrapper']");
	public By provinceDropdown = By.name("shipping_state");
	
	public void selectByIndexCountry(int index) {
		
		dropdown = driver.findElement(countryDropdown);
		select = new Select(dropdown);
		select.selectByIndex(index);
	}
	
	public String getSelectedOptionForCountry() { 
		
		dropdown = driver.findElement(countryDropdown);
		select = new Select(dropdown);
		return select.getFirstSelectedOption().getText();
	}
	
	public void selectByValueProvince(String value) {
		
		dropdown = driver.findElement(provinceDropdown);
		select = new Select(dropdown);
		select.selectByValue(value);
	}
	
	public String getSelectedOptionForProvince() { 
		
		dropdown = driver.findElement(provinceDropdown);
		select = new Select(dropdown);
		return select.getFirstSelectedOption().getText();
	}
}
