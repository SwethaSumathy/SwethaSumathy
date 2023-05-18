package DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAnddrop {
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverFactory1.browserSetup("Chrome");
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("//img[@alt=\"On top of Kozi kopka\"]"));
		
		WebElement des = driver.findElement(By.id("trash"));
		
		Actions s= new Actions(driver);
		
		s.dragAndDrop(source, des).build().perform();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
