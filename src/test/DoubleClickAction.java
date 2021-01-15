package test;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		/*driver.get("https://demoqa.com/tooltip-and-double-click/");
		
		WebElement button=driver.findElement(By.xpath("//button[@id=\"doubleClickBtn\"]"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(button).build().perform();
		
		Thread.sleep(3000);
		Alert alerts=driver.switchTo().alert();
	
		String value=alerts.getText(); 
		System.out.println("The text present is:" + value);
		
		Thread.sleep(3000);
		alerts.accept();*/
		
		
	//======================================================================//
		
		driver.get("http://testautomationpractice.blogspot.com/");
		
		WebElement ele=driver.findElement(By.xpath("//button[@ondblclick=\"myFunction1()\"]"));
		
		Point point=driver.findElement(By.xpath("//button[@ondblclick=\"myFunction1()\"]")).getLocation();
		//System.out.println(ele1);
		System.out.println("X cordinate : " + point.x + " " + "Y cordinate: " + point.y);
		
		Actions but=new Actions(driver);
		
		but.doubleClick(ele).build().perform();
	}

}
