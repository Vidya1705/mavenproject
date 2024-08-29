package testngbasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class A_187_AmazonShoes_tc1_tc2_BMAM 
{  ChromeDriver driver;
   @BeforeMethod
   public void precondition()
   {
	   driver= new ChromeDriver();
	   driver.get("https://www.amazon.in");
	   driver.manage().window().maximize();
   }
   @AfterMethod
   public void postexecution() throws InterruptedException
   {
	  Thread.sleep(3000);
	  driver.quit();
   }
}
