package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstProgramInSelenium_edge {

	public static void main(String[] args) {

		//edge driver extension
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\himaj\\Downloads\\26thAug2022Batch\\edgedriver_win64 (4)\\msedgedriver.exe");
		
		//edge browser launching
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72911655628446&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_5nz8knj2kb_e");
	}

}
