package Com.qa.basepackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Qa.Com.TestUtil;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() throws IOException {

//		prop = new Properties();
//
//		String path = "C:\\Users\\agopchude\\eclipse-workspace\\FreeCRM\\src\\main\\java\\config\\com\\FreeCRM.properties";
//		FileInputStream file = new FileInputStream(path);
//		prop.load(file);

	}

	public static void getDriver() {

		//String browserName = prop.getProperty("browser");

//		if (browserName.equalsIgnoreCase("chrome")) {
//			WebDriverManager.chromedriver().setup();
//
//			// System.setProperty("webdriver.chrome.driver"
//			// ,"C:\\Users\\agopchude\\eclipse-workspace\\FreeCRM\\Driver\\chromedriver.exe");
//
//			driver = new ChromeDriver();
//
//		}
//
//		else if (browserName.equalsIgnoreCase("firefox")) {
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//		}
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	    
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICITLY_WAIT));

		//driver.get(prop.getProperty("URL"));
		
		driver.get("https://classic.freecrm.com/index.html");

	}

}
