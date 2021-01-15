package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement button=driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		
		Actions but=new Actions(driver);
		
		but.contextClick(button).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class=\"context-menu-item context-menu-icon context-menu-icon-copy\"]")).click();
		
		Alert alerts=driver.switchTo().alert();
		
		String value=alerts.getText();
		System.out.println("The text is:" + value);
		
		Thread.sleep(3000);
		alerts.accept();
		
		
		
		
	}

}
