package dropDowns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/QSP/Desktop/dd.html");
		WebElement ele = driver.findElement(By.id("Mayas"));
		Select s = new Select(ele);
		s.selectByIndex(4);
		List<WebElement> option = s.getOptions();
		System.out.println(option.size());
		ArrayList a = new ArrayList<>();
		for (WebElement b : option) {
			String text = b.getText();
			System.out.println(text);
			a.add(text);
		}
		System.out.println("Before sorting");
		Collections.sort(a);
		System.out.println("After sorting");
		for (Object c : a) {
			System.out.println(c);
		}

		if (a.contains("dosa")) {
			System.out.println("option is present");
		} else {
			System.out.println("option is not present");
		}
		driver.close();
	}

}
