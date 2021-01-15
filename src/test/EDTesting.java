package test;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EDTesting {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		         
		        ///////// login window /////////////
		driver.get("https://66.220.31.141/ProductUI/#/login");
	
		
		driver.findElement(By.name("name")).sendKeys("guest");
		driver.findElement(By.name("password")).sendKeys("guest");
		driver.findElement(By.id("login-button")).click();
		
		
        Thread.sleep(50000);
        
                       ////// View Menu //////
		//driver.findElement(By.xpath("//*[text()=\" View\"]")).click();
        driver.findElement(By.xpath("//*[text()=\" View\"]/..")).click();
        
        Thread.sleep(2000);
        
                      ///////////opening ED ////////////
		driver.findElement(By.linkText("Application End-to-End View")).click();
	
		Thread.sleep(20000);
        driver.findElement(By.xpath("//*[@title=\"Minimize\"]")).click();
        
        Thread.sleep(2000);
        
                    ////////Opening Transaction Scorecard//////////
        driver.findElement(By.xpath("//label[@title=\"View Business Transaction Trend\"]")).click();
       
        //hread.sleep(60000);
        
                  ///////sorting by Response time///////////
        //driver.findElement(By.xpath("//*[@tabindex=1][2]")).click();
        
        Thread.sleep(60000);
                 ///Open Method timing window////        
        driver.findElement(By.xpath("(//i[@title=\"View Method Timing Report\"])[1]")).click();
	
	    Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//i[@title=\"View DB Request Report\"])[1]")).click();
	
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//i[@title=\"View Flowpath Analyzer\"])[1]")).click();
        
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//i[@title=\"View BT IP Summary\"])[1]")).click();
        
        Thread.sleep(4000);
        driver.navigate().back();
        //Thread.sleep(5000);
        //driver.findElement(By.xpath("(//i[@title=\"View Tier Merge View\"])[1]")).click();
        
        Thread.sleep(10000);
        //driver.navigate().back();
        driver.findElement(By.xpath("(//span[@title=\"View BT Stats\"])[1]")).click();
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@title=\"View Flowpath\" and @id=\"total\"]")).click();
        
        String value=driver.findElement(By.xpath("//div[@class=\"paginatorCount ng-star-inserted\"]")).getText();
        
       
        if(value.equals(0))
        {
        	System.out.println("No record found in FP Report");
        }
        
        else
        {
            System.out.println("No of record is:" );
            		
        }
        
	}
	
}

 