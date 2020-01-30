package seleniumsample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Runerclas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = MyDriver99.getDriver("chrome");
		Thread.sleep(600);
		driver.get("http://newtours.demoaut.com");
    //     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait Wait=new WebDriverWait(driver,60);
		Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		driver.manage().window().maximize();
		}

}
