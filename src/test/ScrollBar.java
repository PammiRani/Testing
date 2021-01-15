package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollBar {
	
	WebDriver driver;
	
	@Test
	public void ByPixel() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/guru99home/");

		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//========scroll by Pixel========================//
		
		//executeScript("window.scrollBy(x-pixels,y-pixels)");
		js.executeScript("window.scrollBy(0,2000)");
		
		//==============scroll by visibility of element==========//
		
		WebElement element=driver.findElement(By.linkText("Linux"));
		
		js.executeScript("arguments[0].scrollIntoView();",element);
		
		//arguments[0]" means first index of page starting at 0.
		
		//==========scroll down to bottom of page================//
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
		Thread.sleep(4000);
		driver.quit();
		
		
		
	}
	

}
