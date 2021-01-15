package parametrization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class CrossBrowserTesting {
	
	
	WebDriver driver=null;
	
	@Parameters("browser")
	@Test(priority=1)
	public void launchbrowser(String br) 
	{
	if(br.equals("chrome"))
	{
        System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();      
	}
	
	else if(br.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "/home/cavisson/eclipse-workspace/geckodriver");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	 
	
	driver.get("https://www.facebook.com/");
	
	}
	
	@Test(priority=2)
	public void verifytitle()
	{
		String ele=driver.getTitle();
		System.out.println(ele);
		
		if(ele.equalsIgnoreCase("k"))
		{
			System.out.println("title is verified");
		}
		
		else
		{
			System.out.println("title is not verified");
		}
	}
	
	@Test(priority=3)
	public void logout()
	{
		driver.close();
	}

}
