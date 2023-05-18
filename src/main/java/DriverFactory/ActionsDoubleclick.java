package DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsDoubleclick {

	public static void main(String[] args) {
		
		WebDriver driver = DriverFactory1.browserSetup("Chrome");
		driver.get("https://byjusexamprep.com/");
		driver.manage().window().maximize();
		
		
        WebElement click = driver.findElement(By.xpath("//div[contains(text(),'Study Materials')]"));
        
        
		Actions s= new Actions(driver);
		
		
		s.moveToElement(click).doubleClick().build().perform();
		
		
		WebElement exams = driver.findElement(By.xpath("//a[contains(text(),'Teaching Exams')]"));
		
		
		s.moveToElement(exams).contextClick().build().perform();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
