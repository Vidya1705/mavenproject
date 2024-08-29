package Assertions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A_197_Amazon_Shoe_Login 
{
	@Test
	public void testcase1() throws EncryptedDocumentException, IOException
	{
		
	
	FileInputStream f1= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SeleniumBasics\\Vidya.xlsx");
    Workbook w1= WorkbookFactory.create(f1);
    String UN= w1.getSheet("Login3").getRow(0).getCell(0).getStringCellValue();
    String PW= w1.getSheet("Login3").getRow(0).getCell(1).getStringCellValue();
	
	EdgeDriver driver= new EdgeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("Shoes"+Keys.ENTER);
	List<WebElement> shoes= driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
	Assert.assertEquals(shoes.size(),72,"Test case is failed");
	}
}
