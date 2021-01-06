package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	public WebDriver driver;
	@BeforeMethod
	public void openapp() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	}

	@Parameters({"browsername"})
	@Test
	public void login(String browser) {
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("545676887");
		String t = driver.getTitle();
		Reporter.log(t,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		
	}
	@AfterMethod
	public void closeapp() {
		driver.close();
	}
	

}
