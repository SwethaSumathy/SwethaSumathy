package demoMaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	
	static String a="hockey";
	static String b="cricket";
	static String c="movies";
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver fine= new ChromeDriver();
		fine.get("https://demo.automationtesting.in/Register.html");
		List<WebElement> h = fine.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		System.out.println(h.equals(a));
	
		int size = h.size();
		System.out.println(size);
		
		if(a=="hockey")
		{
			
			System.out.println("String a is hockey");
			
		}
		else
		{
			
			System.out.println("b is not hockey");
			
		}
		
		
		System.out.println(h.get(2));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
