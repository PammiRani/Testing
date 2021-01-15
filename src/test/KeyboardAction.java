package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Actions action=new Actions(driver);
		
		Thread.sleep(3000);
		action.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
		action.sendKeys(Keys.ESCAPE).build().perform();
		
	    Thread.sleep(3000);
		driver.quit();
	}
}
	
	
