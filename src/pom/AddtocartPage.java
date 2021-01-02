package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement plus;

	@FindBy(name="Orange")
	private WebElement color;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addtocart;
	
	AddtocartPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void addbtn() {
		
		plus.click();
	}
	
	public void colorbtn() {
		color.click();
	}
	
	public void addtocart() {
		addtocart.click();
	}
}

