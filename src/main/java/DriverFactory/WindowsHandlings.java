package DriverFactory;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandlings {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement m = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		m.sendKeys("selenium");
		m.sendKeys(Keys.ENTER); 
		
		List<WebElement> kl = driver.findElements(By.xpath("//div[@id=\"wikipedia-search-result-link\"]/a"));
		int size = kl.size();
		System.out.println(size);
		
		
		for (WebElement parent : kl) {
			
			parent.click();
		}
		String parent = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		
		for (String parent1 : allwindow) {
			
			driver.switchTo().window(parent1);
			driver.getCurrentUrl();
			String title = driver.getTitle();
			System.out.println(title);
			
		}
		
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
