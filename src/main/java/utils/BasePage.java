package utils;

import pages.ContactsPage;
import pages.NavMenuPage;
import pages.PageFormatsPage;

public class BasePage extends BaseTest{

	public NavMenuPage menu = new NavMenuPage(driver);
	public ContactsPage contactPage = new ContactsPage(driver);
	public PageFormatsPage pageFormatsPage = new PageFormatsPage(driver);
	
}
