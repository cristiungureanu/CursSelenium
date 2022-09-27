package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassicPage {

	public WebDriver driver;
	
	public ClassicPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public By firstBlogPost = By.xpath("//a[contains(@href, 'amazing-things')]/parent::h4[contains(@class,'post_title')]");
	public By commentBlogPost = By.xpath("//div[@class='comments_field comments_message']/textarea");
	public By nameBlogPost = By.xpath("//div[@class='comments_field comments_author']/input");
	public By emailBlogPost = By.xpath("//div[@class='comments_field comments_email']/input");
	public By websiteBlogPost = By.xpath("//div[@class='comments_field comments_site']/input");
	public By postButtonBlogPost = By.xpath("//p[@class='form-submit']/input[contains(@name,'submit')]");
	public By awaitingModerationMessage = By.xpath("//ul[@class='comments_list']/descendant::div[@class='comment_not_approved']");
	
	//WebElement awaitingModerationText = driver.findElement(By.xpath("//ul[@class='comments_list']/descendant::div[@class='comment_not_approved']"));
	
	public void clickOnBlogPost() {
		
		driver.findElement(firstBlogPost).click();
	}
	
	public void sendCommentInBlogPost(String comment, String name, String email) {
		
		driver.findElement(commentBlogPost).sendKeys(comment);
		driver.findElement(nameBlogPost).sendKeys(name);
		driver.findElement(emailBlogPost).sendKeys(email);
		//driver.findElement(websiteBlogPost).sendKeys(website);
		driver.findElement(postButtonBlogPost).click();
	}
	
	public boolean AwaitingModerationMessageIsDisplayed() {
		
		return driver.findElement(awaitingModerationMessage).isDisplayed();
	}
	
	public String takeAwaitingModerationText() {
		
		return driver.findElement(awaitingModerationMessage).getText();
	}
}
