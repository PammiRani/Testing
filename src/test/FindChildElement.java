package test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindChildElement {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/FreeCRMTest/Drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		//driver.get("https://news.google.com/topstories?hl=en-IN&gl=IN&ceid=IN:en");
		
		
		//WebElement parent=driver.findElement(By.xpath("//h3[@class=\"ipQwMb ekueJc RD0gLb\"]"));
		
	/*	WebElement parent=driver.findElement(By.xpath("//ul[@class=\"toc chapters\"]"));
		List<WebElement> child=parent.findElements(By.xpath("./child::*"));
		
		for(WebElement s:child) {
			System.out.println(s.getText());
		}*/
		
		
		String colur=driver.findElement(By.xpath("//img[@alt=\"About US\"]")).getCssValue("color");
		String bkgcolor=driver.findElement(By.xpath("//img[@alt=\"About US\"]")).getCssValue("backgroud-color");
		
		System.out.println(colur);
		System.out.println(bkgcolor);
		
	}
	
	
	

}
