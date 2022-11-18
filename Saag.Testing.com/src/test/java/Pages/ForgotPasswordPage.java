package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

	WebDriver driver;

	public ForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
	}

	public By username_Textbox_ResetPassword = By.xpath("//input[@name='username']");

	public By Cancel_Button = By.xpath("//button[@type='button']");

	public By ResetPassword_Button = By.xpath("//button[@type='submit']");
}
