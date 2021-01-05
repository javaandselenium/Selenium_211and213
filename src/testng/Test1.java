package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test(priority = 1,invocationCount = 4)
	public void calls() {
		Reporter.log("calling",true);
	}
	
	@Test(enabled = false)
	public void block() {
		Reporter.log("block",true);
	}
	
	@Test(priority = 1)
	public void chats() {
		Reporter.log("chats",true);
	}

}
