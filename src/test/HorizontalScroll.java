package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HorizontalScroll {
	
	WebDriver driver;
	
	@Test
	public void scrollhorizontal() {
		
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//WebElement element=driver.findElement(By.linkText("VBScript"));
		
		//js.executeScript("arguments[0].scrollIntoView();",element);
		
		//=====scroll last to horizontal===================//
		
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
	}
	

}
