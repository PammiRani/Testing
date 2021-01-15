package TestNGPackage;

import org.testng.annotations.Test;

public class FirstTestCase {
	
	@Test(priority=0)                 
	void openURL()
	{
		System.out.println("This is open url");
	}
	
	@Test(priority=1)
	void login()
	{
		System.out.println("This is login");
	}
	
	@Test(priority=2)
	void logout()
	{
		System.out.println("this is logout");
	}

}
