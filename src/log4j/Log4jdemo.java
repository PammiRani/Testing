package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class Log4jdemo {
	
	static Logger logger; //Logger class is used for logging messages in testcase(will make as static because need to use in all methods)
	
	@Test(priority=1)
	public void setup()
	{
		logger=Logger.getLogger("Log4jdemo"); //provide testcase name/class name as a parameter
		PropertyConfigurator.configure("log4j.properties"); //define log4jproperties file using predefine PropertyConfigurator class having configure method
		
		logger.info("setup method is started");
		logger.info("setup method in progress");
		
		System.out.println("this is setup method");
	}
	
	@Test(priority=2)
	public void login()
	{
		logger.info("login is started");
		System.out.println("this is login test");
		logger.info("login is progress");
		logger.info("login is completed");
		logger.info("login is passed");
		
	}
	
	@Test(priority=3)
	public void logout()
	{
		System.out.println("this is logout test");
		logger.info("logout is completed");
	}

}
