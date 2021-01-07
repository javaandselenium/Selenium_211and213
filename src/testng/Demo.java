package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void calls() {
		Reporter.log("calls",true);
	}
	
	@Test(groups={"chats","smoke"})
	public void chats() {
		Reporter.log("chats",true);
	}
	
	@Test(groups= {"status","Functional"})
	public void status() {
		Reporter.log("status",true);
	}
	
	@Test
	public void setting() {
		Reporter.log("setting",true);
	}




}
