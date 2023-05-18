package DriverFactory;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	
	public static void main(String[] args) throws IOException {
		
		
		WebDriver cat = DriverFactory1.browserSetup("Chrome");
		
		cat.get("https://www.facebook.com");
		
		
		cat.manage().window().maximize();
		
		TakesScreenshot r= ((TakesScreenshot)cat);
		File man = r.getScreenshotAs(OutputType.FILE);
		File desk= new File("./screen/image.png");
		FileUtils.copyFile(man, desk);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
