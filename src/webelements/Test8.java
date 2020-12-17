package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement ele = driver.findElement(By.id("username"));
	Point l = ele.getLocation();
	System.out.println("The x co-ordinates "+l.getX());
	System.out.println("The y co-ordinates "+l.getY());
	driver.close();
	

	}

}
