package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.AccountPage;
import pages.LoginPage;
import pages.NavMenuPage;
import pages.ShippingAddressPage;
import pages.ShopPage;
import utils.BaseTest;

public class EditShippingAddressTest extends BaseTest{

	
	@Parameters({"user", "pass"})
	@Test (priority=0)
	public void loginTest(String username, String parola) {
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.loginLink);
		
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp(username, parola);
		
		assertTrue(loginPage.loginSuccessMessageIsDisplayed());
	}
	
	@Test (priority=1)
	public void selectCountryByIndexTest() {
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.userName);
		navMenu.navigateTo(navMenu.settingsLink);
		
		AccountPage account = new AccountPage(driver);
		navMenu.navigateTo(account.address);
		navMenu.navigateTo(account.editShippingAddress);
		
		ShippingAddressPage shippPage = new ShippingAddressPage(driver);
		shippPage.selectByIndexCountry(41);
		assertEquals(shippPage.getSelectedOptionForCountry(), "Canada");
	}
	
	@Test (priority=2)
	public void selectProvinceByValueTest() {
		
		//NavMenuPage navMenu = new NavMenuPage(driver);
		//navMenu.navigateTo(navMenu.settingsLink);
		
		//AccountPage account = new AccountPage(driver);
		//navMenu.navigateTo(account.address);
		//navMenu.navigateTo(account.editShippingAddress);
		
		ShippingAddressPage shippPage = new ShippingAddressPage(driver);
		shippPage.selectByValueProvince("NL");;
		assertEquals(shippPage.getSelectedOptionForProvince(), "Newfoundland and Labrador");
	}
}
