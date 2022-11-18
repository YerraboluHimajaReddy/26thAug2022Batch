package TestNgScreenshots;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestNg.DriverExtensions;

public class TestNg_DataProviders extends DriverExtensions {

	@BeforeSuite
	public void launchBrowser() {

		System.out.println("I am in @BeforeSuite method ");

		launchBrowser("chrome");

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

	@Test
	public void enterUsername() {

		driver.findElement(By.name("username")).sendKeys("Admin");
	}

	@Test(dependsOnMethods = "enterUsername" , priority=0)
	public void enterPassword() {
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
	}

	@Test(dependsOnMethods = "enterPassword")
	public void clickLogin() {

		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@AfterSuite
	public void closeBrowser() {

		System.out.println("I am in @AfterSuite method ");

		driver.close();
	}
}
