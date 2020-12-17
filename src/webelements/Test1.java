package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement ele = driver.findElement(By.id("keepLoggedInCheckBox"));
        if(ele.isSelected()) {
        	System.out.println("Pass:Checkbox is selected");
        }
        else
        {
        	System.out.println("Fail:Checkbox is not selected");
        }
        driver.close();
	}

}
