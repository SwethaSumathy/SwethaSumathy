package DriverFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenImages {      

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = DriverFactory1.browserSetup("Chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/broken");
		Thread.sleep(2000);
		List<WebElement> image = driver.findElements(By.xpath("//img[@xpath=\"1\"]"));
		int size = image.size();
		System.out.println(size); 
		                                                                       
		for(int i=0; i<=image.size(); i++)
		{ 
		   WebElement a = image.get(i);
           System.out.println(a); 
		   String url=a.getAttribute("src");
		    
	       URL link = new URL(url);
		   HttpURLConnection openConnection=(HttpURLConnection) link.openConnection();
		   Thread.sleep(2000);
		   
		   openConnection.connect();
		   Thread.sleep(2000);
		   int responseCode = openConnection.getResponseCode();
		   
		   if(responseCode<=400)
		   { 
			   
			   System.out.println("it will be broken" +url);
			   
		   }
		   else
		   { 
			   
			   System.out.println("it will be valid " +url);

		   }
		   
		}
	}
	
}
