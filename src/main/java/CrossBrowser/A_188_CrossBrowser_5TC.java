package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class A_188_CrossBrowser_5TC 
{
	static WebDriver driver;
	@BeforeMethod()
	@Parameters("browser")
	public void precondtion1(String value)
	{
		if(value.equals("chrome"))
		{
		driver=new ChromeDriver();
		}
		if(value.equals("edge"))
		{
		driver=new EdgeDriver();
		}
		if(value.equals("firefox"))
		{
		driver=new FirefoxDriver();
		}
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		}

	@AfterMethod()
	public void postexecution() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
