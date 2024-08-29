package testngbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productdescription 
{
    public static WebDriver driver;
	   @FindBy(id="wishListMainButton")
	   WebElement wishlist;
	   
	   public void Wishlist()
	   {
		   wishlist.click();
	   }
	   public void Productdescription(ChromeDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
}
