package DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumScriptScroll {
	
	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.website.com/?source=SC&country=IN");
		driver.manage().window().maximize();
		JavascriptExecutor s= (JavascriptExecutor)driver;

		
		WebElement s1 = driver.findElement(By.xpath("//h2[contains(text(),'FAQs')]"));
		
		s.executeScript("arguments[0].scrollIntoView();", s1);
		Thread.sleep(3000);
		s.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
