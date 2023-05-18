package demoMaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsxPathSelenium {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver just= new ChromeDriver();
		
		just.get("https://demo.automationtesting.in/Register.html");
		
		just.manage().window().maximize();
		
		//no of childs
		List<WebElement> t = just.findElements(By.xpath("//select[@id='Skills']/child::*"));
		System.out.println(t.size());
		
		//which particular child 
		WebElement n = just.findElement(By.xpath("//select[@id='Skills']/child::option[@value=\"Adobe Photoshop\"]"));
		String text2 = n.getText();
		System.out.println(text2);
		
		//child to followig sibling 
		WebElement c = just.findElement(By.xpath("//select[@id='Skills']/child::option[@value=\"Adobe Photoshop\"]/following-sibling::option[@value=\"Art Design\"]"));
		
		String text3 = c.getText();
		System.out.println(text3);
		
		//
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
