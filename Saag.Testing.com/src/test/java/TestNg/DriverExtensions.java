package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverExtensions {
	
	public WebDriver driver;
	
	public void launchBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\himaj\\Desktop\\chromedriver_win32 (3)\\chromedriver.exe");

			driver = new ChromeDriver();
		} 
		else if(browserName.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver", "C:\\Users\\himaj\\Downloads\\26thAug2022Batch\\edgedriver_win64 (4)\\msedgedriver.exe");
						
			driver=new EdgeDriver();
		}
		
	}

}
