package popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		Set<String> child = driver.getWindowHandles();
         System.out.println(child.size());
         for(String b:child) {
        	 driver.switchTo().window(b);
        	 System.out.println(driver.getTitle());
        	 driver.close();
         }
	}

}
