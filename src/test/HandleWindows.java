package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		String handlevalue=driver.getWindowHandle();
		System.out.println(handlevalue);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@target=\"_blank\"])[1]")).click();
		
		Set<String> handlevalues=driver.getWindowHandles();
		
		for(String h:handlevalues)
		{
			System.out.println(h);
		    String title=driver.switchTo().window(h).getTitle();
		    
		    System.out.println(title);
		    
		    Thread.sleep(5000);
		   // if(title.equalsIgnoreCase("Frames & windows"))
		    if(title.equalsIgnoreCase("Sakinalium | Home"))	
		    {
		    	driver.close();
		    }
		}
		
		
	}

}
