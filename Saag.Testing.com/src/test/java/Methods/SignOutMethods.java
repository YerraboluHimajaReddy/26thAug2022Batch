package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.SignOutPage;

public class SignOutMethods {

	WebDriver driver;

	public SignOutMethods(WebDriver driver) {
		this.driver = driver;
	}
	
	SignOutPage sp = PageFactory.initElements(driver, SignOutPage.class);;

	public void clickLogout() {
		sp.logout.click();
	}
	
	public void clickChangePassword() {
		sp.changePassword.click();
	}
	
	public void clickSupport() {
		sp.support.click();
	}
	
	public void clickabouts() {
		sp.about.click();
	}

}
