package DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultiDropWithSelect {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dem = DriverFactory1.browserSetup("Chrome");
		
		dem.get("https://www.globalsqa.com/samplepagetest/");
		
		dem.manage().window().maximize();
		
		WebElement a = dem.findElement(By.className("grunion-field-label"));
		
		Select n = new Select(a);
		n.selectByIndex(0);
		n.selectByIndex(1);
		n.selectByIndex(2);
		
		Thread.sleep(3000);
		
		n.deselectByIndex(0);
		n.deselectByIndex(1);
		n.deselectByIndex(2);
		
		Thread.sleep(3000);
		
		n.selectByValue("Functional Testing");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
