package DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaSendKeys {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php/");
		JavascriptExecutor s= (JavascriptExecutor)driver;
		WebElement u = driver.findElement(By.xpath("//input[@id='email']"));
		s.executeScript("document.getElementById('email').value='swe18p089@gmail.com';");
		
		WebElement p = driver.findElement(By.xpath("//input[@id='pass']"));
		
		s.executeScript("document.getElementById('pass').value='swe';");
		
//		WebElement l = driver.findElement(By.xpath("//button[@id='loginbutton']"));
//		s.executeScript("arguments[0].click;", l);
//		 
		s.executeScript("prompt"+ "('Enter the correct credentials to continue');");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
