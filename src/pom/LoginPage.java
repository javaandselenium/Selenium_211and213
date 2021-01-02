package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="search_query_top")
	private WebElement serachtb;
	
	@FindBy(name="submit_search")
	private WebElement serachbtn;
	
	LoginPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void serachtextbox(String productname) {
		serachtb.sendKeys(productname);
	}
	
	public void serachbutton() {
		serachbtn.click();
	}

}
