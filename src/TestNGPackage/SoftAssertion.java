package TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion { 
	
	//In softassertion, even if all we are making testcase fail, the rest of testcase will execute will not terminate
	
	SoftAssert softAssert=new SoftAssert();
	
	@Test
	public void test1()
	{
		SoftAssert softAssert1=new SoftAssert();
		System.out.println("Open Browser");
		Assert.assertEquals(true, true); //hard assertion 
		
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click on sign in button");
			
		Assert.assertEquals(true, true);
		
		System.out.println("validate new page");
		
		softAssert1.assertEquals(true, false, "home page title is missing");//soft assertion(making testcase fail as true is not equal to false)
		
		System.out.println("go to deal page");
		
		softAssert1.assertEquals(true, false, "not able to create a deal");
		
		softAssert1.assertAll(); //to mark test case failes,if any soft assertion is getting failed
	}
	
	@Test
	public void test2()
	{
		SoftAssert softAssert2=new SoftAssert();
		System.out.println("logout");
		softAssert2.assertEquals(true, false, "logout option is not coming");
		softAssert2.assertAll();
	}

}
