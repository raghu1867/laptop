package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class Registration extends Baseclass {
	
	
	@FindBy(linkText ="Registration")
	WebElement txt_registration;
	
	@FindBy(linkText ="Perminent Registration")
	WebElement txt_perminent;
	
	
	
	
	public Registration() {
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifyregistration() {
		txt_registration.click();
return txt_registration.isDisplayed();	


	}
	
	

}
