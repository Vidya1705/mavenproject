package testngbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A_182_enabled_FALSE 
{
     @Test (enabled=false) //If we do not want the program to run
     public void testcase2()
     {
    	ChromeDriver driver= new ChromeDriver();
    	driver.get("https://www.google.com");
    	driver.findElement(By.name("q")).sendKeys("Olympics");
    	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
     }
}
