package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {
	
	public static void main(String args[]) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/droppable/");
		
		Actions action=new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		Point source1=driver.findElement(By.xpath("//*[@id=\"draggable\"]")).getLocation();
		System.out.println(source1);
		
		WebElement target=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Thread.sleep(3000);
		action.dragAndDrop(source, target).build().perform();
		
	}


}

