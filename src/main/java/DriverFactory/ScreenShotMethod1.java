package DriverFactory;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotMethod1 {

	public static void Screenshotdemo(WebDriver driver) throws IOException
	{
		TakesScreenshot r= ((TakesScreenshot)driver);
		File man = r.getScreenshotAs(OutputType.FILE);
		File desk= new File("./image/screen"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(man, desk);
		
	}
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver r= new ChromeDriver();
		r.get("https://www.facebook.com/login.php/");
		r.manage().window().maximize();
		
		WebElement user = r.findElement(By.className("email"));
		user.sendKeys("swe");
	    
		
		WebElement text = r.findElement(By.id("pass"));
		text.sendKeys("244466666");
	
		
		WebElement rest = r.findElement(By.xpath("//button[@id='loginbutton']"));
		rest.click();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
