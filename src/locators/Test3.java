package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("#username")).sendKeys("admin");
	driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
	}

}
