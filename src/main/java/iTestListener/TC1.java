package iTestListener;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(iTestListener.A_209_ITestListener.class)
public class TC1  extends A_209_ITestListener
{   
    @Test
    public void amazon_launch() throws EncryptedDocumentException, IOException, InterruptedException
    {
	FileInputStream f1= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SeleniumBasics\\Vidya.xlsx");
	Workbook w1= WorkbookFactory.create(f1);
	String UN= w1.getSheet("Login3").getRow(0).getCell(0).getStringCellValue();
	String PW= w1.getSheet("Login3").getRow(0).getCell(1).getStringCellValue();
	
	driver= new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("shoes"+Keys.ENTER);
	WebElement shoe= driver.findElement(By.xpath("(//div[@Class='a-section aok-relative s-image-tall-aspect'])[3]"));
	shoe.click();
	
	Set<String> ids= driver.getWindowHandles();
	Iterator<String>id=ids.iterator();
	String parentid=id.next();
	String childid= id.next();
	driver.switchTo().window(childid);
	
	WebElement buynow=driver.findElement(By.id("buy-now-button"));
	buynow.click();
	WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
	email.sendKeys(UN);
	WebElement cont=driver.findElement(By.xpath("//span[@id='continue']"));
	//cont.click();
	Thread.sleep(2000);
	WebElement password= driver.findElement(By.xpath("//input[@id='ap_password']"));
	password.sendKeys(PW);
	WebElement signin=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	signin.click();
}
	
	
}
