package DriverFactory;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RobotWithStatic {
	
	public static void Robotscreenshot(WebDriver driver) throws IOException{
	TakesScreenshot r= ((TakesScreenshot)driver);
	File man = r.getScreenshotAs(OutputType.FILE);
	File desk= new File("./screen/screenshot"+ System.currentTimeMillis()+".png");
	FileUtils.copyFile(man, desk);
	
	}
	public static void main(String[] args) {
		
		WebDriver name = DriverFactory1.browserSetup("Chrome");
		
		name.get("https://www.facebook.com/login.php/");
		
	    name.manage().window().maximize();
	    
	    
	    WebElement user = name.findElement(By.id("email"));
		user.sendKeys("swe");
		DriverFactory1.robot();
		
		WebElement wise = name.findElement(By.name("pass"));
		wise.sendKeys("244466666");
		DriverFactory1.robot();
		
		WebElement well = name.findElement(By.xpath("//button[@id='loginbutton']"));
		well.click();
		DriverFactory1.robot();
	}
}

	
	
	