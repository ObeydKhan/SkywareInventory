package com.cbt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class HomePage {
	
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//a[@class='button login']")
	public WebElement loginButtonOnHomePage;
	
	@FindBy(xpath = "//div[@class='title']")
	public WebElement getStarted;
	
	@FindBy(linkText = "Register")
	public WebElement registerButton;
	
	

}