package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Methods.SignOutMethods;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignOutPage;
import TestNg.DriverExtensions;

public class LoginAndLogout extends DriverExtensions{
	
	LoginPage lp;
	
	HomePage hp;
	
	SignOutPage sp;

	@BeforeSuite
	public void launchBrowser() {

		System.out.println("I am in @BeforeSuite method ");

		launchBrowser("chrome");
		
		lp=new LoginPage(driver);
		
		hp=PageFactory.initElements(driver, HomePage.class);

		sp=PageFactory.initElements(driver, SignOutPage.class);
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
	
	@Test(priority = 1)
	public void enterCredentials() {
		
		lp.enterUsername();
		
		lp.enterPassword("admin123");
		
		lp.clickLogin();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	}
	
	@Test(priority = 2)
	public void clickLogout() {
		
		hp.clickpaulCoolings();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		sp.clickLogout();		
		
	}
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.close();
	}

}
