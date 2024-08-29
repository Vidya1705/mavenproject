package Assertions;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A_196_AmazonSearch 
{   
	@Test
	public void testcase() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SeleniumBasics\\Vidya.xlsx");
	    Workbook w1= WorkbookFactory.create(f1);
	    String UN= w1.getSheet("Login3").getRow(0).getCell(0).getStringCellValue();
	    String PW= w1.getSheet("Login3").getRow(0).getCell(1).getStringCellValue();
		
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
		Assert.assertTrue(e1.isEnabled());
	}
	
}
