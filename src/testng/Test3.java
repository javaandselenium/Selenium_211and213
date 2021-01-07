package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test3 {
	@DataProvider
	public Object[][] getdata() {
		Object[][] a = new Object[3][2];
		a[0][0] = "qewereeytwtyhvfhtyus";
		a[0][1] = "ggyyggggfsffgfghs";
		a[1][0] = "786576576576756";
		a[1][1] = "67467657657657";
		a[2][0] = "778ghgdjh#%$%^$%^";
		a[2][1] = "gf57657%&^%&^";
		return a;
		

	}

	@Test(dataProvider = "getdata")
	public void demo(String us, String pwd) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys(us);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(pwd);
Thread.sleep(5000);
		driver.close();
	}

}
