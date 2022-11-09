package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class PostFormatsPage extends SeleniumWrappers {

	public PostFormatsPage(WebDriver driver) {
		super(driver);
		
	}
	
	public By audioPost = By.linkText("Audio post");
	
}
