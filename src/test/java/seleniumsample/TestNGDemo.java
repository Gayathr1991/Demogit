package seleniumsample;

import org.testng.annotations.Test;

public class TestNGDemo {
	
  @Test(priority=1)//Annotation //no duplicates
  
  public void Login() {
	  System.out.println("code for login");
  }
  @Test(priority=2)
  public void Logina() {
	  System.out.println("code for logina");
	  
  }
  @Test(priority=1, dependsOnMethods="Wallet")
  public void orders() {
	  System.out.println("code for orders");
	  
  } 
  @Test
  public void Wallet() {
	  int a=10;
	  int b=0;
	  int c=b/a;
	  System.out.println("code for wallet");
  }
}
