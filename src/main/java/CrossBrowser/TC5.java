package CrossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC5 extends A_188_CrossBrowser_5TC 
{
	@Test
	public void toys()
	{
		WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("toys"+Keys.ENTER);
	}
}
