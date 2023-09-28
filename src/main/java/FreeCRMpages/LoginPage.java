package FreeCRMpages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.qa.basepackage.BaseClass;


public class LoginPage extends BaseClass {
	
	//public WebDriver driver;
	// Declaration of UI elements 
	
	
	
	@FindBy(xpath="(//img[@class='img-responsive'])[1]")   // driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]");
	WebElement crmlogo;
	
    @FindBy(name="username")
    WebElement username;
	
    
    @FindBy(name="password")
    WebElement password;
    
    @FindBy(xpath="//input[@value='Login']")
    WebElement loginbutton;
    
    @FindBy(xpath="//a[text()='Home']")
    private WebElement homelink;
    
    @FindBy(xpath="//a[text()='Sign Up']")
    private WebElement signuplink;
    
    
    @FindBy(xpath="//a[text()='Pricing']")
    private WebElement Pricinglink;
    
    @FindBy(xpath="//a[text()='Features']")
    private WebElement Featureslink;
    
    @FindBy(xpath="//a[text()='Customers']")
    private WebElement Customerslink;
    
    @FindBy(xpath="//a[text()='Contact']")
    private WebElement Contactlink;
   
    
    //Initialization
    
    public LoginPage() throws IOException 
    {
    	PageFactory.initElements(driver, this);
    }
    
    public boolean verifylinks (WebElement links)
    {
    	
    	return links.isDisplayed();
    }
    
    public String getTitle()
    {
    	return driver.getTitle();
    	
    }
     
    public WebElement gethomelink( )
    {
    	
         return homelink;
    }
    
   public void sethomelink(WebElement homelink)
   {
	   this.homelink=homelink;
	   
   }
   
   public WebElement getsignuplink()
   {
	   return signuplink;
   }
   
   public void setsignuplink(WebElement signuplink)
   {
	   this.signuplink=signuplink;
   }
   
   public WebElement getPricinglink()
   {
	   return Pricinglink;
   }
   
   
   public void setPricinglink(WebElement Pricinglink )
   {
	   this.Pricinglink=Pricinglink;
   }
   
   public WebElement getFeatureslink()
   {
	   return Featureslink;
	   
   }
   public void setFeatureslink(WebElement Featureslink)
   {
	   this.Featureslink=Featureslink;
   }
   
   public WebElement getCustomerslink()
   {
	   return Customerslink;
   }
   public void setCustomerslink(WebElement Customerslink)
   {
	   this.Customerslink=Customerslink;
   }
   public WebElement getContactlink()
   {
	   return Contactlink;
   }
   public void setContactlink(WebElement Contactlink)
   {
	   this.Contactlink=Contactlink;
   }
   
   public boolean crmlogo()
   {
	   return crmlogo.isDisplayed();
   }
   
  public HomePage login(String un, String pwd) throws IOException
   {
	   username.sendKeys(un);
	   password.sendKeys(pwd);
	   loginbutton.click();
	   
	   return new HomePage();
	   
	 }
   
}
