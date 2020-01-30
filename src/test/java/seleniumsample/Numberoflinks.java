package seleniumsample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Numberoflinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = MyDriver99.getDriver("chrome");
		driver.get("http://demowebshop.tricentis.com");
		Thread.sleep(500);
		List<WebElement> T_Link = driver.findElements(By.tagName("a"));
		int N_Links = T_Link.size();
		System.out.println("Total no of links avqaliable :"+N_Links);
	for(int i=0;i<N_Links;i++)
	{
		String L_Text = T_Link.get(i).getText();
		System.out.println(i+"th link is :"+L_Text);
	}
		/*driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("gender-female")).click();	
		driver.findElement(By.name("FirstName")).sendKeys("Gayaathri");
		driver.findElement(By.name("LastName")).sendKeys("Gayatahri1");
		driver.findElement(By.name("Email")).sendKeys("gayam.abhai@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("abhirama");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("aabhiram");
		driver.findElement(By.name("register-button")).click();
*/		
	}

}
