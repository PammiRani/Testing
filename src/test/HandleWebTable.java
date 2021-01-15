package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		
//==========to print the value present in all rows in first column==========//
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		
		String beforexpath="//*[@id=\"customers\"]/tbody/tr[";
		String afterxpath="]/td[1]";
		
		for(int i=2;i<=7;i++)
		{
			String actualxpath=beforexpath + i + afterxpath;
			WebElement element=driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
		}
		
//===========to print the value present in all rows in second column==========
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		
		System.out.println("====value of allrows of second column====");
		
		String beforexpath2="//*[@id=\"customers\"]/tbody/tr[";
		String afterxpath2="]/td[2]";
		
		for(int i=2;i<=7;i++)
		{
			String actualxpath=beforexpath2 + i + afterxpath2;
			WebElement element=driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
		}
		
//===========to print the value present in all rows of third column==========//
		
		//*[@id="customers"]/tbody/tr[2]/td[3]
		
		System.out.println("====value of allrows of third column====");
				
		String beforexpath3="//*[@id=\"customers\"]/tbody/tr[";
		String afterxpath3="]/td[3]";
		
		for(int i=2;i<=7;i++)
		{
			String actualxpath=beforexpath3 + i + afterxpath3;
			WebElement element=driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
		}
	
//=======print the total number of  rows  in webtable and print them=========//
		
		System.out.println("====no of rows in table=====");
		
		String rowsbeforexpath="//*[@id=\"customers\"]/tbody/tr[";
		String rowsafterxpath="]/td[1]";
		
	    int rowssize=driver.findElements(By.xpath("//table[@id=\'customers\']/tbody/tr")).size();
		System.out.println("no of rows" + " " + rowssize);
		
		for(int i=2;i<=rowssize;i++)
		{
			String actualxpath=rowsbeforexpath + i + rowsafterxpath;
			WebElement element=driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
        }
		
//=========print the total number of column in webtable and print them=======//
		
		System.out.println("==total number of column===");
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[2]/td[2]
		
		//*[@id="customers"]/tbody/tr[1]/th[1]
		
		String colbeforexpath="//*[@id=\"customers\"]/tbody/tr[1]/th[";
		String colafterxpath="]";
		
		int columnsize=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[1]/th")).size();
		System.out.println("number of column are" + " " + columnsize);
		
		for(int c=1;c<=columnsize;c++)
		{
			String actualxpath=colbeforexpath + c + colafterxpath;
			WebElement element=driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
			
		}
		
//===============to print number of column and rows=======================//
		
		String beforexpathvalue="//*[@id=\"customers\"]/tbody/tr[";
		String afterxpathvalue="]/td[";
		String value="]";
		
		
		System.out.println("Company"+ "			"+ "Contact"+ "			" +"Country");
		
		for(int r=2;r<=rowssize;r++)
		{
			for(int c=1;c<=columnsize;c++)
			{
				String actualxpathvalue=beforexpathvalue+ r +afterxpathvalue+ c +value;
				String values=driver.findElement(By.xpath(actualxpathvalue)).getText();
				System.out.print(values+ "			");
			}
			
			System.out.println();
		}
		
		
	}

}
