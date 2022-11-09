package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class AudioPostPage extends SeleniumWrappers{

	public AudioPostPage(WebDriver driver) {
		super(driver);
	}
	
	public By playButton = By.cssSelector("div[class='mejs-button mejs-playpause-button mejs-play']");
	public By sliderAudio = By.cssSelector("span[class*='mejs-time-hovered']");
	public By sliderVolume = By.cssSelector("div[style='left: 100%;']");

}
