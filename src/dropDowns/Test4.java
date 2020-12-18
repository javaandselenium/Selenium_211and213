package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/QSP/Desktop/dd.html");
		WebElement ele = driver.findElement(By.id("Mayas"));
		Select s=new Select(ele);
		s.selectByIndex(4);
		s.selectByValue("d");
		s.selectByVisibleText("idly");
		System.out.println(s.isMultiple());
		if(s.isMultiple()) {
			//s.deselectAll();
			s.deselectByValue("d");
		}
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
