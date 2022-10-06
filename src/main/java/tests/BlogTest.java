package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.ClassicPage;
import pages.ContactsPage;
import pages.NavBlogPage;
import pages.NavMenuPage;
import utils.BaseTest;

public class BlogTest extends BaseTest{

	@Test
	public void blogTest() {
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.blog);
		
		NavBlogPage navBlog = new NavBlogPage(driver);
		navBlog.navigateTo(navBlog.classicLink);
		
		ClassicPage classicPage = new ClassicPage(driver);
		classicPage.clickOnBlogPost();
		
		classicPage.sendCommentInBlogPost("some comment3", "cristi", "cristi@yahoo.com");
		
		assertTrue(classicPage.AwaitingModerationMessageIsDisplayed());
	
		System.out.println(classicPage.takeAwaitingModerationText());
		assertEquals(classicPage.takeAwaitingModerationText(), "Your comment is awaiting moderation.");
		
	}
	
}
