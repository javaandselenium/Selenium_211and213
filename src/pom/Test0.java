package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//WebElement ele = driver.findElement(By.id("username"));
         Test1 t=new Test1(driver);
		driver.navigate().refresh();
		t.username("admin");
         //ele.sendKeys("admin");
         Thread.sleep(5000);
         driver.close();
	}

}
