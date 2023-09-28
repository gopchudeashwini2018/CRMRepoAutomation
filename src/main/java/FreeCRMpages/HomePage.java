package FreeCRMpages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.qa.basepackage.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//a[text()='Contacts']")
	public WebElement contacts;

	@FindBy(xpath="//ul[@style='width: 110px; margin-top: 1px; opacity: 1; visibility: visible; filter: none;']/li")
	public List<WebElement> contactmenu;
	
	@FindBy(xpath="//a[text()='Deals']")
	public WebElement deal;
	
	
	
//    @FindBy(xpath="//ul[@style='width: 110px; margin-top: 1px; opacity: 0; visibility: hidden; filter: none;']/li")
//	public List<WebElement> dealOptions;
	
	public HomePage() throws IOException {
	PageFactory.initElements(driver, this);
	}
	
	public By  textValue(String text)
	{
		By link=By.xpath("//a[text()='"+text+"']");
		
		return link;
		
	}
	
   public void clickOnTab(String locator)
	{
	   
	  
		driver.findElement(textValue(locator)).click();
		
		
	
	}
   
   public void receiveText(String element)
   {
	   driver.findElement(textValue(element)).getText();
   }
   
           
	public boolean verifyTabs(String locator)
	{
		return driver.findElement(textValue(locator)).isDisplayed();
		
		
	}
	
	public void moveToElementUI(WebElement element) {
		
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	 
	
	public void verifyMenu(List<WebElement> menu, String value) throws IOException
	{
		
		
		for(WebElement singlemenu:menu)
		{
			if(singlemenu.getText().equals(value))
			{
				System.out.println(singlemenu.getText());
				singlemenu.click();
				break;
			}
		}
		
		
	}
	
	
	

}
