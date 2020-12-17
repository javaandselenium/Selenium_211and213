package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement ele = driver.findElement(By.id("username"));
       Dimension s = ele.getSize();
       System.out.println("The height of the element is "+s.getHeight());
       System.out.println("The widht of the element is "+s.getWidth());
       driver.close();
       

	}

}
