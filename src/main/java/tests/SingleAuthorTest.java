package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.NavMenuPage;
import pages.SingleAuthorPage;
import utils.BaseTest;

public class SingleAuthorTest extends BaseTest{

	
	@Test (priority=1)
	public void verifySkillsInSingleAuthor() {
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.singleAuthor);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='sc_skills_item sc_skills_style_1 even inited']/div/div[contains(text(),'75%')]")));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='sc_skills_item sc_skills_style_1 even inited']/div/div[contains(text(),'75%')]"), "75%"));
		
		
		SingleAuthorPage saPage = new SingleAuthorPage(driver);

		saPage.dramaIsDisplayed();
		
		
	}
	
}
