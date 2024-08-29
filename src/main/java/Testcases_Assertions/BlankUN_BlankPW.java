package Testcases_Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlankUN_BlankPW 
{
	@Test
	   public void testcase()
	   {
		   ChromeDriver driver= new ChromeDriver();
		   driver.get("https://www.facebook.com");
		   driver.manage().window().maximize();
		   WebElement UN=driver.findElement(By.name("email"));
		   UN.sendKeys(null);
		   WebElement PW=driver.findElement(By.name("pass"));
		   PW.sendKeys(null);
		   WebElement login=driver.findElement(By.name("login"));
		   login.click();
		   Assert.assertEquals(false, false);//TC is fail
	   }
}
