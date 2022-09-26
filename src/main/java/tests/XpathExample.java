package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample extends BaseTest{

	@Test (priority=1)
	public void xpathExample() throws InterruptedException {
		
		//  //li[@class='menu_user_login']    sau    li[class='menu_user_login']
		//  xpath                             vs     cssselector
		
		WebElement loginPopup = driver.findElement(By.xpath("//li[@class='menu_user_login']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid blue;')",loginPopup);
		
		loginPopup.click();
		
		//OR
		//   //input[@id='log' or @name='log']              sau       input[id='log'],[name='log']
		WebElement userField = driver.findElement(By.xpath("//input[@id='log' or @name='log']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid blue;')",userField);
		userField.sendKeys("TestUser");
		
		
		//AND
		//   //input[@id='password' and @name='pwd']
		WebElement passField = driver.findElement(By.xpath("//input[@id='password' and @name='pwd']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:green; border:4px solid blue;')",passField);
		passField.sendKeys("12345@67890");
		
		
		//     //input[@class='submit_button']
		//sau daca vrem sa urcam mai sus
		//     //div[contains(@class,'submit_field')]/input[@class='submit_button']
		WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit_button']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid blue;')",loginButton);
		
		Thread.sleep(4000);
		loginButton.click();
	}
		
		@Test (priority=2)
		public void xpathExample2() {
			
			driver.findElement(By.xpath("//span[@class='user_name']")).click();
			
			// xpath
			//  //a[contains(@href, 'profile.php')]
			// css
			//  a[href*='profile.php']
			//xpath 2
			//   //a[contains(text(), 'Settings')]
			
			driver.findElement(By.xpath("//a[contains(text(), 'Settings')]")).click();

			driver.findElement(By.xpath("//a[contains(text(),'recent')]")).click();
			
			//(//th[contains(@class, 'woocommerce-orders-table__header')]/span)[2]   --> index based
			// //th[contains(@class, 'woocommerce-orders-table__header')]/span[contains(text(), 'Order')] --> contains()
			
			WebElement orderTableHeader = driver.findElement(By.xpath("//th[contains(@class, 'woocommerce-orders-table__header')]/span[contains(text(), 'Order')]"));
			jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", orderTableHeader);
			
			WebElement statusTableHeader =  driver.findElement(By.xpath("(//th[contains(@class, 'woocommerce-orders-table__header')]/span)[3]"));
			jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", statusTableHeader);
			
			// //td[contains(@class, 'woocommerce-orders-table__cell')][@data-title='Order']/a[contains(text(),'#1697')]
			
			WebElement order_16 = driver.findElement(By.xpath("//td[contains(@class, 'woocommerce-orders-table__cell')][@data-title='Order']/a[contains(text(),'1697')]"));
			jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", order_16);
			
			//NOT
			
			WebElement orders = driver.findElement(By.xpath("//td[contains(@class, 'woocommerce-orders-table__cell')][@data-title='Order']/a[not(contains(text(),'#1697'))]"));
			jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", orders);
			
			order_16.click();
			assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/account/view-order/1697/");
		}
		
	
}
