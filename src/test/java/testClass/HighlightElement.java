package testClass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.qa.basepackage.BaseClass;
import FreeCRMpages.HomePage;
import FreeCRMpages.LoginPage;
import FreeCRMpages.NewContactPage;
import utility.Qa.Com.TestUtil;

public class HighlightElement extends BaseClass {
	
	public HighlightElement() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginPage objLoginPage;

	public HomePage objHomePage;

	public NewContactPage objNewContactPage;

	String sheetname = "Contacts";

	TestUtil objTestUtil;
	
	JavascriptExecutor jse;
	
	@BeforeMethod()
	public void setUP() throws IOException {
		
		BaseClass.getDriver();

		objLoginPage = new LoginPage();

		objHomePage = new HomePage();

		objNewContactPage = new NewContactPage();

		objTestUtil = new TestUtil();
		
		
		
	}
	@Test(priority=1)
	public void loginToAPP() throws IOException, InterruptedException
	{
		Thread.sleep(3000);
		objHomePage = objLoginPage.login(prop.getProperty("Username"), prop.getProperty("Password"));
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", prop.getProperty("Username"));

	}

}
