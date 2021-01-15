package TestNGPackage;

import org.testng.annotations.Test;

public class expectedExceptionMethod {
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test()
	{
		String x="100A";
		Integer.parseInt(x);
	}

}
