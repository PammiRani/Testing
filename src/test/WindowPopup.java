package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://html.com/input-type-file/");
		//type="file" should be present for Browser/ArrachFile/UploadFile buttons
		driver.findElement(By.xpath("//input[@id=\"fileupload\"]")).sendKeys("/home/cavisson/Documents/testout.txt");
		
	}
	
	
	
	

}
