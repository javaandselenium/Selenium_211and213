package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase2 {
	public WebDriver driver;
	
	@BeforeTest
	public void openapp() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void forgotpassword() {
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("545676887");
		String t = driver.getTitle();
		Reporter.log(t,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
	}
	
	@AfterTest
	public void closeapp() {
		driver.close();
	}

}
