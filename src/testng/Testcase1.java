package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase1 {
	public WebDriver driver;
	@BeforeMethod
	public void openapp() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void login() {
		driver.findElement(By.id("email")).sendKeys("jhgjgggh");
		driver.findElement(By.id("pass")).sendKeys("gfdjgfgf");
		Reporter.log(driver.getTitle(),true);
		Reporter.log(driver.getCurrentUrl(),true);
	}
	
	@AfterMethod
	public void closeapp() {
		driver.close();
	}

}
