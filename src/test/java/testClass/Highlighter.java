package testClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Highlighter {

	WebDriver driver;

	@Test

	public void login() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

		findElement(By.xpath("//button")).click();

	}

	public WebElement findElement(By by) {

		WebElement elem = driver.findElement(by);

		if (driver instanceof JavascriptExecutor) {

			((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid yellow'", elem);

		}

		return elem;

	}

}
