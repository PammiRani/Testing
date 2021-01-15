package dataDriven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		String path="/home/cavisson/Documents/docs/login1.xlsx";
		
		int rows=XLUtils.getRowCount(path, "Sheet1");
		
		for(int i=1;i<=rows;i++)
		{
			//Thread.sleep(2000);
			String username=XLUtils.getCellData(path, "Sheet1",i,0); //to read the data from excel
			String password=XLUtils.getCellData(path, "Sheet1",i,1);
			
			driver.findElement(By.name("userName")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			
			//Thread.sleep(2000);
			driver.findElement(By.name("login")).click();
			
			Thread.sleep(2000);
			if(driver.getTitle().equals("Find a Flight: Mercury Tours:"))
			{
				System.out.println("test is passed");
				XLUtils.setCellData(path, "Sheet1",i,2,"Passed"); //write the date into excel file
			}
			
			else
			{
				System.out.println("test is failed");
				XLUtils.setCellData(path, "Sheet1",i,2,"Failed");
			}
			
			driver.findElement(By.linkText("Home")).click();
		}
		
		driver.close();
	}

}
