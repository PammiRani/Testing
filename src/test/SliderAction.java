package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderAction {
	
	public static void main(String args[]) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		
	   WebDriver driver=new ChromeDriver();
		
	   driver.manage().window().maximize();
	   
	   driver.get("https://jqueryui.com/slider/");
	   
	   driver.switchTo().frame(0);
	   
	   WebElement slider=driver.findElement(By.xpath("//*[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));
		
	   Thread.sleep(3000);
	   Actions action=new Actions(driver);
	   
	   action.moveToElement(slider).dragAndDropBy(slider,200,0).build().perform();
		
	}

	 
}
