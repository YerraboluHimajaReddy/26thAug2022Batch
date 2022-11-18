package TestNgScreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class Screenshot_Extensions {

	//1st way
	public WebDriver driver;
	
	//2nd way
	// WebDriver driver;
	
//	public Screenshot_Extensions(WebDriver driver) {
//		
//		this.driver=driver;
//	}
	
	public void takeScreenshot(String screenshotName) throws IOException {
		
		File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(screenShot, new File(
				"C:\\Users\\himaj\\Documents\\26thAugust2022\\Saag.Testing.com\\src\\test\\java\\Pratheek\\" + screenshotName));

	}
}
