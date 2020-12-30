package scrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		 JavascriptExecutor j=(JavascriptExecutor)driver;
	       Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("(//img[@class='image-image undefined image-hand'])[3]"));
       Point loc = ele.getLocation();
       System.out.println(loc);
       int x = loc.getX();
       System.out.println(x);
       int y = loc.getY();
       System.out.println(y);
       Thread.sleep(3000);
       j.executeScript("window.scrollBy("+x+","+y+")");
       Thread.sleep(3000);
       ele.click();
       }

}
