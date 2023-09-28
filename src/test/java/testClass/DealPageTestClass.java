package testClass;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.qa.basepackage.BaseClass;
import FreeCRMpages.DealPage;
import FreeCRMpages.HomePage;
import FreeCRMpages.LoginPage;
import FreeCRMpages.NewContactPage;
import utility.Qa.Com.TestUtil;

public class DealPageTestClass extends BaseClass {

	LoginPage objLoginPage;

	HomePage objHomePage;

	NewContactPage objNewContactPage;

	DealPage objDealPage;

	TestUtil objTestUtil;

	String sheetname = "newdeal";

	public DealPageTestClass() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod()
	public void setUP() throws IOException {
		BaseClass.getDriver();

		objLoginPage = new LoginPage();

		objHomePage = new HomePage();

		objNewContactPage = new NewContactPage();

		objDealPage = new DealPage();

		objTestUtil = new TestUtil();  

		//objHomePage = objLoginPage.login(prop.getProperty("Username"), prop.getProperty("Password"));
		objHomePage = objLoginPage.login("Freecrmlearing", "Crm@123");

	}

	@Test(priority = 2, dataProvider = "dealData")
	public void createNewDeal(String title, String company, String primary_contact, String amount, String probability,
			String commission, String identifier, String quantity, String dealvalue, String dealsource) {

		TestUtil.frameHandler("mainpanel");
		objTestUtil.moveToElementUI(objDealPage.deal);
		objHomePage.clickOnTab("New Deal");

		objDealPage.createDeal(title, company, primary_contact, amount, probability, commission, identifier, quantity,
				dealvalue, dealsource);
		
		objNewContactPage.clickOnSaveButton();
	}

	@DataProvider()
	public Object[][] dealData() {
		Object[][] data = objTestUtil.getTestData(sheetname);

		return data;
	}

}
