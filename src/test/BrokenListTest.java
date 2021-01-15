package test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenListTest {
	
	public static void main(String args[]) throws MalformedURLException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://makemysushi.com/404?");
		
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		
		System.out.print("size of full links and images are---->" +linklist.size());
		
		
		List<WebElement> activelink=new ArrayList<WebElement>();
		//remove all links and images that does no have any href attribute
		for(int i=0;i<linklist.size();i++)
		{
			System.out.println(linklist.get(i).getAttribute("href"));
			if(linklist.get(i).getAttribute("href")!=null && (!linklist.get(i).getAttribute("href").contains("javascript")) && (! linklist.get(i).getAttribute("href").contains("mailto"))) {
				activelink.add(linklist.get(i));
			}
		}
		
		//get the size of activelink
		System.out.println("size of active link is ----->" +activelink.size());
		
		
		//check the href url with httpconnection api
		
		for(int j=0;j<activelink.size();j++) {
			HttpURLConnection connection=(HttpURLConnection)new URL(activelink.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			String response=connection.getResponseMessage();
			connection.disconnect();
			
			System.out.println(activelink.get(j).getAttribute("href")+ "----->" +response);
		}
		
		driver.quit();
	}
	

}
