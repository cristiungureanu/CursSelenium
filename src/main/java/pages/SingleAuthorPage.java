package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BaseTest;

public class SingleAuthorPage {

	public WebDriver driver;
	
	public SingleAuthorPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// //div[contains(@class, 'sc_skills_label')][contains(text(), 'Drama')]           ---> drama text locator
	public By dramaValue = By.xpath("//div[@class='sc_skills_item sc_skills_style_1 odd first inited']/div/div[contains(text(),'95%')]");
	
	//   //div[contains(@class, 'sc_skills_label')][contains(text(), 'Biogra')]
	public By biographyValue = By.xpath("//div[@class='sc_skills_item sc_skills_style_1 even inited']/div/div[contains(text(),'75%')]");
	
	//  //div[contains(@class, 'sc_skills_label')][contains(text(), 'Cookbooks')]
	public By cookBooksValue = By.xpath("//div[@class='sc_skills_item sc_skills_style_1 odd inited']/child::div[contains(@style, 'width: 82%')]");
	
	public void dramaIsDisplayed() {
		
		driver.findElement(dramaValue).isDisplayed();
		driver.findElement(biographyValue).isDisplayed();
		driver.findElement(cookBooksValue).isDisplayed();
	}
	
}
