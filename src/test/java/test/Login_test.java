package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobject.Login_page;
import pageobject.Registration;

public class Login_test extends Baseclass {

	Login_page lp;
	Registration rg;

	public Login_test() {
		super();
	}

	@BeforeMethod
	public void setup() {
		inslization();

		 lp = new Login_page();
	}

	/*
	 * Username=admin Password=admin
	 * 
	 */
	@Test
	public void verifylogin() {
		rg = lp.login("Username", "Password");

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
