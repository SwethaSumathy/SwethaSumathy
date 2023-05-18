package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory1 {
	
	public static WebDriver browserSetup(String browserName)
	{
		WebDriver driver= null;
		switch(browserName)
		{
		
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		    break;
		    
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		default:
			System.out.println("no browsers are matched");
			break;
				
		}
		return driver;
	}

	public static void robot() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
