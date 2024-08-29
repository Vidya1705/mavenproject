package pom_source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_searchfriend 
{
	//ChromeDriver driver;
	@FindBy(xpath="//input[@type='search']")
	WebElement searchfriend;
	public void search()
	{
		searchfriend.sendKeys("Swati Dhavala"+Keys.ENTER);
	}
	public FB_searchfriend (ChromeDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
