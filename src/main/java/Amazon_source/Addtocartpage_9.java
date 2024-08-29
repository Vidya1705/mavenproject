package Amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocartpage_9 
{
    public static WebDriver driver;

	  
	  @FindBy(id = "add-to-cart-button")
	  WebElement add_tocart;
	 
	  public void addtocart()
	  {
		  add_tocart.click();
	  }
	  
	  
	  public Addtocartpage_9 (WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
}
