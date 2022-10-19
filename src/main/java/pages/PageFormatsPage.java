package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class PageFormatsPage extends SeleniumWrappers{

	public PageFormatsPage(WebDriver driver) {
		super(driver);
	}

	public By searchField = By.cssSelector("input[title='Search for:']");
		
}
