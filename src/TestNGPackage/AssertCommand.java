package TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;



public class AssertCommand {
	
	@Test(priority=0)
	void openurl()
	{
		System.out.println("openurl is passed");
		Assert.assertTrue(false);
	}
	
	@Test(priority=1)
	void login()
	{
		System.out.println("login is successful");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2)
	void search()
	{
		System.out.println("search test");
		Assert.assertTrue(true);
	}
	
	@Test(priority=3)
	void advsearch()
	{
		System.out.println("advsearch test");
		Assert.assertTrue(true);
	}
	
	@Test(priority=4)
	void logout()
	{
		System.out.println("logout test");
		Assert.assertTrue(true);
	}

}
