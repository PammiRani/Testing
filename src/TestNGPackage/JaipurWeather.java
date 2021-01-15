package TestNGPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class JaipurWeather {
	
	
	public static WebDriver driver;
	public static String browser="chrome";
	public static String url="https://www.accuweather.com/";
	
	
	
	    @BeforeTest
	    public void setup() {
	    if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/FreeCRMTest/Drivers/chromedriver");	
		     driver=new ChromeDriver();
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/home/cavisson/eclipse-workspace/FreeCRMTest/Drivers/geckodriver");
			 driver=new FirefoxDriver();
		}
		
	    driver.manage().window().maximize();
		driver.get(url);
	    }
		
		@Test
		public void verifyTesttWeather() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class=\"search-input\"]")).sendKeys("Jaipur");
	
		Thread.sleep(3000);
		List<WebElement> elements=driver.findElements(By.xpath("//div[@class=\"search-results\"]//div/descendant::div[@class=\"search-bar-result search-result\"]"));
		
		int size=elements.size();
		
		for(int i=0;i<size;i++) {
			System.out.println(elements.get(i).getText());
			if(elements.get(i).getText().contains("Jaipur, Rajasthan, IN")) {
				elements.get(i).click();
				break;
			}
		}
		
		//WebElement ele=driver.findElement(By.xpath("//div[@class=\"search-results\"]//div/descendant::div[text()=\"Jaipur, Rajasthan, IN\"]"));
		
		/*Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		act.moveToElement(ele).click().build().perform();*/
		
		Thread.sleep(4000);
		try {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Jaipur, Rajasthan, India Three Day Weather Forecast | AccuWeather");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Thread.sleep(2000);
		String value=driver.findElement(By.xpath("(//div[@class=\"temp-container\"])[1]")).getText();
		System.out.println(value);
		}
		
		@AfterTest
		public void teardown() {
			driver.quit();
	   }
	}
	



	


