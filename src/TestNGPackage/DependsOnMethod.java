package TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test(priority=0)
	void openurl()
	{
		System.out.println("openurl is passed");
		Assert.assertTrue(true);
	}
	
	@Test(priority=1,dependsOnMethods= {"openurl"})
	void login()
	{
		System.out.println("login is successful");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2,dependsOnMethods= {"login"})
	void search()
	{
		System.out.println("search test");
		Assert.assertTrue(false);
	}
	
	@Test(priority=3,dependsOnMethods= {"login","search"})
	void advsearch()
	{
		System.out.println("advsearch test");
		Assert.assertTrue(true);
	}
	
	@Test(priority=4,dependsOnMethods= {"search"})
	void logout()
	{
		System.out.println("logout test");
		Assert.assertTrue(true);
	}

}
