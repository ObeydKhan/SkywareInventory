package com.cbt.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.cbt.pages.AccountPage;
import com.cbt.pages.HomePage;
import com.cbt.pages.LoginPage;
import com.cbt.utilities.ConfigurationReader;

public class ChangeTheName extends TestBase {
	
	String username = ConfigurationReader.getProperty("username");
	String password = ConfigurationReader.getProperty("password");
	
	@Test(description = "Account Tab Test")
	public void dashBoardTab() {
		
		HomePage homePage = new HomePage();
		homePage.loginButtonOnHomePage.click();
		
		LoginPage loginPage = new LoginPage();
		loginPage.login(username, password);
		
		AccountPage accountPage = new AccountPage();
		assertTrue(accountPage.dashboardTab.isDisplayed());
		
		accountPage.accountTab.click();
		assertTrue(accountPage.accountTab.isDisplayed());
		
	}

}
