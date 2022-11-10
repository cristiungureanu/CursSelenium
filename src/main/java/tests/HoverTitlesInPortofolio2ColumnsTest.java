package tests;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.AudioPostPage;
import pages.NavMenuPage;
import pages.PostFormatsPage;
import utils.BaseTest;

public class HoverTitlesInPortofolio2ColumnsTest extends BaseTest{

	@Test
	public void moveSlidersInAudioPostTest() throws InterruptedException {
		
		//NavMenuPage menu =  new NavMenuPage(driver);
		//menu.navigateTo(menu.blog);
		//menu.navigateTo(menu.portfolioLink);
		//menu.navigateTo(menu.portfolio2ColumnsLink);
		
		app.menu.navigateTo(app.menu.blog);
		app.menu.navigateTo(app.menu.portfolioLink);
		app.menu.navigateTo(app.menu.portfolio2ColumnsLink);
		
		//pun toate post blogs intr-o lista
		List<WebElement> blogPosts = driver.findElements(By.xpath("//article[contains(@class,'post_item post_item_portfolio post_item_portfolio_2')]/descendant::img"));
		//System.out.println(blogPosts.size());
	
		// face hover pe fiecare element din lista la rand
		for(int i=0; i<15; i++) {
			app.menu.hoverElementInAList(blogPosts.get(i));
			System.out.println(blogPosts.get(i).getAttribute("alt"));
			//assertEquals(blogPosts.get(i).getAttribute("alt"), "15 Amazing Things About Reading in the Fall");
			Thread.sleep(3000);
		}
		
		assertEquals(blogPosts.get(0).getAttribute("alt"), "15 Amazing Things About Reading in the Fall");
		assertEquals(blogPosts.get(1).getAttribute("alt"), "10 Book Recommendations For Family Members");
		assertEquals(blogPosts.get(2).getAttribute("alt"), "The Best business books – Financial Times");
		assertEquals(blogPosts.get(3).getAttribute("alt"), "The Best Poetry Books of All Time");
		assertEquals(blogPosts.get(4).getAttribute("alt"), "Five the Best Audiobooks");
		assertEquals(blogPosts.get(5).getAttribute("alt"), "Book reviews: Find the best new books");
		assertEquals(blogPosts.get(6).getAttribute("alt"), "How end-of-year book lists prove we lack diversity");
		assertEquals(blogPosts.get(7).getAttribute("alt"), "We need to talk about all women writers");
		assertEquals(blogPosts.get(8).getAttribute("alt"), "The hottest books to warm you up this winter");
		assertEquals(blogPosts.get(9).getAttribute("alt"), "Why I won’t stop buying books");
		assertEquals(blogPosts.get(10).getAttribute("alt"), "Celebrity Picks:Favorite Reads of 2015");
		assertEquals(blogPosts.get(11).getAttribute("alt"), "Weekend Reading");
		assertEquals(blogPosts.get(12).getAttribute("alt"), "Coffee Table Books");
		assertEquals(blogPosts.get(13).getAttribute("alt"), "Turn the Page: Your Next Rock ‘N’ Roll Book Club");
		assertEquals(blogPosts.get(14).getAttribute("alt"), "The Book Report: Episode 3");
		
	}
	
}
