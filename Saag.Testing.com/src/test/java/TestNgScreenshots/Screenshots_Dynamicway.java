package TestNgScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNg.DriverExtensions;

public class Screenshots_Dynamicway extends Screenshot_Extensions {

	@BeforeSuite
	public void launchBrowser() throws IOException {

		System.out.println("I am in @BeforeSuite method ");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himaj\\Desktop\\chromedriver_win32 (3)\\chromedriver.exe");

		driver = new ChromeDriver();

		takeScreenshot("launchBrowser.png");
	}

	@BeforeTest
	public void launchURL() {

		System.out.println("I am in @BeforeTest method ");

		driver.get("https://testautomationpractice.blogspot.com/");

	}

	@BeforeClass
	public void maximizeBrowser() throws IOException {

		System.out.println("I am in @BeforeClass method ");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		takeScreenshot("urlLaunched.png");

	}
	
	@Test(priority = 0)
	public void enterDataToTheField1() throws IOException {

		driver.findElement(By.id("field1")).clear();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		takeScreenshot("AfterClean.png");
		
		driver.findElement(By.id("field1")).sendKeys("Pratheek");;

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		takeScreenshot("AfterEnteringText.png");

	}

	@Test(priority = 1)
	public void enterDataToTheFields() throws IOException {

		driver.findElement(By.xpath("//button[text()='Click Me']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		driver.switchTo().alert().accept();
		
		takeScreenshot("alert.png");

	}

	@AfterSuite
	public void closeBrowser() {

		System.out.println("I am in @AfterSuite method ");

		driver.close();
	}
}
