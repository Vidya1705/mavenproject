package pom_TestCase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom_source.TC1_LogintoFB;

public class TestCaseLogin 
{
	ChromeDriver driver;
@Test
public void login()
{
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	TC1_LogintoFB l1= new TC1_LogintoFB(driver);
	l1.un();
	l1.pw();
	l1.login();
	
	
	
	}
}
