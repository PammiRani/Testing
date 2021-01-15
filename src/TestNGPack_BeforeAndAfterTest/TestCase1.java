package TestNGPack_BeforeAndAfterTest;

import org.testng.annotations.*;

public class TestCase1 {

	@Test(priority=0)
	void m1()
	{
		System.out.println("m1 is executed");
	}
	
	@Test(priority=2)
	void m2()
	{
		System.out.println("m2 is executed");
	}
	
	/*@BeforeClass
	void mp()
	{
		System.out.println("mp is executed");
	}
	
	@AfterClass
	void ms()
	{
		System.out.print("ms is executed");
	}*/
	
	@BeforeTest
	void mm()
	{
		System.out.println("mm is executed");
				
	}
}
