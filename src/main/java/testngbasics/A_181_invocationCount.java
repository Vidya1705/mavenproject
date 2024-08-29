package testngbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A_181_invocationCount 
{
   @Test (invocationCount=10)
   public void testcase1()
   {
	   ChromeDriver driver= new ChromeDriver();
	   driver.get("https://www.google.com");
	   driver.findElement(By.name("q")).sendKeys("Olympics");
	   driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	   
	   
	   
	   
	   
   }
	
	
	
	
}
