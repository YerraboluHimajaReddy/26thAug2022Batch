package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignOutPage {

	WebDriver driver;

	public SignOutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH,  using = "//a[contains(text(),'About')]")
	public WebElement about;
	
	@FindBy(how = How.XPATH,  using = "//a[contains(text(),'Support')]")
	public WebElement support;
	
	@FindBy(how = How.XPATH,  using = "//a[contains(text(),'Change Password')]")
	public WebElement changePassword;
	
	@FindBy(how = How.XPATH,  using = "//a[contains(text(),'Logout')]")
	public WebElement logout;
	
	public void clickLogout() {
		logout.click();
	}
	
	public void clickChangePassword() {
		changePassword.click();
	}
	
	public void clickSupport() {
		support.click();
	}
	
	public void clickabouts() {
		about.click();
	}
	
}
