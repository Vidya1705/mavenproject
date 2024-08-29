package testngbasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A_185_BM_TC1_TC2_AM 
{
  @BeforeMethod
  public void bm()
  {
	 System.out.println("Before Method"); 
  }
  @Test
  public void testcase1()
  {
	  System.out.println("Test case 1");
  }
  @Test
  public void testcase2()
  {
	  System.out.println("Test case 2");
  }
  @AfterMethod
  public void am()
  {
	  System.out.println("After Method"); 
  }
  
	
	
	
	
}
