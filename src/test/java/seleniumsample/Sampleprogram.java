package seleniumsample;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleprogram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
   		System.setProperty("webdriver.chrome.driver","C:\\driversg\\chromedriver_win32\\chromedriver.exe");
   		driver=new ChromeDriver();
   		driver.get("http://www.google.com");
   		driver.manage().window().maximize();
   		Thread.sleep(300);
   		Dimension d= new Dimension(300,600);
   		driver.manage().window().setSize(d);
   		Thread.sleep(300);
   		Point p=new Point(300,200);
   		driver.manage().window().setPosition(p);
   		String A_title = driver.getTitle();
   		String E_title = "Google";
   		
   		if(A_title.equals(E_title))
   		{
   			System.out.println("Test passed");
   		}
   		else 
   		{
   			System.out.println("Test failed");
   		}
   				
   				
   		}
   		}



