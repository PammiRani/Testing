package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/upload/");
		
		String tname="Capture";
		
		if(driver.getTitle().equals("File Upload Dem"))
		{
			System.out.println("Title is verified");
		}
		
		else
		{
			TakesScreenshot td=(TakesScreenshot)driver;
			File sourcefile=td.getScreenshotAs(OutputType.FILE);
			File destfile=new File("/home/cavisson/eclipse-workspace/Testing" + "/screenshot/"  + tname + ".png");
			FileUtils.copyFile(sourcefile, destfile );
			
			System.out.println("Screenshot captured");
		}
		
		Thread.sleep(3000);
		driver.close();
	}

	
}
