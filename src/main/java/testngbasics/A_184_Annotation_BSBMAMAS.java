package testngbasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class A_184_Annotation_BSBMAMAS 
{
   @BeforeMethod
   public void bm()
   {
	   System.out.println("Before Method");
   }
   @AfterMethod
   public void am()
   {
	   System.out.println("After Method");
   }
   @Test
   public void test()
   {
	   System.out.println("Test");
   }
   @AfterSuite
   public void as()
   {
	   System.out.println("After Suite");
   }
   @BeforeSuite
   public void bs()
   {
	   System.out.println("Before Suite");
   }
   
}
