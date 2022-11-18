package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Methods.ForgotPasswordPageMethods;
import Pages.LoginPage;
import TestNg.DriverExtensions;

public class ForgotPassword extends DriverExtensions{
	
	LoginPage lp;
	
	ForgotPasswordPageMethods fpm;

	@BeforeSuite
	public void launchBrowser() {

		System.out.println("I am in @BeforeSuite method ");

		launchBrowser("chrome");
		
		lp=new LoginPage(driver);

		fpm=new ForgotPasswordPageMethods(driver);
	}

	@BeforeTest
	public void launchURL() {

		System.out.println("I am in @BeforeTest method ");

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@BeforeClass
	public void maximizeBrowser() {
		System.out.println("I am in @BeforeClass method ");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

	}
	
	@Test(priority = 0)
	public void clickForgotPassword() {
		
		lp.forgotYourPassword();
	}
	
	@Test(priority = 1)
	public void enterCredentialsonForgotPasswordPage() {
		
		fpm.enterUsername();
		fpm.clickCancel();
	}
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.close();
	}

}
