package waitSatements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Login ']"))).click();
		
		//driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		//validation
		if(title.equals("actiTIME -  Enter Time-Track")) {
			System.out.println("Pass:Home page of the application");
		}
		
		else {
			System.out.println("Fail");
		}
		driver.close();

	}

}
