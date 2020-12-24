package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.massmutual.com/search?query=");
		driver.findElement(By.xpath("//input[@placeholder='Search Forms']")).sendKeys("fghgsfhggshg");
		
	}

}
