package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomationPractice {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://testautomationpractice.blogspot.com/");
	
		Thread.sleep(20000);
		
		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("Pammi");
		/*//driver.findElement(By.xpath("//input[@name=\"RESULT_TextField-1\"]")).sendKeys("Pammi");
		driver.findElement(By.xpath("//input[@name=\"RESULT_TextField-1\"]")).sendKeys("Rani");
		driver.findElement(By.xpath("//input[@name=\"RESULT_TextField-3\"]")).sendKeys("9324847");
		driver.findElement(By.xpath("//input[@name=\"RESULT_TextField-4\"]")).sendKeys("India");
		driver.findElement(By.xpath("//input[@name=\"RESULT_TextField-5\"]")).sendKeys("Noida");
		driver.findElement(By.xpath("//input[@name=\"RESULT_TextField-6\"]")).sendKeys("pammi@gamil.com");
		
		List<WebElement> radio1=driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		//int size=radio1.size();
		
		boolean bvalue=false;
		
		bvalue=radio1.get(0).isSelected();
		System.out.println(bvalue);
		
		if(bvalue==true)
		{
			radio1.get(0).click();
		}
		else
		{
			radio1.get(1).click();
		}*/
	
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
		
		Thread.sleep(5000);
		
		Alert alert1=driver.switchTo().alert();
		String alertText=alert1.getText();
		System.out.println(alertText);
		
		//alert1.accept();
		alert1.dismiss();
		
		
		//================2nd URL====================
				
		/*driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[10]/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button")).click();
		
		Thread.sleep(5000);
		Alert alert1=driver.switchTo().alert();
		String alertvalue=alert1.getText();
		System.out.println(alertvalue);
		
		alert1.accept();*/	
		
		
	}

}
