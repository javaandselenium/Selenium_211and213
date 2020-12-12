package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("book");
		driver.findElement(By.cssSelector("input[value='Go']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='The Body: A Guide for Occupants']")).click();
		driver.findElement(By.id("checkout-button")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
