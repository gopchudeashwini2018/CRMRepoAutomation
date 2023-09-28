package testClass;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.qa.basepackage.BaseClass;
import FreeCRMpages.HomePage;
import FreeCRMpages.LoginPage;
import FreeCRMpages.NewContactPage;
import FreeCRMpages.ContactPage;
import utility.Qa.Com.TestUtil;

public class HomePageTest extends BaseClass {

	public LoginPage objLoginPage;
	
	public HomePage objHomePage;
	
	public NewContactPage objNewContactPage;
	 
     TestUtil objTestUtil;
	
	public HomePageTest() throws IOException {
		super();
		
	}
	
	 @BeforeMethod()
		public void setUP() throws IOException
		{
		     BaseClass.getDriver();
		 
			objLoginPage=new LoginPage();
			
			objHomePage=new HomePage();
			
			objNewContactPage=new NewContactPage();
			
			objTestUtil=new TestUtil();
			
			objHomePage=objLoginPage.login(prop.getProperty("Username"),prop.getProperty("Password"));
			
			
			
		}
	 @Test(priority=1)
	 public void clickOnContactlink()
	 {  
		 TestUtil.frameHandler("mainpanel");
		 
		 objHomePage.clickOnTab("Contacts");
	 }
	 
	 @Test(priority=2)
	 public void clickOnHomelink()
	 {
		 TestUtil.frameHandler("mainpanel");
		 objHomePage.clickOnTab("Home");
		 
	 }
	 @Test(priority=3)
	 public void clickOnCalendarlink()
	 {
		 TestUtil.frameHandler("mainpanel");
		 objHomePage.clickOnTab("Calendar");
		 
	 }
	 @Test(priority=4)
	 public void clickOnCompanieslink()
	 {
		 TestUtil.frameHandler("mainpanel");
		 objHomePage.clickOnTab("Companies");
		 
	 }
	 @Test(priority=5)
	 public void clickOnDealslink()
	 {
		 TestUtil.frameHandler("mainpanel");
		 objHomePage.clickOnTab("Deals");
		 
	 }
	 @Test(priority=6)
	 public void clickOnTaskslink()
	 {
		 TestUtil.frameHandler("mainpanel");
		 objHomePage.clickOnTab("Tasks");
		 
	 }
	 @Test(priority=7)
	 public void clickOnCaseslink()
	 {
		 TestUtil.frameHandler("mainpanel");
		 objHomePage.clickOnTab("Cases");
		 
	 }
	 @Test(priority=8)
	 public void clickOnCalllink()
	 {
		 TestUtil.frameHandler("mainpanel");
		 objHomePage.clickOnTab("Call");
		 
	 }
	 @Test(priority=9)
	 public void clickOnEmaillink()
	 {
		 TestUtil.frameHandler("mainpanel");
		 objHomePage.clickOnTab("Email");
		 
	 }
	 @Test(priority=10)
	 public void clickOnTextSMSlink()
	 {
		 TestUtil.frameHandler("mainpanel");
		 objHomePage.clickOnTab("Text/SMS");
		 
	 }
	 @Test(priority=11)
	 public void clickOnPrintlink()
	 {
		 TestUtil.frameHandler("mainpanel");
		 objHomePage.clickOnTab("Print");
		 
	 }
	 @Test(priority=12)
	 public void clickOnCampaignslink()
	 {
		 TestUtil.frameHandler("mainpanel");
		 objHomePage.clickOnTab("Campaigns");
		 
	 }
	 @Test(priority=13)
	 public void clickOnDocslink()
	 {
		 TestUtil.frameHandler("mainpanel");
		 objHomePage.clickOnTab("Docs");
		 
	 }
	 @Test(priority=14)
	 public void clickOnFormslink()
	 {
		 TestUtil.frameHandler("mainpanel");
		 objHomePage.clickOnTab("Forms");
		 
	 }
	 @Test(priority=15)
	 public void clickOnReportslink()
	 {
		 TestUtil.frameHandler("mainpanel");
		 objHomePage.clickOnTab("Reports");
		 
	 }
	 @Test(priority=16)
	 public void verifyHomeTab()
	 {
		 TestUtil.frameHandler("mainpanel");
		Assert.assertTrue(objHomePage.verifyTabs("Home"));
	 }
	 
	 @Test(priority=17)
	 public void verifyCalenderTab()
	 {
		 TestUtil.frameHandler("mainpanel");
		Assert.assertTrue(objHomePage.verifyTabs("Calender"));
	 }
	 
	 @Test(priority=18)
	 public void verifyCompaniesTab()
	 {
		 TestUtil.frameHandler("mainpanel");
		Assert.assertTrue(objHomePage.verifyTabs("Companies"));
	 }
	 @Test(priority=19)
	 public void verifyContactsTab()
	 {
		 TestUtil.frameHandler("mainpanel");
		Assert.assertTrue(objHomePage.verifyTabs("Contacts"));
	 }
	 @Test(priority=20)
	 public void verifyDealsTab()
	 {
		 TestUtil.frameHandler("mainpanel");
		 Assert.assertTrue(objHomePage.verifyTabs("Deals"));
	 }
	 
	 @Test(priority=21)
	 public void verifyTasksTab()
	 {
		 TestUtil.frameHandler("mainpanel");
		 Assert.assertTrue(objHomePage.verifyTabs("Tasks"));
	 }
	
	 @Test(priority=22)
	 public void verifyCasesTab()
	 {
		 TestUtil.frameHandler("mainpanel");
		 Assert.assertTrue(objHomePage.verifyTabs("Cases"));
	 }
	 @Test(priority=23)
	 public void verifyCallTab()
	 {
		 TestUtil.frameHandler("mainpanel");
		 Assert.assertTrue(objHomePage.verifyTabs("Call"));
	 }
	 @Test(priority=24)
	 public void verifyEmailTab()
	 {
		 TestUtil.frameHandler("mainpanel");
		 Assert.assertTrue(objHomePage.verifyTabs("Email"));
	 }
	 @Test(priority=25)
	 public void verifyTextSMSTab()
	 {
		 TestUtil.frameHandler("mainpanel");
		 Assert.assertTrue(objHomePage.verifyTabs("Text/SMS"));
	 }
	 @Test(priority=26)
	 public void verifyPrintTab()
	 {
		 TestUtil.frameHandler("mainpanel");
		 Assert.assertTrue(objHomePage.verifyTabs("Print"));
	 }
	 @Test(priority=27)
	 public void verifyCampaignsTab()
	 {
		 TestUtil.frameHandler("mainpanel");
		 Assert.assertTrue(objHomePage.verifyTabs("Campaigns"));
	 }
	 
	 @Test(priority=28)
	 public void verifyDocsTab()
	 {
		 TestUtil.frameHandler("mainpanel");
		 Assert.assertTrue(objHomePage.verifyTabs("Docs"));
	 }
	 @Test(priority=29)
	 public void verifyFormsTab()
	 {
		 TestUtil.frameHandler("mainpanel");
		 Assert.assertTrue(objHomePage.verifyTabs("Forms"));
		 
		 
	 }
	 
	 @Test(priority=30)
	 public void verifyReportsTab()
	 {
		 TestUtil.frameHandler("mainpanel");
		 Assert.assertTrue(objHomePage.verifyTabs("Reports"));
		 
		 
	 }
	 
	 
	 
	 @Test(priority=31)
	 public void verifySubmenuOfContact() throws IOException
	 
	 {   TestUtil.frameHandler("mainpanel");
		 objHomePage.moveToElementUI(objHomePage.contacts);
		 
		objHomePage.verifyMenu(objHomePage.contactmenu, "New Contact");
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
