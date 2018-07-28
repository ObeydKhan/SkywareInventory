package com.cbt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy(linkText = "Home")
	public WebElement homeTab;
	
	@FindBy(linkText = "Features")
	public WebElement featuresTab;
	
	@FindBy(linkText = "About Us")
	public WebElement aboutUsTab;
	
	@FindBy(linkText = "Inventory")
	public WebElement inventoryTab;
	
	@FindBy(xpath = "//span[@class='helpShow']")
	public WebElement helpTab;
	
	@FindBy(xpath="(//div//p)[2]")
	public WebElement popUp1;
	
	@FindBy(xpath="(//div//p)[3]")
	public WebElement popUp2;
	
	@FindBy(xpath="(//div//p)[4]")
	public WebElement popUp3;
	
	@FindBy(linkText = "New Receipt")
	public WebElement newReceiptButton;
	
	@FindBy(xpath="//a[@alt='New Receipt']")
	public WebElement newReceiptTab;

	@FindBy(id = "comment")
	public WebElement commentArea;
	
	@FindBy(id = "transactionDate")
	public WebElement date;
	
	@FindBy(id = "reference")
	public WebElement reference;
	
	@FindBy(id = "vendor")
	public WebElement vendor;
	
	@FindBy(id = "saveButton")
	public WebElement saveButton;
	
	public Select vendorOptions() {
		return new Select(Driver.getDriver().findElement(By.id("vendor")));
	}
	
	public void logout() {
		logoutLink.click();
	}

}
