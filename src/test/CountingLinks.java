package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingLinks {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.get("http://newtours.demoaut.com/");
		driver.get("http://testautomationpractice.blogspot.com/");
		
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		
		int size= Links.size();
		System.out.println(size);
		
		for(WebElement e : Links)
		{
		     System.out.println(e.getText());
		}
	}

}
