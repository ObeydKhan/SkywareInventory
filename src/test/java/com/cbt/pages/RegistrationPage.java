package com.cbt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class RegistrationPage {
	
	public RegistrationPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//div[@class='basic-info']/h3")
	public WebElement basicInfo;
	
	@FindBy(xpath = "//label[@for='userProfile.email']")
	public WebElement email;
	
	@FindBy(xpath = "//label[@for='userProfile.password']")
	public WebElement password;
	
	@FindBy(xpath = "//label[@for='userProfile.password2']")
	public WebElement passwordConfirm;
	
	@FindBy(xpath = "//div[@class='profile-info']/h3")
	public WebElement profileInfo;
	
	@FindBy(xpath = "//label[@for='account.accountName']")
	public WebElement companyName;
	
	@FindBy(xpath = "//label[@for='userProfile.firstName']")
	public WebElement firstName;
	
	@FindBy(xpath = "//label[@for='userProfile.lastName']")
	public WebElement lastName;
	
	@FindBy(xpath = "//label[@for='userProfile.country']")
	public WebElement country;
	
	@FindBy(xpath = "//label[@for='userProfile.address1']")
	public WebElement address;
	
	@FindBy(xpath = "//label[@for='userProfile.city']")
	public WebElement city;
	
	@FindBy(xpath = "//label[@for='userProfile.state']")
	public WebElement stateAndProvince;
	
	@FindBy(xpath = "//label[@for='profile_zip']")
	public WebElement zipCode;
	
	@FindBy(xpath = "//div[@class='profile-info']/label[10]")
	public WebElement phoneNumber;
	
	@FindBy(xpath = "(//span[@class='required'])[1]")
	public WebElement emailRequired;
	
	@FindBy(xpath = "(//span[@class='required'])[2]")
	public WebElement passwordRequired;
	
	@FindBy(xpath = "(//span[@class='required'])[3]")
	public WebElement passwordConfirmRequired;
	
	@FindBy(xpath = "(//span[@class='required'])[4]")
	public WebElement companyNameRequired;
	
	@FindBy(xpath = "(//span[@class='required'])[5]")
	public WebElement firstNameRequired;
	
	@FindBy(xpath = "(//span[@class='required'])[6]")
	public WebElement lastNameRequired;
	
	@FindBy(xpath = "(//span[@class='required'])[7]")
	public WebElement countryRequired;
	
	@FindBy(xpath = "(//span[@class='required'])[8]")
	public WebElement cityRequired;
	
	@FindBy(xpath = "(//span[@class='required'])[9]")
	public WebElement stateAndProvinceRequired;
	
	@FindBy(id = "licenseAccepted")
	public WebElement licenseAgreement;
	
}
