package demoMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewScript1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();		
		
		WebDriver r= new ChromeDriver();		
		
		r.get("https://facebook.com");
		
		r.manage().window().maximize();
		
		Thread.sleep(4000);
		
		r.close();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
