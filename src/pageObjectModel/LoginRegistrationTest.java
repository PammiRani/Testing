package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginRegistrationTest {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/");
		
	}

	@Test
	void login()
	{
		RegistrationPage ob=new RegistrationPage(driver);
		ob.Registrationclick();
		ob.setfirstname("Pammi");
		ob.setlastname("Rani");
		ob.setphone("293989568");
		ob.setEmail("pammi.rani@gmail.com");
		ob.setAddress("delhi");
		ob.setCity("noida");
		ob.setStat("UP");
		ob.setPostalCode("2345");
		ob.setCountry("TOGO");
	}
	
	
	@AfterClass
	void logout() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
