package InvocationCount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invocationcount 
{

    @Test(priority=1,invocationCount=3)
    public void testcase1()
    {
  	  ChromeDriver driver= new ChromeDriver();
  	  driver.get("https://www.google.com");
  	  driver.findElement(By.name("q")).sendKeys("Olympics");
  	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

    }
    @Test
    public void add()
    {
  	  
    }
}
