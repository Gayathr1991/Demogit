package seleniumsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyDriver99 {

	public static WebDriver getDriver(String Browser){
		// TODO Auto-generated method stub
    if (Browser.equals("chrome"))
    {
    	  System.setProperty("webdriver.chrome.driver","C:\\driversg\\chromedriver_win32\\chromedriver.exe");
   		  return new ChromeDriver();
    }
    else if (Browser.equals("Firefox"))
    		{
    		System.setProperty("webdriver.gecko.driver","C:\\driversg\\geckodriver-v0.26.0-win64 (1)\\geckodriver.exe");
		    return new FirefoxDriver();
	        }
    else if (Browser.equals("IE"))
    		{
    		System.setProperty("webdriver.ie.driver","C:\\driversg\\IEDriverServer_Win32_2.39.0\\IEDriverServer.exe");
		    return new InternetExplorerDriver();
	        }
    else
    	return null;
    
	}
}
