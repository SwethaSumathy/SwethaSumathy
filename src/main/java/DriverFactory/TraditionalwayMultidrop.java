package DriverFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TraditionalwayMultidrop {

	public static void main(String[] args) {
		
		WebDriver n = DriverFactory1.browserSetup("Chrome");
		n.get("https://www.globalsqa.com/samplepagetest/");
		n.manage().window().maximize();
		
		List<WebElement> h = n.findElements(By.xpath("//label[contains(text(),'Expertise :')]/label"));
		int size = h.size();
		
		System.out.println(h.size());
		
		
		
		
		
	}
	
	
	
}