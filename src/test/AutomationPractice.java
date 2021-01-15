package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractice {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		driver.findElement(By.name("firstname")).sendKeys("Pammi");
		driver.findElement(By.id("lastname")).sendKeys("Rani");
		
		//select radio button for category
		List<WebElement> radio=driver.findElements(By.name("sex"));
		System.out.println(radio.size());
		
		boolean bvalue=false;
		
		bvalue=radio.get(0).isSelected();
		
		if(bvalue==true)
		{
			radio.get(1).click();
		}
		
		else
		{
			radio.get(0).click();
		}
	
		Thread.sleep(4000);
		
	    //select radio button for year of experience
		/*List<WebElement> radyr=driver.findElements(By.name("exp"));
		System.out.println(radyr.size());

		int isize=radyr.size();
		
		for(int i=0;i<isize;i++)
		{
			String svalue=radyr.get(i).getAttribute("value");
			
			if(svalue.equals("3"))
			{
				System.out.println("number is 3");
				
				Thread.sleep(3000);
				radyr.get(i).click();
				break;
			}
		}*/
		
		//select radio button for profession
		/*List<WebElement> check_prof=driver.findElements(By.name("profession"));
		int psize=check_prof.size();
		
		for(int i=0;i<psize;i++)
		{
			String pvalue=check_prof.get(i).getAttribute("value");
			
			if(pvalue.equalsIgnoreCase("Automation Tester"))
			{
				Thread.sleep(5000);
				check_prof.get(i).click();
				break;
			}
		}*/
		
		/*List<WebElement> chkBx_Profession = driver.findElements(By.name("profession"));
		 
		 // This will tell you the number of Check Boxes are present
		 int iSize = chkBx_Profession.size();
		 
		 // Start the loop from first Check Box to last Check Boxe
		 for(int i=0; i < iSize ; i++ ){
		 // Store the Check Box name to the string variable, using 'Value' attribute
		 String sValue = chkBx_Profession.get(i).getAttribute("value");
		 
		 // Select the Check Box it the value of the Check Box is same what you are looking for
		 if (sValue.equalsIgnoreCase("Automation Tester")){
			 
			 Thread.sleep(4000);
		 chkBx_Profession.get(i).click();
		 // This will take the execution out of for loop
		 break;
		 }
		 }*/
		 
		 //select drop down list for Continentsand print all options
		 Select  element=new Select(driver.findElement(By.id("continents")));
		 
         element.selectByVisibleText("Europe");
		 
		 Thread.sleep(2000);
		 element.selectByIndex(2);
		  
		 List<WebElement> elementcount=element.getOptions();
		 System.out.println(elementcount.size());
		 
		 int isize=elementcount.size();
		 
		 for(int i=0;i<isize;i++)
		 {
			 String svalue=elementcount.get(i).getText();
			 System.out.println(svalue);
			 
			 if(svalue.equalsIgnoreCase("South America"))
			 {
				 Thread.sleep(2000);
				 element.selectByIndex(i);
				 break;
			 }
		 }
		 
		 
		 //select Multiple selection box
		 Select Multielement=new Select(driver.findElement(By.name("selenium_commands")));
		 
		 Multielement.selectByVisibleText("Browser Commands");
		 Thread.sleep(2000);
		 Multielement.deselectByIndex(0);
		 
		 
		 Thread.sleep(2000);
		 Multielement.selectByIndex(2);
		 Thread.sleep(2000);
		 Multielement.deselectByVisibleText("Switch Commands");
		 
		
		 System.out.println("====Multiple Selenium Commands======");
		 
		 List<WebElement> getMulticount=Multielement.getOptions();
		 int isizeMulti=getMulticount.size();
		 
		 for(int i=0;i<isizeMulti;i++)
		 {
			 String smultivalue=getMulticount.get(i).getText();
			 System.out.println(smultivalue);
			 
			 //select  all value of Multiple element
			 Multielement.selectByIndex(i);
		 }
		 
		 //deselect all value of multiple element
		 Thread.sleep(2000);
		 Multielement.deselectAll();
	}

}
