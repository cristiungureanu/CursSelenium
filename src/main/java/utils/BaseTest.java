package utils;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.NavMenuPage;

public class BaseTest {

	public static WebDriver driver;
	public JavascriptExecutor jse;
	public NavMenuPage navMenu;
	public BasePage app;
	
	//@Parameters({"url"})
	@BeforeClass (alwaysRun=true)
	//@BeforeTest (alwaysRun=true)   -->daca vrem sa rulam 2 clase in xml fara sa inchida browserul
	public void setup() {
		driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		//driver.get(url);
		driver.get("http://keybooks.ro");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		jse = (JavascriptExecutor) driver;
		navMenu = new NavMenuPage(driver);
		app = new BasePage();
		
		
	}
	
	@AfterClass
	//@AfterTest
	public void teardown() throws InterruptedException{
		Thread.sleep(3000);
		driver.quit();
	}
	
	
}
