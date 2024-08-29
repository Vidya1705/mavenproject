package testngbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class A_187_TC2 extends A_187_AmazonShoes_tc1_tc2_BMAM
{
@Test
public void mobiles()
{
	WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("Mobiles"+Keys.ENTER);
}
}
