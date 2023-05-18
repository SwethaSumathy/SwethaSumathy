package DriverFactory;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;

public class RobotScreenShot {
	
   public static void main(String[] args) throws AWTException, IOException {
	
	  WebDriver r = DriverFactory1.browserSetup("chrome");
	
	  r.get("https://www.facebook.com/login.php/");
	
	  r.manage().window().maximize();
	
	  Robot s= new Robot();
	
	  BufferedImage rise = s.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	
	  ImageIO.write(rise, "png", new File("C:\\Users\\raghu\\eclipse-workspace\\DemoMevanProject\\screen\\demo.pnp"));


	  
	  
	
	
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
