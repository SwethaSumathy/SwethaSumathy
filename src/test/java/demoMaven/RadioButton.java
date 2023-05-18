package demoMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver face= new ChromeDriver();
		
		face.get("https://demo.automationtesting.in/Register.html");
		
		face.manage().window().maximize();
	//female::
		WebElement female = face.findElement(By.xpath("(//input[@value=\"FeMale\"])"));
		
		female.click();
		
	//male::
		WebElement male = face.findElement(By.xpath("//input[@ng-model=\"radiovalue\" or @value=\"Male\"]"));
		
		male.click();
		
		boolean selected = male.isSelected();
		
		System.out.println(selected);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
