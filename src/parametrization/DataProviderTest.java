package parametrization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProviderTest {
	
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		driver=new ChromeDriver();
	}
	
	@Test(dataProvider="users")  //dataProvider is parameter of @Test annotation
	void loginTest(String uname,String pwd)
	{
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(driver.getTitle(), "");
	}
	
	@DataProvider(name="users")
	 String [][] loginData()    //@DataProvider is annotation
	{
		String data[][]= {{"mercury","mercury"},{"pammi","pammi"}};
		return data;
	}

	 @AfterClass
	 void logout()
	 {
		 driver.close();
	 }
}
