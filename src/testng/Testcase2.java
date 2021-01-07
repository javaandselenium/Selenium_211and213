package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
		//Assert.assertEquals(t,"hgggghgyug");
		SoftAssert s=new SoftAssert();
		s.assertEquals(t,"gffggvhgjhghghg");
		Reporter.log(t,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		s.assertAll();
	}
	
	@AfterTest
	public void closeapp() {
		driver.close();
	}

}
