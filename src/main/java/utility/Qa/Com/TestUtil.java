package utility.Qa.Com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Com.qa.basepackage.BaseClass;

public class TestUtil extends BaseClass {

	static Workbook book;
	static Sheet sheet;

	public static int PAGE_LOAD_TIMEOUT = 60;

	public static int IMPLICITLY_WAIT = 60;

	public TestUtil() throws IOException {

		
	}

	public static void frameHandler(String frame) {
		driver.switchTo().frame(frame);
	}

	public void selectOptionFromDropdown(WebElement dropdownelement, String value) {
		Select select = new Select(dropdownelement);
		select.selectByValue(value);

	}

	public void clearText(WebElement element) {
		element.clear();
	}
	
	public boolean isElementDisplay(WebElement element)
	{
		return element.isDisplayed();
		
	}
	
	public void clickOnElement(WebElement element)
	{
		element.click();
	}
	
	

	public void moveToElementUI(WebElement element) {

		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	public static Object[][] getTestData(String sheetName) {

		FileInputStream file = null;

		try {

			String TestDataPath = "C:\\Users\\agopchude\\eclipse-workspace\\FreeCRM\\src\\main\\java\\cRM\\QA\\TestData\\CRMTestNewDATA.xlsx";

			file = new FileInputStream(TestDataPath);

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}

		try {

			book = WorkbookFactory.create(file);

		} catch (Exception e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		sheet = book.getSheet(sheetName);

		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for (int i = 0; i < sheet.getLastRowNum(); i++) {

			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {

				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();

			}

		}

		return data;

	}

}
