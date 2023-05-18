package DriverFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UnexpectedAlert {
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverFactory1.browserSetup("Chrome");
		driver.get("https://letcode.in/waits");
		driver.manage().window().maximize();
		
		WebElement h = driver.findElement(By.id("accept"));
		h.click();
		String text = h.getText();
		System.out.println(text);
		
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		
		Alert u = wait.until(ExpectedConditions.alertIsPresent());
		
		
		u.accept();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
