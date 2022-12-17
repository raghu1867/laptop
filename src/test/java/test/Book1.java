package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Book1 {
	WebDriver driver;

	@BeforeMethod
	public void verifylogin() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
	}

	@Test
	public void verifymultipledrops() {

		/*
		 * List<WebElement>ls=driver.findElements(By.
		 * xpath("//input[@type='checkbox'and contains(@id,'day')]"));
		 * System.out.println(ls.size());
		 * 
		 * for(int i=0;i<ls.size();i++) { //ls.get(i).click();
		 * 
		 * 
		 * for(WebElement drpr:ls) { 
		 * String str=drpr.getAttribute("id");
		 * 
		 * if(str.equalsIgnoreCase("monday")||str.equalsIgnoreCase("sunday")) {
		 * drpr.click(); }
		 * 
		 * 
		 * 
		 * }
		 */

		/*
		 * List<WebElement>ws=driver.findElements(By.
		 * xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		 * System.out.println(ws.size()); for(WebElement drp:ws) {
		 */

		
	

	}

	@AfterMethod
	public void teardown() {
		// driver.quit();

	}

}
