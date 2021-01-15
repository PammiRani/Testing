package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipDemo {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demoqa.com/tooltip-and-double-click/");
		
		Actions act=new Actions(driver);
		
		WebElement element=driver.findElement(By.id("tooltipDemo"));
		act.moveToElement(element).build().perform();
		
		WebElement tooltip=driver.findElement(By.cssSelector(".tooltiptext"));
		
		String 	tooltiptext=tooltip.getText();
		System.out.println("tooltiptext=" +tooltiptext);
		
		if(tooltiptext.equalsIgnoreCase("We ask for your age only for statistical purposes."))
		{
			System.out.println("Pass: tooltip match expected value");
		}
		
		else
		{
			System.out.println("Fail: tooltip not match expected value");
		}
	}

}
