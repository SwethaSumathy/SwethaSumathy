package DriverFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptSroll { 
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.website.com/?source=SC&country=IN");
		driver.manage().window().maximize();
		
		JavascriptExecutor s= (JavascriptExecutor)driver;
		s.executeScript("window.scrollBy(0,10000)"); 
		
		Thread.sleep(3000);
		
		s.executeScript("window.scrollBy(0,-10000)");
		
		String w = s.executeScript("return document.title;").toString();
		System.out.println(w);
		
		String e = s.executeScript("return document.URL;").toString();
		System.out.println(e);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
