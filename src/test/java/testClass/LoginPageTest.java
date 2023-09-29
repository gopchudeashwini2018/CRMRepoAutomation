package testClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.qa.basepackage.BaseClass;
import FreeCRMpages.HomePage;
import FreeCRMpages.LoginPage;

public class LoginPageTest extends BaseClass {
	
	public LoginPage objLoginPage;
	
    public  HomePage objhomepage;

	
    public LoginPageTest()throws IOException
    {
    	super();
    }
    
    @BeforeMethod()
	public void setUP() throws IOException
	{
		objLoginPage=new LoginPage();
		BaseClass.getDriver();
		
	}
    
    @Test(priority=1)
    public void verifyTitle ()
    {
    	//objLoginPage.verifylinks(objLoginPage.gethomelink());
    	
    	String ActualTile=objLoginPage.getTitle();
    	
    	String ExpectedTile="Free CRM software for customer relationship management, sales, and support.";
    	
    	Assert.assertEquals(ActualTile, ExpectedTile);
    }
    
    @Test(priority=2)
    public void verifyhomelink()
    {
    	objLoginPage.verifylinks(objLoginPage.gethomelink());
    }
	
    @Test(priority=3)
    public void verifysignuplink()
    {
    	objLoginPage.verifylinks(objLoginPage.getsignuplink());
    }
    @Test(priority=4)
    public void verifyPricinglink()
    {
    	objLoginPage.verifylinks(objLoginPage.getPricinglink());
    }
    @Test(priority=5)
    public void verifyFeatureslink()
    {
    	objLoginPage.verifylinks(objLoginPage.getFeatureslink());
    }
    @Test(priority=6)
    public void verifyCustomerslink()
    {
    	objLoginPage.verifylinks(objLoginPage.getCustomerslink());
    }
    @Test(priority=7)
    public void verifygetContactlink()
    {
    	objLoginPage.verifylinks(objLoginPage.getContactlink());
    }
    @Test(priority=8)
    public void verifcrmlogo()
    {
    	objLoginPage.crmlogo();
     Assert.assertTrue(objLoginPage.crmlogo());
    	
    }
   @Test(priority=9)
    public void verifyLogin() throws IOException 
    {
    	//objhomepage=objLoginPage.login(prop.getProperty("Username"),prop.getProperty("Password"));
	   
	   objhomepage=objLoginPage.login("Freecrmlearing", "Crm@123");
    	
     }
   
   @Test(priority=10)
   public void testRepo() throws IOException 
   {
   	System.out.println("Verification for test Repo");
   	
    }
   
    
   @AfterClass()
  public void tearDown()
  {
	  driver.close();
  }
    
    
    
}
