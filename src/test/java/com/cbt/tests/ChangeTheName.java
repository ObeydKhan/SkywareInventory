package com.cbt.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.cbt.pages.AccountPage;
import com.cbt.pages.HomePage;
import com.cbt.pages.LoginPage;
import com.cbt.utilities.ConfigurationReader;

public class ChangeTheName extends TestBase {
	
	String username = ConfigurationReader.getProperty("username");
	String password = ConfigurationReader.getProperty("password");
	
	@Test(enabled=false, description = "Visibility of Account Tab Test - TC003")
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
	
	@Test(enabled=false, description = "Accessing to HomePage - TC004")
	public void homePageTab() {
		
		HomePage homePage = new HomePage();
		homePage.loginButtonOnHomePage.click();
		
		LoginPage loginPage = new LoginPage();
		loginPage.login(username, password);
		
		String actual = driver.getTitle();
		String expected = "Skyware Inventory | Dashboard";
		assertEquals(actual, expected);
	}
	
	@Test(enabled=true, description = "New Ticket Button - TC005")
	public void ticketTab() {
		
		HomePage homePage = new HomePage();
		homePage.loginButtonOnHomePage.click();
		
		LoginPage loginPage = new LoginPage();
		loginPage.login(username, password);
		
		AccountPage accountPage = new AccountPage();
		assertTrue(accountPage.dashboardTab.isDisplayed());
		
		accountPage.newTicketWindow.click();
		assertTrue(accountPage.newTicketTab.isDisplayed());
		
	}

}