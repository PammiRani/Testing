package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyColourOfMsg {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		driver.findElement(By.name("Submit")).click();
		
		WebElement ele=driver.findElement(By.id("spanMessage"));
		
		String valuename=ele.getText();
		System.out.println("The message of the error is:" + valuename);
		
		String getcolor=ele.getCssValue("color");
		System.out.println(getcolor);
		
		String bkgcolor=ele.getCssValue("background-color");
		System.out.println("the backgroundcolor is:"+bkgcolor);
		
		String hex=Color.fromString(getcolor).asHex();
		System.out.println("The color of the message in hexa is:" + hex);
		
		if(hex.equals("#dd7700"))
		{
			System.out.println("Error message is in red in color");
		}
		
		else
		{
			System.out.println("Error message is in other color");
		}
		
		String fontsize=ele.getCssValue("font-size");
		System.out.println("Size of the message is:" + fontsize);
		
		String fontweight=ele.getCssValue("font-weight");
		System.out.println("The weight of the message is:" + fontweight);
	}

}
