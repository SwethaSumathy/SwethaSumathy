package DriverFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowsHandling {
	
	public static void main(String[] args) {
		
		WebDriver a = DriverFactory1.browserSetup("chrome");
		
		a.get("https://testautomationpractice.blogspot.com/");
		a.manage().window().maximize();
		a.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String parent = a.getWindowHandle();
		
		WebElement m = a.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		
		m.sendKeys("selenium");
		
		m.sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
