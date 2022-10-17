package tests;

import org.testng.annotations.Test;

import pages.NavMenuPage;
import pages.ShopPage;
import utils.BaseTest;

public class ActionClassExample extends BaseTest{
	
	
	@Test
	public void dragAndDropTest() {
		
		NavMenuPage menu =  new NavMenuPage(driver);
		menu.navigateTo(menu.shopLink);
		
		ShopPage  shop = new ShopPage(driver);
		shop.dragAndDrop(shop.sliderInitialPosition, 100, 0);
		shop.dragAndDrop(shop.sliderFinalPosition, -100, 0);

	}

}