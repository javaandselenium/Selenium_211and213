package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/QSP/Desktop/dd.html");
		WebElement ele = driver.findElement(By.id("Mayas"));
		Select s=new Select(ele);
		s.selectByIndex(4);
		s.selectByValue("d");
		s.selectByVisibleText("idly");
		s.deselectByIndex(4);
		s.deselectByValue("d");
		s.deselectByVisibleText("idly");
		Thread.sleep(3000);
		driver.close();
		
	}

}
