package FreeCRMpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.beust.ah.A;

import Com.qa.basepackage.BaseClass;
import dev.failsafe.internal.util.Assert;
import utility.Qa.Com.TestUtil;

public class ProductPage extends BaseClass {

	TestUtil objTestUtil = new TestUtil();

	@FindBy(xpath = "//input[@value='New Product']")
	public WebElement clickOnNewProduct;

	@FindBy(xpath = "//input[@id='name']")
	public WebElement ProductName;

	@FindBy(xpath = "//input[@id='cost']")
	public WebElement ProductCost;

	@FindBy(xpath = "(//span[text()='(decimal values only - no commas or currency symbols)'])[1]")
	public WebElement labelCost;

	@FindBy(xpath = "//input[@id='retail_value']")
	public WebElement Product_Retail_value;

	@FindBy(xpath = "(//span[text()='(decimal values only - no commas or currency symbols)'])[2]")
	public WebElement labelRetail_value;

	@FindBy(xpath = "//input[@id='wholesale']")
	public WebElement ProductWholeSale;

	@FindBy(xpath = "(//span[text()='(decimal values only - no commas or currency symbols)'])[3]")
	public WebElement labelWholeSale;

	@FindBy(xpath = "//input[@id='sku']")
	public WebElement ProductSKU;

	@FindBy(xpath = "//input[@id='inventory_amount']")
	public WebElement ProductInventory;

	@FindBy(xpath = "//textarea[@name='description']")
	public WebElement ProductDescription;

	public ProductPage() throws IOException {

		PageFactory.initElements(driver, this);

	}

	public By textValue(String text) {
		By link = By.xpath("//a[text()='" + text + "']");

		return link;

	}
//String productinventory,
	public void createProduct(String productname, String productcost, String product_retail_value,
			String productwholesale, String productsku,  String productdescription) {

		ProductName.sendKeys(productname);
		objTestUtil.clearText(ProductCost);
		ProductCost.sendKeys(productcost);
		objTestUtil.isElementDisplay(labelCost);
		objTestUtil.clearText(Product_Retail_value);
		Product_Retail_value.sendKeys(product_retail_value);
		objTestUtil.clearText(ProductWholeSale);
		ProductWholeSale.sendKeys(productwholesale);
		ProductSKU.sendKeys(productsku);
	//	objTestUtil.clearText(ProductInventory);
		//ProductInventory.sendKeys(productinventory);
		ProductDescription.sendKeys(productdescription);

	}

	public void verifyLabel(WebElement element, String expected) {
		String actual = element.getText();

	}

	public void selectProduct(String product) {
		
		driver.findElement(textValue(product)).click();

	}

}
