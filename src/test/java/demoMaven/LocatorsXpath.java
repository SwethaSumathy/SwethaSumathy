package demoMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsXpath {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver build= new ChromeDriver();
		
		build.get("https://selectorshub.com/xpath-practice-page/");
		
		build.manage().window().maximize();
		
	//and 
		WebElement with = build.findElement(By.xpath("//input[@class=\"selectors-input jsSelector\" and @name=\"email\"]"));
		
		with.sendKeys("swetha.18p089@gmail.com");
		
	//contains with index
		WebElement has = build.findElement(By.xpath("//input[contains(@class,'selectors-input')][2]"));
		
		has.sendKeys("244466666");
		
	//text
		WebElement demo = build.findElement(By.xpath("//span[text()='Find out how to automate these controls without XPath']"));
		
	    String text = demo.getText();
	    
	    System.out.println(text);
	    
	//starts-with with and 
	    WebElement next = build.findElement(By.xpath("//input[starts-with(@name,'mobile') and @type=\"number\"]"));
	    
	    next.sendKeys("9344314610");
	    
    //index
	    WebElement neet = build.findElement(By.xpath("(//input[@name=\"company\"])[1]"));
	    
	    neet.sendKeys("RJS");
	    
	    
	    
	    
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
