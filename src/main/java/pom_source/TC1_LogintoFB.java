package pom_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC1_LogintoFB
{
	
@FindBy(id="email")
WebElement emailid_un;
@FindBy(name="pass")
WebElement password;
@FindBy(xpath="//button[@name='login']")
WebElement login_button;

public void un()
{
	emailid_un.sendKeys("vidya1985@gmail.com");
}
public void pw()
{
	password.sendKeys("PavanVidu08");
}
public void login()
{
	login_button.click();
}
public TC1_LogintoFB (ChromeDriver driver)
{
	PageFactory.initElements(driver, this);
}


}
/*
1. Test if a new user can successfully register.--"Register.java,LOGINpage.java"

2. Verify login is successful with correct email and password-- "LOGINpage.java"

3 Ensure login fails with incorrect email or password-- "LOGINpage.java"

4 Check if a user can successfully edit their profile information- "login.java, Home.java, profilepage.java"

5 Test searching for products using its name like shoe- "Home.java, 

6. Verify that searching with filters (e.g., category, price range) yields
accurate results- "Home.java and searchresult.java"

7. Ensure that the product detail page displays all necessary
information (price, reviews, description).- productpage.java

8. Check if products can be sorted by relevance, price, rating, etc.-- Home.java and Search.java

9. Verify that items can be added to the shopping cart from product
pages.-- productpage.java and Addtocartpage.java

10. Test updating item quantities and removing items from the cart-- cartpage.java

11. Validate the entire checkout process, including address selection,
payment method selection, and order review-- checkoutpage.java, payment.java 

12. Check if user is able to select each payment method-- Payment.java

13.Check if user is able to apply for coupon code while ordering the
product-- checkout.java

14. Go to orders page and click on your last ordered product and give 5
star ratings-- Orderspage.java, Productdetailspage.java

15. Reach till cart page without login in amazon application-- Home.java and Addtocart.java*/
