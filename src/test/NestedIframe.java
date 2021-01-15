package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		
		Thread.sleep(3000);
		WebElement outerframe=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(outerframe);
		
	    Thread.sleep(3000);
	    WebElement innerframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
	    driver.switchTo().frame(innerframe);
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Testing");
	    
	}

}
