package DataDrivenEX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dataDriven.XLUtils;

public class ReadexcelFile {
	
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		
        XLUtils ob=new XLUtils();
		
		String xlfile="/home/cavisson/Documents/docs/abc.xlsx";
		ob.setExcelFile(xlfile, "Sheet1");
	    int rowcount=ob.getRowCount(xlfile, "Sheet1");
	    int colcount=ob.getCellCount(xlfile, "Sheet1", 2);
	    
	    System.out.println(rowcount);
	    System.out.println(colcount);
	    
	    ob.setCellData(xlfile, "Sheet1", 0, 6 , "Status");
	    
	    Thread.sleep(2000);
	    //ob.addsheet(xlfile, "home");
	    
	    System.out.println("sheet added successfully");
	    for(int rownum=1;rownum<=rowcount;rownum++)
	    {
	   
	      	String firstname=ob.getCellData(xlfile, "Sheet1", rownum, 0);
	      	System.out.println(firstname);
	      	
	      	String email=ob.getCellData(xlfile, "Sheet1", rownum, 1);
	      	System.out.println(email);
	      	
	      	String phone=ob.getCellData(xlfile, "Sheet1", rownum, 2);
	      	System.out.println(phone);
	        
	      	String gender=ob.getCellData(xlfile, "Sheet1", rownum, 3);
	        System.out.println(gender);
	      	
	        String hobbies=ob.getCellData(xlfile, "Sheet1", rownum, 4);
	      	System.out.println(hobbies);
	      	
	      	String skills=ob.getCellData(xlfile, "Sheet1", rownum, 5);
	      	System.out.println(skills);
	      	
	   Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@placeholder=\"First Name\"]")).clear();
            driver.findElement(By.xpath("//*[@placeholder=\"First Name\"]")).sendKeys(firstname);
            
            driver.findElement(By.xpath("//*[@type=\"email\"]")).clear();
            driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys(email);
            
            driver.findElement(By.xpath("//*[@type=\"tel\"]")).clear();
            driver.findElement(By.xpath("//*[@type=\"tel\"]")).sendKeys(phone);
            
            
            WebElement malegender=driver.findElement(By.xpath("//*[@value=\"Male\"]"));
            WebElement femalegender=driver.findElement(By.xpath("//*[@value=\"FeMale\"]"));
            
            if(gender.equals("Male"))
            {
            	malegender.click();
            }
            
            else if(gender.equals("Female"))
            {
            	femalegender.click();
            }
            	
            
            WebElement cricket=driver.findElement(By.xpath("//*[@value=\"Cricket\"]"));
		    WebElement movies=driver.findElement(By.xpath("//*[@value=\"Movies\"]"));
            WebElement hockey=driver.findElement(By.xpath("//*[@value=\"Hockey\"]"));
            
            
            if(hobbies.equals("Cricket"))
            {
            
            	cricket.click();
            }
            else if (hobbies.equals("Movies"))
            {
            	
            	movies.click();
            }
            else if(hobbies.equals("Hockey"))
            {
            	
            	hockey.click();
            }
            
            Select select=new Select(driver.findElement(By.xpath("//select[@id=\"Skills\"]")));
            select.selectByVisibleText(skills);
            
            ob.setCellData(xlfile, "Sheet1", rownum, 6 , "Pass");
           
	    }
	    
	    Thread.sleep(3000);
        driver.quit();
	    
	    
	}

}
