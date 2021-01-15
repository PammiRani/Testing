package test;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HighlightMethod {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement ele=driver.findElement(By.name("email"));
		
		Actions act=new Actions(driver);
		
		Action seriesofaction=act.moveToElement(ele).click().keyDown(ele, Keys.SHIFT).sendKeys(ele, "Hello").keyUp(ele, Keys.SHIFT).doubleClick(ele).build();
		
		seriesofaction.perform();
	}
}
