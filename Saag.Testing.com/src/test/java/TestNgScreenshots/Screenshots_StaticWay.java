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

public class Screenshots_StaticWay extends DriverExtensions {

	File screenshot;

	@BeforeSuite
	public void launchBrowser() throws IOException {

		System.out.println("I am in @BeforeSuite method ");

		launchBrowser("chrome");

		screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(screenshot, new File(
				"C:\\Users\\himaj\\Documents\\26thAugust2022\\Saag.Testing.com\\src\\test\\java\\ScreenshotImages\\launchBrowser.png"));

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

		FileUtils.copyFile(screenshot, new File(
				"C:\\Users\\himaj\\Documents\\26thAugust2022\\Saag.Testing.com\\src\\test\\java\\ScreenshotImages\\urlLaunched.png"));

	}

	@Test
	public void enterDataToTheFields() throws IOException {

		driver.findElement(By.xpath("//button[text()='Click Me']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		FileUtils.copyFile(screenshot, new File(
				"C:\\Users\\himaj\\Documents\\26thAugust2022\\Saag.Testing.com\\src\\test\\java\\ScreenshotImages\\alert.png"));

		driver.switchTo().alert().accept();
	}

	@AfterSuite
	public void closeBrowser() {

		System.out.println("I am in @AfterSuite method ");

		driver.close();
	}
}
