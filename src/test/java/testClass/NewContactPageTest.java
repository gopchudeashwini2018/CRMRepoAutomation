package testClass;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.qa.basepackage.BaseClass;
import FreeCRMpages.HomePage;
import FreeCRMpages.LoginPage;
import FreeCRMpages.NewContactPage;
import utility.Qa.Com.TestUtil;

public class NewContactPageTest extends BaseClass {

	public LoginPage objLoginPage;

	public HomePage objHomePage;

	public NewContactPage objNewContactPage;

	String sheetname = "Contacts";

	TestUtil objTestUtil;

	public NewContactPageTest() throws IOException {
		super();

	}

	@BeforeMethod()
	public void setUP() throws IOException {
		BaseClass.getDriver();

		objLoginPage = new LoginPage();

		objHomePage = new HomePage();

		objNewContactPage = new NewContactPage();

		objTestUtil = new TestUtil();

		objHomePage = objLoginPage.login(prop.getProperty("Username"), prop.getProperty("Password"));

	}

	@DataProvider
	public Object[][] ContactTestData() {
		Object data[][] = TestUtil.getTestData(sheetname);

		return data;
	}

	@Test(priority = 1, dataProvider = "ContactTestData")
	public void createContactPage(String title, String firstName, String MiddleName, String lastName, String suffx,
			String nicknm, String company, String position, String deprtmnt, String supervsr, String assistnt,
			String refby, String catgory, String stats, String phn, String mob, String hmphone, String fx, String eml,
			String messid, String messnetwork, String skpid, String src, String idfier) throws IOException {
		TestUtil.frameHandler("mainpanel");
		
		objHomePage.moveToElementUI(objHomePage.contacts);
        objHomePage.verifyMenu(objHomePage.contactmenu, "New Contact");

		objNewContactPage.personalInfo(title, firstName, MiddleName, lastName, suffx, nicknm);
		objNewContactPage.companyInfo(company, position, deprtmnt, supervsr, assistnt, refby);
		objNewContactPage.contactInfo(catgory, stats, phn, mob, hmphone, fx, eml);
		objNewContactPage.socialPlatformInfo(messid, messnetwork, skpid, src, idfier);

		objNewContactPage.clickOnSaveButton();
	}

}
