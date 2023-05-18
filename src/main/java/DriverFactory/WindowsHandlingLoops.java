package DriverFactory;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandlingLoops {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		
		String first = driver.getWindowHandle();
		System.out.println(first);
		WebElement a = driver.findElement(By.xpath("//button[@id='home']"));
		a.click();
     	Dimension size = a.getSize();
	    System.out.println(size);
	
	
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);

		
		for (String first1 : allwindows) {
			    
			driver.switchTo().window(first1);
			
		}
		WebElement nxt = driver.findElement(By.xpath("//p[contains(text(),'Button')]"));
		String text = nxt.getText();
		System.out.println(text);
		driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		driver.switchTo().window(title);

		{
			
			WebElement tutorial = driver.findElement(By.xpath("//a[contains(text(),'Watch tutorial')]"));
			tutorial.click();
			int size1 = driver.getWindowHandles().size();
			System.out.println(size1);
			                 
			Set<String> windowHandles = driver.getWindowHandles();
			
			for (String child : windowHandles) {
				        
				if(!windowHandles. equals(child)) {
					driver.switchTo().window(title);
					driver.close();
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	}
