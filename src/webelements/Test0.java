package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement ele = driver.findElement(By.id("username"));
        if(ele.isDisplayed())
        {
        	System.out.println("Pass:element is dispalyed");
        	ele.sendKeys("admin");
        }
        else
        {
        	System.out.println("Fail:element is not displayed");
        }
	}

}
