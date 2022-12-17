package test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobject.Login_page;
import pageobject.Registration;
import utils123.Utils;

public class Registration_test extends Baseclass {
	Login_page lp;
	Registration rg;
	Utils ut1 ;

	public Registration_test() {
		super();

	}

	@BeforeMethod
	public void setup() {
		inslization();
		 ut1 = new Utils();
		lp = new Login_page();
		rg = lp.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test
	public void verifyregistration() {
		boolean flag = rg.verifyregistration();
		Assert.assertTrue(flag);

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
