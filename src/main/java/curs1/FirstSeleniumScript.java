package curs1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumScript {

	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		driver = WebDriverManager.chromedriver().create();
		driver.get("http://keybooks.ro");
		
	}
	
	@AfterClass
	public void teardown(){
		
		driver.quit();
	}
	
	@Test
	public void getTitle() {
		
	/*	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //FirefoxDriver()
		driver.get("http://keybooks.ro");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit(); */
		
		//alta metoda
		
		
		System.out.println(driver.getTitle());
			
		
		driver.quit();
	}
	
	@Test
	public void getCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}
}
