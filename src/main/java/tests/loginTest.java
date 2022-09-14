package tests;

import org.testng.annotations.Test;

import pages.NavMenuPage;
import utils.BaseTest;

public class loginTest extends BaseTest{

	@Test
	public void loginTest() {
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.loginLink);
	}
	
}
