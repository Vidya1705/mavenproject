package Data_Provider_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataAnnotations_Google_10data 
{
   @Test (dataProvider="data1")
   public void google_search(String input)
   {
	   ChromeDriver driver= new ChromeDriver();
	   driver.get("https://www.google.com");
	   driver.manage().window().maximize();
	   WebElement e1=driver.findElement(By.name("q"));
       e1.sendKeys(input+Keys.ENTER);
	}
   @DataProvider(name="data1")
   public Object[][] method1()
   {
	   return new Object[][] {{"Olympics"},{"Hockey"},{"Javelin"},{"Swimming"},{"Cycling"},{"Boxing"},{"Wrestling"},{"football"},{"Handball"},{"Volleyball"}};
   }
}
