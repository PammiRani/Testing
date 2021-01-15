package TestNGPack_BeforeAndAfterTest;

import org.testng.annotations.*;

public class TestCase2 {

	@Test(priority=1)
	void m3()
	{
		System.out.println("m3 is executed");
	}
	
	@Test(priority=2)
	void m4()
	{
		System.out.println("m4 is executed");
	}
	
	@AfterTest
	void mn()
	{
		System.out.println("mn is exceuted");
	}
	
	
}
