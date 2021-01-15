package log4j;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;





public class LoginTest {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://freecrm.co.in/");
	}
	
	@Test(priority=1)
	public void freecrmtitletest() {
		
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
		
	}
	
	@Test(priority=2)
	public void freecrmlogo() {
		
		boolean b=driver.findElement(By.xpath("(//a[@title=\"free crm home\"])[1]")).isDisplayed();
		Assert.assertTrue(b);
	}

	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
}
