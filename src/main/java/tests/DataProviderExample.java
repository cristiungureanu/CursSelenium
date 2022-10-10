package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.NavMenuPage;
import utils.BaseTest;

public class DataProviderExample extends BaseTest{

	
	@DataProvider
	public Object[][] loginTestData(){
		
		Object[][] data = new Object[4][3];
		
		data[0][0] = "TestUser";
		data[0][1] = "12345@67890";
		data[0][2] = true;
		
		data[1][0] = "UserGresit";
		data[1][1] = "ParolaGresita";
		data[1][2] = false;
		
		data[2][0] = "test.test";
		data[2][1] = "test.test@123";
		data[2][2] = true;
		
		data[3][0] = "AltUserGresit";
		data[3][1] = "AltaParolaGresita";
		data[3][2] = false;
		
		return data;
	}
	
	@Test(dataProvider = "loginTestData")
	public void loginTest(String username, String password, boolean success) {
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.loginLink);
		
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp(username, password);
		
		if(success) {
			assertTrue(loginPage.loginSuccessMessageIsDisplayed());
			loginPage.logoutFromApp();
		} else if(!success) {
			assertTrue(loginPage.loginErrorMessageIsDisplayed());	
			loginPage.closeLoginPopUp();
		}
		
	}
}
