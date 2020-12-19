package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		WebElement ele = driver.findElement(By.linkText("Fashion"));
        Actions a=new Actions(driver);
        a.moveToElement(ele).perform();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Watches")).click();
        Thread.sleep(3000);
        driver.close();
	}

}
