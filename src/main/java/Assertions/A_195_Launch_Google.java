package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A_195_Launch_Google 
{
	
	@Test
	public void testcase1()
	{
	ChromeDriver driver= new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    driver.findElement(By.name("q")).sendKeys("india");
    //driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    Assert.assertEquals(driver.getTitle(),"india - Google Search", "Please try again");
}
    
}
