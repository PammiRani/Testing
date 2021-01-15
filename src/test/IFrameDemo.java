package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameDemo {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		WebDriver driver=new ChromeDriver();
	
		
		driver.manage().window().maximize();
		
		//driver.get("http://toolsqa.com/iframe-practice-page/");
		driver.get("https://selenium.dev/selenium/docs/api/java/");
		
		Thread.sleep(4000);
		
		//=================Frame One=================
		//driver.switchTo().frame(0);   ///with index
		driver.switchTo().frame("packageListFrame");   //with name attribute
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a")).click();
		
		driver.switchTo().defaultContent();
		
		
		//==================Frame Two================
		Thread.sleep(4000); 
		//driver.switchTo().frame(1);       //with index
		driver.switchTo().frame("packageFrame");     //with name
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/ul[1]/li[10]/a/span")).click();
		
		driver.switchTo().defaultContent();
		
		//======================Frame Three===============
		
		Thread.sleep(4000);
		//driver.switchTo().frame(2);          //with index
		driver.switchTo().frame("classFrame");      //with name
		Thread.sleep(6000);
		//driver.findElement(By.linkText("Deprecated")).click();
		driver.findElement(By.xpath("/html/body/div[1]/ul/li[5]/a")).click();
		
		
	}

}
