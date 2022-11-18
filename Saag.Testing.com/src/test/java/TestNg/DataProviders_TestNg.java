package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders_TestNg extends DriverExtensions {

	@BeforeSuite
	public void launchBrowser() {

		System.out.println("I am in @BeforeSuite method ");

		launchBrowser("chrome");

	}

	@BeforeTest
	public void launchURL() {

		System.out.println("I am in @BeforeTest method ");

		driver.get("https://www.facebook.com/");
	}

	@BeforeClass
	public void maximizeBrowser() {

		System.out.println("I am in @BeforeClass method ");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

	}

	@DataProvider(name = "facebookData")
	public Object[][] data() {

		Object[][] values = new Object[4][2];

		values[0][0] = "Nagarjuna";
		values[0][1] = "Nagarjuna@123";

		values[1][0] = "Pranitha";
		values[1][1] = "Pranitha@123";

		values[2][0] = "Veena";
		values[2][1] = "Veena@123";

		values[3][0] = "Swapna";
		values[3][1] = "Swapna@123";

		return values;
	}

	@Test(dataProvider = "facebookData")
	public void enterDataToTheFields(String username, String password) {

		// username

		driver.findElement(By.id("email")).clear();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.findElement(By.id("email")).sendKeys(username);

		// password

		driver.findElement(By.id("pass")).clear();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.findElement(By.id("pass")).sendKeys(password);

	}

	@AfterSuite
	public void closeBrowser() {

		System.out.println("I am in @AfterSuite method ");

		driver.close();
	}
}
