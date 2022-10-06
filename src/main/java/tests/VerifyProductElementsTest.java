package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.NavMenuPage;
import pages.ProductPage;
import utils.BaseTest;

public class VerifyProductElementsTest extends BaseTest{

	@Test
	public void verifyElements() {
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.product);
		
		ProductPage elementShopPage = new ProductPage(driver);
		
		//assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productTitle));
		//assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productStars));
		//assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productPrice));
		//assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productPhoto));
		//assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productQuantity));
		//assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productAddToCartButton));
		//assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productDescription));
		
		//sau
		
		SoftAssert sa =  new SoftAssert();
        sa.assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productTitle));
        sa.assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productStars));
        sa.assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productPrice));
        sa.assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productPhoto));
        sa.assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productQuantity));
        sa.assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productAddToCartButton));
        sa.assertTrue(elementShopPage.elementIsDisplayed(elementShopPage.productDescription));
 
        sa.assertAll();

		
	}
	
}

