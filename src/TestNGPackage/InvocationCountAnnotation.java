package TestNGPackage;

import org.testng.annotations.Test;

public class InvocationCountAnnotation {
	
	@Test(priority=1,groups="Title",invocationCount=5)
	public void setup()
	{
		System.out.println("setup test");
	}
	
	@Test(priority=2,groups="logo")
	public void login()
	{
		System.out.println("login test");
	}
	
	@Test(priority=3,groups="Title")
	public void search()
	{
		System.out.println("search test");
	}
	
	@Test(priority=4,groups="logo")
	public void advsearch()
	{
		System.out.println("advserach test");
	}
	
	@Test(priority=5,groups="logo")
	public void logout()
	{
		System.out.println("logout test");
	}

}
