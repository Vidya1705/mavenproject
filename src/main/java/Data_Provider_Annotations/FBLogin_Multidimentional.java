package Data_Provider_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FBLogin_Multidimentional 
{
@Test(dataProvider="data1")
public void login_FB(String Username, String Password)
{
	ChromeDriver driver= new ChromeDriver();
    driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	WebElement UN= driver.findElement(By.xpath("//input[@id='email']")); 
	UN.sendKeys(Username);
	WebElement PW= driver.findElement(By.xpath("//input[@name='pass']")); 
	PW.sendKeys(Password);
	WebElement Login= driver.findElement(By.xpath("//button[@name='login']")); 
	Login.click();
}
@DataProvider(name="data1")
public Object[][] method1()
{
	Object data[][]= new Object[2][2];
	//1st Set of Data
	data[0][0]="vidya1985@gmail.com";//right UN
	data[0][1]="vidya123";//right PW
	//2nd Set of Data
	data[1][0]="vidya1985@gmail.com";//right UN
	data[1][1]="vidya123458fdf";//wrong PW
	return data;
	
	
}
}
