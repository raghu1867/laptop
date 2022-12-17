package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class Login_page extends Baseclass {

	@FindBy(name = "username")
	@CacheLookup
	WebElement txt_username;

	@FindBy(name = "password")
	@CacheLookup
	WebElement txt_password;

	@FindBy(xpath = "//*[@name='submit']")
	@CacheLookup
	WebElement txt_btn;

	public Login_page() {

		PageFactory.initElements(driver, this);

	}

	public Registration login(String us, String pwd) {
		txt_username.sendKeys(us);
		txt_password.sendKeys(pwd);
		txt_btn.click();
		return new Registration();
	}

	public String verftytitle() {
		return driver.getTitle();
	}

}
