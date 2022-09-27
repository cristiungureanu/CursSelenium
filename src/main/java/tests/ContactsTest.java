package tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.ContactsPage;
import pages.NavMenuPage;
import utils.BaseTest;

public class ContactsTest extends BaseTest{
	
	//scenariu negativ (name lasat liber)
	@Test (priority=0)
	public void ContactTest() {
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.contactLink);
		
		ContactsPage contactsPage = new ContactsPage(driver);
		
		contactsPage.sendMessage("", "cristi@yahoo.com", "test subject", "some random message");
		assertTrue(contactsPage.checkMessages(contactsPage.fieldMissing));
		assertTrue(contactsPage.checkMessages(contactsPage.name_error));
	}
	
	
	//scenariu negativ (email lasat liber)
	@Test (priority=1)
	public void InvalidTestEmptyEmail() {
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.contactLink);
		
		ContactsPage contactsPage = new ContactsPage(driver);
		
		contactsPage.sendMessage("Cristi", "", "test subject", "some random message");
		assertTrue(contactsPage.checkMessages(contactsPage.fieldMissing));
		assertTrue(contactsPage.checkMessages(contactsPage.email_error));
	}
	
	//scenariu negativ (Message lasat liber)
	@Test (priority=2)
	public void InvalidTestEmptyMessage() {
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.contactLink);
		
		ContactsPage contactsPage = new ContactsPage(driver);
		
		contactsPage.sendMessage("Cristi", "cristi@yahoo.com", "test subject", "");
		assertTrue(contactsPage.checkMessages(contactsPage.fieldMissing));
		assertTrue(contactsPage.checkMessages(contactsPage.message_error));
	}
	
	//scenariu pozitiv
	@Test (priority=3)
	public void validTestMessageSent() {
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.contactLink);
		
		ContactsPage contactsPage = new ContactsPage(driver);
		
		contactsPage.sendMessage("Cristi", "cristi@yahoo.com", "test subject", "some random message");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(contactsPage.messageSent));
			wait.until(ExpectedConditions.textToBePresentInElementLocated(contactsPage.messageSent, "Thank you for your message. It has been sent."));
		
		assertTrue(contactsPage.checkMessages(contactsPage.messageSent));
	}
	
}
