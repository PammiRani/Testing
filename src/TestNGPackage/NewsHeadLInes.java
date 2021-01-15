package TestNGPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewsHeadLInes {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/FreeCRMTest/Drivers/chromedriver");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://news.google.com/topstories?hl=en-IN&gl=IN&ceid=IN:en");
	}
	
	@Test
	public void verifyHeading() {
		List<WebElement> heading=driver.findElements(By.xpath("//h3[@class=\"ipQwMb ekueJc RD0gLb\"]"));
		
		int size=heading.size();
		System.out.println("total headlines are:"+ size);
		
		System.out.println("Top five headlines are:");
		
		for(int i=0;i<5;i++) {
			System.out.println(heading.get(i).getText());
		}
		
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	

}
