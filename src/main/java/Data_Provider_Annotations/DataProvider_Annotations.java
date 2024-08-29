package Data_Provider_Annotations;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Annotations
{
@DataProvider(name="data1")
public Object[][] method1()
{
	return new Object[][]  {{12},{50},{100}};
}
@Test (dataProvider="data2")
public void testcase2(String a)
{
	Reporter.log("The result is"+a);
}



/*@Test(dataProvider="data1")
public void testcase1(int a)
{
	//System.out.println(a);// Prints only in the console
	
}*/
}
