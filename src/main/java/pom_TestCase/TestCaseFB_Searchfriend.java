package pom_TestCase;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom_source.FB_searchfriend;
import pom_source.TC1_LogintoFB;

public class TestCaseFB_Searchfriend 
{   ChromeDriver driver;
	@Test
	
	public void login() throws InterruptedException
	{
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		TC1_LogintoFB l1= new TC1_LogintoFB(driver);
		l1.un();
		l1.pw();
		l1.login();
		//Thread.sleep(30000);
		
		FB_searchfriend  p1= new FB_searchfriend (driver);
		p1.search();
		
		
		
		
		
		}

	private void search() {
		// TODO Auto-generated method stub
		
	}

	private void pw() {
		// TODO Auto-generated method stub
		
	}

	private void un() {
		// TODO Auto-generated method stub
		
	}
}
