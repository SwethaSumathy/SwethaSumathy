package demoMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewScriptNavigate {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver s= new ChromeDriver();		
		
		s.navigate().to("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN714G0&p=testbook.com");
		
		s.navigate().to("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN714G0&p=cwj+login");
		
		s.navigate().to("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN714G0&p=adda247");
		
		s.navigate().to("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN714G0&p=race+institute+login");
		
		s.navigate().to("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN714G0&p=ixambee");
		
		s.navigate().to("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN714G0&p=smartkeeda+testzone");
		
		s.navigate().to("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN714G0&p=testbook.com");
		
		s.navigate().to("https://byjusexamprep.com/");
		
		s.navigate().to("https://exampundit.in/");
		
		s.navigate().to("https://u1.oliveboard.in/exams/?c=tests&i=banking");
		
		s.navigate().back();
		
		s.navigate().back();
		
		s.navigate().back();
		
		Thread.sleep(2000);
		
		s.navigate().forward();
		
		s.navigate().back();
		
		s.navigate().forward();
		
		s.navigate().refresh();
		
		Thread.sleep(3000);
		
		s.navigate().forward();
		
		s.navigate().back();
		
		s.navigate().back();
		
		s.navigate().back();
		
		s.navigate().back();
		
		s.navigate().back();
		
		s.navigate().forward();
		
		s.navigate().forward();
		
		s.navigate().refresh();
		
		s.navigate().forward();
		
		s.navigate().forward();
		
		s.navigate().forward();
		
		Thread.sleep(2500);
		
		s.navigate().forward();
		
		s.navigate().forward();
		
		s.navigate().forward();
		
		s.navigate().forward();
		
		s.navigate().forward();
		
		s.navigate().back();
		
		
		s.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
