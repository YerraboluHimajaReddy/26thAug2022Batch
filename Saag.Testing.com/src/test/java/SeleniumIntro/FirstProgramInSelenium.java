package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgramInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//chrome driver extension
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\himaj\\Downloads\\26thAug2022Batch\\chromedriver_win32 (2)\\chromedriver.exe");
		
		//chrome browser launching
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72911655628446&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_5nz8knj2kb_e");
		
		driver.close();
	}

}
