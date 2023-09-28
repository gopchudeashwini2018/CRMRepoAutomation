package FreeCRMpages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.qa.basepackage.BaseClass;
import utility.Qa.Com.TestUtil;

public class DealPage extends BaseClass {

	
	// WebElement means driver.findElement and inside method parynthesis like m1(String name) we need 
	//to pass variable whenever we have to call the method  which contain 
	// parameter in that method we have to pass value m1("ABC") in that parameter
	
	
	
	NewContactPage objNewContactPage = new NewContactPage();
	TestUtil objTestUtil=new TestUtil();

	@FindBy(xpath = "//a[text()='Deals']")
	public WebElement deal;
	
	@FindBy(xpath="//ul[@style='width: 110px; margin-top: 1px; opacity: 0; visibility: hidden; filter: none;']/li")
	public List<WebElement> dealOptions;

	@FindBy(xpath = "//input[@id='title']")
	public WebElement Dealtitle;

	@FindBy(xpath = "//input[@name='client_lookup']")
	public WebElement Company;

	@FindBy(xpath = "//input[@name='client_lookup']")
	public WebElement Primary_contact;

	@FindBy(xpath = "//input[@name='amount']")
	public WebElement Amount;

	@FindBy(xpath = "//input[@id='probability']")
	public WebElement Probability;

	@FindBy(xpath = "//input[@id='commission']")
	public WebElement Commission;

	@FindBy(xpath = "//input[@name='identifier']")
	public WebElement Identifier;

	@FindBy(xpath = "//input[@name='quantity']")
	public WebElement Quantity;

	@FindBy(xpath = "(//select[@name='type'])[1]")
	public WebElement DealType;

	@FindBy(xpath = "//select[@name='source']")
	public WebElement Dealsource;

	@FindBy(xpath = "(//input[@name='closed'])[1]")
	public WebElement StatusRadioOpen;

	@FindBy(xpath = "(//input[@name='closed'])[2]")
	public WebElement StatusRadioclose;

	public DealPage() throws IOException {

		PageFactory.initElements(driver, this);

	}

	public void isElementSelect(WebElement element)
	
	{
		//return element.isSelected();
		
		if(!element.isSelected())
		{
			element.click();
		}
		else
		{
			System.out.println("Element is already selected");
		}	
		
	}
	
	
	public void createDeal(String title, String company, String primary_contact, String amount, String probability,
			String commission, String identifier, String quantity, String dealvalue, String dealsource) {

		Dealtitle.sendKeys(title);
		Company.sendKeys(company);
		Primary_contact.sendKeys(primary_contact);
		Amount.sendKeys(amount);
		Probability.sendKeys(probability);
		Commission.sendKeys(commission);
		Identifier.sendKeys(identifier);
		objTestUtil.clearText(Quantity);
		Quantity.sendKeys(quantity);
		objNewContactPage.selectOptionFromDropdown(DealType, dealvalue);
		objNewContactPage.selectOptionFromDropdown(Dealsource, dealsource);
		isElementSelect(StatusRadioOpen);
		
	
	}
	

}
