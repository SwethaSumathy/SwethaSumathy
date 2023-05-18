package demoMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsSelenium {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver r= new ChromeDriver();
		
		r.get("https://www.facebook.com/");
		
		r.manage().window().maximize();
		
		WebElement ref = r.findElement(By.id("email")); 
		
		ref.sendKeys("9344314610");
		
		WebElement code = r.findElement(By.name("pass"));
		
		code.sendKeys("swe");
		
		WebElement key = r.findElement(By.linkText("Forgotten password?"));
		
		key.click();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
