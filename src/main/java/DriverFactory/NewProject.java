package DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewProject {
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverFactory1.browserSetup("Chrome");
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement store = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		store.sendKeys("phone");
		
		WebElement se = driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
		
		se.click();
		
		//driver.findElement(By.xpath("))
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
