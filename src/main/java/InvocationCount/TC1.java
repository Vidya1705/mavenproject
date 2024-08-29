package InvocationCount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC1 
{
	@Test
	public void login()	
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement username= driver.findElement(By.id("email"));
		username.sendKeys("vidya1985@gmail.com");
		WebElement password= driver.findElement(By.id("pass"));
		password.sendKeys("Vids@123");
	}
}
