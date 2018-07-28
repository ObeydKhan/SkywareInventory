package com.cbt.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cbt.utilities.ConfigurationReader;
import com.cbt.utilities.Driver;

public abstract class TestBase {

	protected WebDriver driver;
	
	@Parameters("browser") //name of the parameter from xml
	@BeforeMethod (groups= {"smoke"})
	public void setUp(@Optional String browser) {//name of the parameter from xml
		driver=Driver.getDriver(browser);
		driver.get(ConfigurationReader.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterMethod (groups= {"smoke"})
	public void tearDown() {
		//Driver.closeDriver();
	}
}
