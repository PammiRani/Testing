package reporting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;



public class LoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginTest()
	{
		driver.get("https://www.facebook.com/");
		Assert.assertEquals(driver.getTitle(), "Facebook – in or sign up");
	}
	
	@AfterClass
	public void logout()
	{
		driver.quit();
	}
	
	@AfterMethod
	public void captureScreen(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
			
			File source=ts.getScreenshotAs(OutputType.FILE);
			File target=new File(System.getProperty("user.dir") + "/screenshot/"+ result.getName()+ ".png");
			FileUtils.copyFile(source, target);
			System.out.println("screenshot captured");
			
		}
	}

}
