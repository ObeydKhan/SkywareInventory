package com.cbt.tests;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.cbt.pages.AccountPage;
import com.cbt.pages.HomePage;
import com.cbt.pages.LoginPage;
import com.cbt.utilities.ConfigurationReader;

public class AccountTests extends TestBase {

	String username = ConfigurationReader.getProperty("username");
	String password = ConfigurationReader.getProperty("password");

	/**
	 * @author Cihan
	 */
	@Test(enabled = true, description = "Visibility of Account Tab Test - TC003")
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

	/**
	 * @author Cihan
	 */
	@Test(enabled = true, description = "Accessing to HomePage - TC004")
	public void homePageTab() {

		HomePage homePage = new HomePage();
		homePage.loginButtonOnHomePage.click();

		LoginPage loginPage = new LoginPage();
		loginPage.login(username, password);

		String actual = driver.getTitle();
		String expected = "Skyware Inventory | Dashboard";
		assertEquals(actual, expected);
	}

	/**
	 * @author Cihan
	 */
	@Test(enabled = true, description = "New Ticket Button - TC005")
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

	/*
	 * @author Vika 
	 */
	@Test(enabled = true, description = "Log Out Button - TC - 018")
	public void verifyLogOutButton() {
		HomePage homePage = new HomePage();
		homePage.loginButtonOnHomePage.click();

		LoginPage loginPage = new LoginPage();
		loginPage.login(username, password);

		AccountPage accountPage = new AccountPage();
		assertTrue(accountPage.homeTab.isDisplayed());
		assertTrue(accountPage.featuresTab.isDisplayed());
		assertTrue(accountPage.aboutUsTab.isDisplayed());
		assertTrue(accountPage.inventoryTab.isDisplayed());
		assertTrue(accountPage.logoutLink.isDisplayed());
		assertTrue(accountPage.logoutLink.isEnabled());
		accountPage.logout();
	}

	/*
	 * @author Vika 
	 */
	@Test(enabled = true, description = "Verify help - TC - 019")
	public void verifyHelp() {
		HomePage homePage = new HomePage();
		homePage.loginButtonOnHomePage.click();

		LoginPage loginPage = new LoginPage();
		loginPage.login(username, password);

		AccountPage accountPage = new AccountPage();
		accountPage.helpTab.click();
		String expected1 = "Charts provides an at a glance view of inventory information.  Select from the Filters options to update the charts.";
		String expected2 = "View a quick summary of transactions info by adjusting the selections provided in the Filters options.";
		String expected3 = "Dashboard Help\n" + 
				"Welcome to the Skyware Dashboard.   Quickly view a summary of transactions as well as charts.";
		assertEquals(expected1, accountPage.popUp1.getText());
		assertEquals(expected2, accountPage.popUp2.getText());
		assertTrue(accountPage.popUp3.getText().contains(expected3));

	}

	/*
	 * @author Vika 
	 */
	@Test(enabled = false, description = "Verify New Receipt Button - TC - 020")
	public void verifyNewReceiptButton() {
		HomePage homePage = new HomePage();
		homePage.loginButtonOnHomePage.click();

		LoginPage loginPage = new LoginPage();
		loginPage.login(username, password);

		AccountPage accountPage = new AccountPage();
		accountPage.newReceiptButton.click();
		assertTrue(accountPage.newReceiptTab.isDisplayed());

		accountPage.commentArea.sendKeys("item name");
		assertEquals("item name", accountPage.commentArea.getText());

		accountPage.date.clear();
		accountPage.date.sendKeys("11/07/2018");
		assertEquals("11/07/2018", accountPage.date.getText());

		accountPage.reference.sendKeys("reference");
		assertEquals("reference", accountPage.reference.getText());

		 //Select vendorSelect = AccountPage.vendorOptions();
		//vendorSelect.selectFirstOption();
		// //will contain the actual sizes
		// List<String> actualList = new ArrayList<>();
		// //get all options from the dropdown and add the text of the option to the
		// actualList
		// for(WebElement optionElement : vendorSelect.getOptions()) {
		// actualList.add(optionElement.getText());
		// }
		// assertTrue(sizes.equals(actualList));

	}

}