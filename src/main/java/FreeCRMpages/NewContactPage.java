package FreeCRMpages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.qa.basepackage.BaseClass;

public class NewContactPage extends BaseClass {

	@FindBy(xpath = "Contactslink")
	WebElement contactlabel;
	@FindBy(id = "first_name")
	WebElement UserFirstName;
	@FindBy(id = "middle_initial")
	WebElement middleName;
	@FindBy(id = "surname")
	WebElement surname;
	@FindBy(name = "client_lookup")
	WebElement Clientlookup;
	@FindBy(name = "nickname")
	WebElement nickname;
	@FindBy(name = "company_position")
	WebElement companyposition;
	@FindBy(name = "department")
	WebElement department;
	@FindBy(name = "contact_lookup_sup")
	WebElement superviser;
	@FindBy(name = "contact_lookup_ass")
	WebElement assistant;
	@FindBy(name = "phone")
	WebElement phone;
	@FindBy(name = "mobile")
	WebElement mobile;
	@FindBy(name = "home_phone")
	WebElement home_phone;
	@FindBy(name = "fax")
	WebElement fax;
	@FindBy(name = "email")
	WebElement email;
	@FindBy(name = "im_id")
	WebElement im_id;
	@FindBy(name = "skype_id")
	WebElement skype_id;
	@FindBy(name = "identifier")
	WebElement identifier;
	@FindBy(xpath = "//select[@name='title']")
	WebElement selectDropDrown;
	@FindBy(xpath = "//select[@name='suffix']")
	WebElement suffix;
	@FindBy(name = "contact_lookup_ref")
	WebElement referBy;
	@FindBy(xpath = "//select[@name='category']")
	WebElement category;
	@FindBy(xpath = "//select[@name='status']")
	WebElement status;
	@FindBy(xpath = "//select[@name='im_netowrk']")
	WebElement netowrk;
	@FindBy(xpath = "//select[@name='source']")
	WebElement source;
	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	WebElement saveButton;

	public NewContactPage() throws IOException {
		super();

		PageFactory.initElements(driver, this);

		// pageFactory will invoke in test class when we create/initialize object of
		// this( currently contact page) into test class
	}

	public void selectOptionFromDropdown(WebElement dropdownelement, String value) {
		Select select = new Select(dropdownelement);
		select.selectByValue(value);

	}

	public void personalInfo(String title, String firstName, String MiddleName, String lastName, String suffx,
			String nicknm) {

		selectOptionFromDropdown(selectDropDrown, title);
		UserFirstName.sendKeys(firstName);
		middleName.sendKeys(MiddleName);
		surname.sendKeys(lastName);
		selectOptionFromDropdown(suffix, suffx);
		nickname.sendKeys(nicknm);

	}

	public void companyInfo(String company, String position, String deprtmnt, String supervsr, String assistnt,
			String refby) {
		Clientlookup.sendKeys(company);
		companyposition.sendKeys(position);
		department.sendKeys(deprtmnt);
		superviser.sendKeys(supervsr);
		assistant.sendKeys(assistnt);
		referBy.sendKeys(refby);

	}

	public void contactInfo(String catgory, String stats, String phn, String mob, String hmphone, String fx,
			String eml) {
		selectOptionFromDropdown(category, catgory);
		selectOptionFromDropdown(status, stats);
		phone.sendKeys(phn);
		mobile.sendKeys(mob);
		home_phone.sendKeys(hmphone);
		fax.sendKeys(fx);
		email.sendKeys(eml);
	}

	public void socialPlatformInfo(String messid, String messnetwork, String skpid, String src, String idfier) {
		im_id.sendKeys(messid);
		selectOptionFromDropdown(netowrk, messnetwork);
		skype_id.sendKeys(skpid);
		selectOptionFromDropdown(source, src);
		identifier.sendKeys(idfier);
	}

	public void clickOnSaveButton() {
		saveButton.click();
	}

}
