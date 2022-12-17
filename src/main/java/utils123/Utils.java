package utils123;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Baseclass;

public class Utils extends Baseclass {
	public static long IMPLICIT_WAIT=20;
	public static long PAGE_LOAD_TIMEOUT=30;
	
	public void getregistration() {
		List<WebElement>ws=driver.findElements(By.tagName("select"));
		int len=ws.size();
		for(int i=0;i<len;i++) {
			System.out.println(ws.get(i).getAttribute("name"));
		}
	}
	
	
	
	

}
