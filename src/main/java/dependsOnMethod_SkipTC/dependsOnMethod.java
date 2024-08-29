package dependsOnMethod_SkipTC;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethod 
{
@Test
public void login()
{
	Assert.assertTrue(false); 
}
@Test(dependsOnMethods="login")
public void logout()
{
	
}
}
