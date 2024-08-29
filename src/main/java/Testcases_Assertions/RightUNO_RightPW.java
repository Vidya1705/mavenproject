package Testcases_Assertions;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RightUNO_RightPW 
{
	 @Test
	   public void testcase() throws EncryptedDocumentException, IOException
	   {   
		   FileInputStream f1= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SeleniumBasics\\Vidya.xlsx");
	       Workbook w1= WorkbookFactory.create(f1);
	       String UN= w1.getSheet("FBlogin").getRow(0).getCell(0).getStringCellValue();
	       String PW= w1.getSheet("FBlogin").getRow(0).getCell(1).getStringCellValue();
	       
		   ChromeDriver driver= new ChromeDriver();
		   driver.get("https://www.facebook.com");
		   driver.manage().window().maximize();
		   WebElement username=driver.findElement(By.name("email"));
		   username.sendKeys(UN);
		   WebElement password=driver.findElement(By.name("pass"));
		   password.sendKeys(PW);
		   WebElement login=driver.findElement(By.name("login"));
		   login.click();
		   //Assert.assertTrue(login.isDisplayed(), PW);
		   WebElement w3 =driver.findElement(By.xpath("(//div[@class='x6s0dn4 x78zum5 x1s65kcs x1n2onr6']/a/span)[1]"));
			Assert.assertEquals(w3.isEnabled(), true);


	   }
}
