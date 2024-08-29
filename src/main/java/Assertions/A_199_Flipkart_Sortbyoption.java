package Assertions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A_199_Flipkart_Sortbyoption 
{
@Test
public void Method1() throws InterruptedException
{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	//WebElement fashion=driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
	//WebElement fashion=driver.findElement(By.xpath("//html//body//div[@class='_1wE2Px']"));
	WebElement fashion=driver.findElement(By.linkText("Men's T-Shirts"));
	//Actions a1=new Actions(driver);
	//a1.moveToElement(fashion).perform();
	fashion.click();
	/*Thread.sleep(2000);
//	WebElement men=driver.findElement(By.xpath("(//div[@class='_5M58Mb']/div/div/span)[3]"));
	//Actions a1=new Actions(driver);
	//a1.moveToElement(men).perform();
	Thread.sleep(2000);
	WebElement Tshirts=driver.findElement(By.xpath("//a[.='T-Shirts']"));
	Tshirts.click();
	Thread.sleep(2000);
	//String b=driver.getCurrentUrl();
	//.out.println(b);
	WebElement low_to_high=driver.findElement(By.xpath("(//div[@class='zg-M3Z'])[1]"));
	low_to_high.click();
	String b=driver.getCurrentUrl();
	System.out.println(b);
	Assert.assertEquals(b.contains("sort=price_asc"),true,"sorry");*/
	
	
}
}
