package TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	//In hardassertion, means if any particular assertion is getting fail immediately all line after that will not execute, all will terminate.
	//the next corresponding line won't be executed all testcase will be terminated.
	@Test
	public void test1()
	{
		System.out.println("Open Browser");
		Assert.assertEquals(true, true); //hard assertion 
		
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click on sign in button");
			
		Assert.assertEquals(true, false); //here we are making testline fail after that and testcase will not execute after that.
		
		System.out.println("validate new page");
	}

}
