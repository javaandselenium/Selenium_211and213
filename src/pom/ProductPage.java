package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	@FindBy(xpath="(//a[@title='Printed Summer Dress'])[2]")
private WebElement dress;
	
	ProductPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void product() {
		dress.click();
	}
	



}
