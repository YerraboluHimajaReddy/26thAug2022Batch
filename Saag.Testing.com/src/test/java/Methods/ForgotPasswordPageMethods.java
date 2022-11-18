package Methods;

import org.openqa.selenium.WebDriver;

import Pages.ForgotPasswordPage;

public class ForgotPasswordPageMethods {

	WebDriver driver;

	ForgotPasswordPage fp = new ForgotPasswordPage(driver);

	public ForgotPasswordPageMethods(WebDriver driver) {
		this.driver = driver;
	}

	// 1st way

	public void enterUsername() {

		driver.findElement(fp.username_Textbox_ResetPassword).sendKeys("Admin");
	}

	public void clickCancel() {

		driver.findElement(fp.Cancel_Button).click();
	}

	public void resetPassword() {

		driver.findElement(fp.ResetPassword_Button).click();
	}

}
