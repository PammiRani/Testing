package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableAction {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com/");
		
		WebElement ele=driver.findElement(By.xpath("//*[@class=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se\"]"));
		
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		
		action.moveToElement(ele).dragAndDropBy(ele,350,350).build().perform();
		
	//===========================================================================//
		
		/*driver.get("https://jqueryui.com/resizable/");
		
		driver.switchTo().frame(0);
		
		WebElement ele=driver.findElement(By.xpath("//*[@class=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se\"]"));
		
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		
		action.moveToElement(ele).dragAndDropBy(ele,200,150).build().perform();*/
	}

}
