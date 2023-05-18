package DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RefreshSel {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver m = DriverFactory1.browserSetup("Chrome");
		m.get("https://www.facebook.com/login.php");
		
		m.manage().window().maximize();
		WebElement a = m.findElement(By.xpath("//input[@id='email']"));
	
	    a.sendKeys("swe");
	    a.sendKeys(Keys.F5);
		Thread.sleep(3000);
		
		m.close();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
