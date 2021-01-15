package dataDriven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
 		driver.get("https://www.easycalculation.com/simple-interest.php");
		
		String path="/home/cavisson/Documents/docs/calculator.xlsx";
		
		int row=XLUtils.getRowCount(path, "Sheet1");
		
		for(int i=1;i<=row;i++)
		{
			String Principle=XLUtils.getCellData(path, "Sheet1",i,0);
			String IR=XLUtils.getCellData(path, "Sheet1",i,1);
			String TP=XLUtils.getCellData(path, "Sheet1",i,2);
			String SI=XLUtils.getCellData(path, "Sheet1",i,3);
			String FA=XLUtils.getCellData(path, "Sheet1",i,4);
			
			 driver.findElement(By.name("res1")).sendKeys(Principle);
			 driver.findElement(By.name("res2")).sendKeys(IR);
			 driver.findElement(By.name("res3")).sendKeys(TP);
			// driver.findElement(By.name("res4")).sendKeys(SI);
			 
		//	String SP1=driver.findElement(By.name("res4")).getAttribute('value');
			String SP1=driver.findElement(By.name("res4")).getText();
			//String SP1=driver.findElement(By.name("res4")).getAttribute("value");
			System.out.println(SP1);
			 
			// int SP2=Integer.valueOf(SP1);
			int SP2=Integer.parseInt(SP1);
			 //System.out.println(SP2);
	
			 
			// int sp2=Integer.parseInt(SP1);
			 
			 int P2=Integer.parseInt(Principle);
			 int FA2=Integer.parseInt(FA);
			 
			 int sum=P2 + SP2;
			 
			 if(sum==FA2)
			 {
				 System.out.println("test is passed");
				 XLUtils.setCellData(path, "Sheet1",i,5,"Passed");
			 }
			 
			 else
			 {
				 System.out.println("test is failed");
				 XLUtils.setCellData(path, "Sheet1",i,5,"failed");
			 }
			 
			 driver.findElement(By.xpath("//*[@value=\"Reset\"]")).click();
		}
		
		driver.close(); 
	}
}
