package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgExample1 {

	@Test
	public void verify() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\himaj\\Downloads\\26thAug2022Batch\\chromedriver_win32 (2)\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72911655628446&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_5nz8knj2kb_e");
		
		driver.close();
	}
}
