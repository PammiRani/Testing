package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertWindow {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//Thread.sleep(3000);
		
		//==================Alert with ok============================//
		
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]")).click();
		
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		//===========Alert with ok and cancel============================//
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]")).click();
		
		Thread.sleep(3000);
		Alert alert2=driver.switchTo().alert();
		String value=alert.getText();
		System.out.println(value);
		
		Thread.sleep(3000);
		alert2.dismiss();
		
		//=====================Alert with Testbox======================//
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[3]")).click();
		driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
		
		Thread.sleep(3000);
		Alert alertprompt=driver.switchTo().alert();
		alertprompt.sendKeys("Pammi");
		
		Thread.sleep(3000);
		alertprompt.accept();
	}

}
