package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchWindow {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		
		/*String handle=driver.getWindowHandle();
		System.out.println(handle);
		
		Thread.sleep(30000);
		driver.findElement(By.xpath("//button[@id=\"button1\"]")).click();
		//driver.findElement(By.cssSelector("button#button1")).click();*/
		
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@id=\"alert\"]")).click();
				
	}

}
