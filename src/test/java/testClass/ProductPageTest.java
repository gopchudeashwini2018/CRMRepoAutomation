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
import FreeCRMpages.ProductPage;
import utility.Qa.Com.TestUtil;

public class ProductPageTest extends BaseClass {

	LoginPage objLoginPage;

	HomePage objHomePage;

	NewContactPage objNewContactPage;

	DealPage objDealPage;

	ProductPage objProductPage;

	TestUtil objTestUtil;

	String SheetName = "newProduct";

	String labelCostExp = "(decimal values only - no commas or currency symbols)";

	public ProductPageTest() throws IOException {
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

		objProductPage = new ProductPage();

		objTestUtil = new TestUtil();

		// objHomePage = objLoginPage.login(prop.getProperty("Username"),
		// prop.getProperty("Password"));
		objHomePage = objLoginPage.login("Freecrmlearing", "Crm@123");

	}

	// @Test(priority = 1)
	public void verifyLebelsOnProductPage() {

		objTestUtil.frameHandler("mainpanel");
		objTestUtil.moveToElementUI(objDealPage.deal);
		objHomePage.clickOnTab("Products");
		objTestUtil.clickOnElement(objProductPage.clickOnNewProduct);

		objProductPage.verifyLabel(objProductPage.labelCost, labelCostExp);
		objProductPage.verifyLabel(objProductPage.labelRetail_value, labelCostExp);
		objProductPage.verifyLabel(objProductPage.labelWholeSale, labelCostExp);

	}

	@Test(priority = 2, dataProvider = "productdata")
	public void createNewProduct(String productname, String productcost, String product_retail_value,
			String productwholesale, String productsku, String productdescription) throws InterruptedException {
//String productinventory,
		objTestUtil.frameHandler("mainpanel");
		objTestUtil.moveToElementUI(objDealPage.deal);
		objHomePage.clickOnTab("Products");

		Thread.sleep(3000);
		objTestUtil.clickOnElement(objProductPage.clickOnNewProduct);

		objProductPage.createProduct(productname, productcost, product_retail_value, productwholesale, productsku,
				productdescription); // productinventory
		objNewContactPage.clickOnSaveButton();

		//objTestUtil.frameHandler("mainpanel");
		objTestUtil.moveToElementUI(objDealPage.deal);
		objHomePage.clickOnTab("Products");
		objProductPage.selectProduct(productname);

	}
	
	
	
	public void searchProduct()
	{
		
	}

	@DataProvider()
	public Object[][] productdata() {
		Object[][] testdata = objTestUtil.getTestData(SheetName);

		return testdata;
	}

}
