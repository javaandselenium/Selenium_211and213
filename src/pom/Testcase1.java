package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LoginPage l=new LoginPage(driver);
		l.serachtextbox("dress");
		l.serachbutton();
		Thread.sleep(3000);
		ProductPage p=new ProductPage(driver);
		p.product();
		AddtocartPage a=new AddtocartPage(driver);
		a.addbtn();
		a.colorbtn();
		a.addtocart();
		driver.close();
	}

}
