package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void LoginTest() throws InterruptedException
	{
		
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		
		Thread.sleep(5000);
		if (driver.getTitle().equals("Dashboard / nopCommerce administration")) 
		{
			lp.clickLogout();
			
			Thread.sleep(5000);
			Assert.assertTrue(true);
		} 
		else 
		{
			Assert.assertTrue(false);
			
		}
		
	}


	
}
