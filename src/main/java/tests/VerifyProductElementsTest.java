package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.NavMenuPage;
import pages.ProductPage;
import utils.BaseTest;

public class VerifyProductElementsTest extends BaseTest{

	@Test
	public void verifyElements() {
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.product);
		
		ProductPage elementShopPage = new ProductPage(driver);
		
		assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productTitle));
		assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productStars));
		assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productPrice));
		assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productPhoto));
		assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productQuantity));
		assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productAddToCartButton));
		assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productDescription));
		
	}
	
}

