package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ApplicationPages.Homepage;
import Factory.BrowserFactory;
import Factory.DataProviderFactory;

public class VerifyHomePage {

	WebDriver driver;

	@BeforeMethod //// This will launch browser and specific url
	public void setUp() {

		driver = BrowserFactory.getBrowser("firefox");
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	}

	@Test //// Created Page Object using Page Factory
	public void testHomePage() {

		Homepage home = PageFactory.initElements(driver, Homepage.class);
		String title = home.getApplicationTitle(); //// Call the method from
													//// homepage
		Assert.assertTrue(title.contains("Avactis Demo Store"));

	}

	@AfterMethod
	public void tearDown() {

		BrowserFactory.closeBrowser(driver);
	}

}
