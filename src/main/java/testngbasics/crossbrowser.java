package testngbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser 
{
    static WebDriver driver;
    @Test
    @Parameters("browser")
    @BeforeMethod
	public void precondition(String browsername)
	{
    	if(browsername.equals("chrome"));
    	{
    		driver= new ChromeDriver();
    	}
    	if(browsername.equals("edge"));
    	{
    		driver= new EdgeDriver();
    	}
    	if(browsername.equals("firefox"));
    	{
    		driver= new FirefoxDriver();
    	}
		
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
