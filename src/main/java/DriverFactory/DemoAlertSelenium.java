package DriverFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoAlertSelenium {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver web = DriverFactory1.browserSetup("Chrome");
		
		web.get("https://demoqa.com/alerts");
		
		web.manage().window().maximize();
		
		WebElement r = web.findElement(By.id("alertButton"));
		r.click();
		Alert a= web.switchTo().alert();
		System.out.println(a.getText());
        a.accept();
		Thread.sleep(3000);
		
		WebElement size = web.findElement(By.xpath("//button[@id='timerAlertButton']"));
	    size.click();
		System.out.println(size.getText());
	    size.click();
		Thread.sleep(3000);
		
		WebElement m = web.findElement(By.xpath("//button[@id='confirmButton']"));
		m.click();
		Alert c= web.switchTo().alert();
		System.out.println(c.getText());
		c.dismiss();
		Thread.sleep(3000);
		
		WebElement e = web.findElement(By.xpath("//button[@id='promtButton']"));
		e.click();
		Alert d= web.switchTo().alert();
		System.out.println(d.getText());
		d.sendKeys("swe");
		d.dismiss();
		web.close();
			} 
	
}
