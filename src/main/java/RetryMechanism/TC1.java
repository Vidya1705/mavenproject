package RetryMechanism;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC1 
{
  @Test(retryAnalyzer=RetryMechanism.RetryLogic.class)
  public void launch_search()
  {
	  ChromeDriver driver= new ChromeDriver();
	    driver.get("https://www.amazon.in");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes"+Keys.ENTER);
	    
  }
}
