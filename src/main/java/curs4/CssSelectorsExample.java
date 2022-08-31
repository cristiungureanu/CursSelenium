package curs4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class CssSelectorsExample extends BaseTest{
	
	//<ul id="menu_user" qa_auto='' class="menu_user_nav" name="menu_list" type="list"></ul>
	
	
	// selenium : id, className, linkText, partialLinkText, name, tagName
	//driver.findElement(By.id('menu_user'))
	//driver.findElement(By.className('menu_user_nav'))
	
	//selenium : xpath , cssSelector
	// --> xpath //ul[@id='menu_user']
	// --> xpath //ul[@type='list']
	// --> xpath //ul[@class='menu_user_nav']
	// --> xpath //ul[contains(@class,'menu_user_nav' )]
	//---------------------------------------
	// --> cssSelector  ul[id=menu_user]
	// --> cssSelector ul[type=list]
	// --> ul[qa_auto='dada']
	
	
	
//	@Test
	public void testCssSelectors() {
		
		//#menu_user --> gaseste orice element care are id (#) egal cu 'menu user'
		//ul#menu_user --> gaseste orice element de tip UL care are id (#) egal cu 'menu user'
		//ul->tagul html
		//# --> id=
		// menu_user -> valoarea atributului id
		//  ul[id="menu_user]  == ul#menu_user
		
		//css selector 
		// ul[id=menu_user]
		//xpath
		// //ul[@id=menu_user]
		
		
		//#-->id
		WebElement loginMenu = driver.findElement(By.cssSelector("#menu_user"));
		System.out.println(loginMenu.getText());
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')",loginMenu);
		
		// .--> class
		WebElement logoSlogan = driver.findElement(By.cssSelector(".logo_slogan"));
		System.out.println(logoSlogan.getText());
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')",logoSlogan);

		WebElement updatesTitle = driver.findElement(By.cssSelector("h3[style='text-align:center;color:#ffffff;']"));
		System.out.println(updatesTitle.getText());
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid black;')",updatesTitle);

		
		//<h3 class="sc_title sc_title_underline sc_align_center inverse " style="text-align:center;color:#ffffff;"></h3>
		
		//div.column-1_2 h3.sc_title_underline
		//div[class*='column-1_2'] h3.sc_title_underline
		//div[class*='column-1_2'] h3[class*='sc_title_underline']
		
		WebElement inspireText = driver.findElement(By.cssSelector("div[class='column-1_2'] h3.sc_title_underline"));
		System.out.println(inspireText.getText());
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid black;')",inspireText);

		
		// <div class="column-1_2 sc_column_item sc_column_item_2 even">
		// div[class="column-1_2 sc_column_item sc_column_item_2 even"]
		/*
		 * 
		 * CONTAINS:
		 * CSS :   div[class*='column-1_2']   
		 * XPATH:  //div[contains(@class, 'column-1_2')]
		 * 
		 */
				
	}
	
	@Test
	public void testCssSelector2() {
		
		WebElement loginPopUp =  driver.findElement(By.cssSelector("a[class*='popup_link']"));
		loginPopUp.click();
		
		// Logical AND
		WebElement usernameField = driver.findElement(By.cssSelector("input[id='log'][name='log']"));
		usernameField.sendKeys("TestUser");
		// OR
		WebElement passwordField = driver.findElement(By.cssSelector("input[id='password'],[name='pwd2']"));
		passwordField.sendKeys("TestUser");
		
		
	}
	

}