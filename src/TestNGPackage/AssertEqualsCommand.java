package TestNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class AssertEqualsCommand {
	
	
	@Test
	void openurl() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
       Assert.assertEquals(driver.getTitle(), "Registe");
		
       System.out.println("testcase passed");
       
       driver.quit();
		
	}
	

}
