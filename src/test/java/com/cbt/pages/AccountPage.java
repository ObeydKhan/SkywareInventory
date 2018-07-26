package com.cbt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class AccountPage {
	
	public AccountPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "thirdtabLink")
	public WebElement dashboardTab;
	
	@FindBy(xpath = "//a[@alt='Account']")
	public WebElement accountTab;
	
	@FindBy(id = "subtabLink")
	public WebElement logoutLink;
	
	@FindBy(id = "newTicketButton")
	public WebElement newTicketWindow;
	
	@FindBy(id = "fourthtabLink")
	public WebElement newTicketTab;
	
	public void logout() {
		logoutLink.click();
	}

}
