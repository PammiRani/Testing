package pageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	
	@Test
	void login()
	{
		LoginPage ob=new LoginPage(driver);
		ob.setUsername("mercury");
		ob.setPassword("mercury");
		ob.clickSubmit();
	}

}
