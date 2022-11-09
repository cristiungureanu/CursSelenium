package tests;

import org.testng.annotations.Test;

import pages.AudioPostPage;
import pages.NavMenuPage;
import pages.PostFormatsPage;
import utils.BaseTest;

public class MoveSildersInAudioPost extends BaseTest{

	
	@Test
	public void moveSlidersInAudioPostTest() throws InterruptedException {
		
		NavMenuPage menu =  new NavMenuPage(driver);
		menu.navigateTo(menu.blog);
		menu.navigateTo(menu.postFormatsBlogLink);
		
		PostFormatsPage nav = new PostFormatsPage(driver);
		menu.navigateTo(nav.audioPost);
		
		AudioPostPage audioPost = new AudioPostPage(driver);
		audioPost.click(audioPost.playButton);
		Thread.sleep(1000);
		audioPost.dragAndDrop(audioPost.sliderAudio, 200, 0);   // nu mi muta sliderul indiferent cum l as identifica
		audioPost.dragAndDrop(audioPost.sliderVolume, -50, 0);
		
		Thread.sleep(5000);
	}
}
