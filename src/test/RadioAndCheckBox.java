package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioAndCheckBox {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Pammi");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Rani");
		
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("noida");
		
		//================select radio button==================//
		List<WebElement> radiobutton=driver.findElements(By.name("radiooptions"));
		
		//boolean value=false;
		System.out.println("the size of radio button is:"+radiobutton.size());
		
		boolean value=radiobutton.get(0).isSelected();
		boolean valueen=radiobutton.get(0).isEnabled();
		
		System.out.println(value);
		System.out.println(valueen);
		
		if(value==true)
		{
			radiobutton.get(1).click();
		}
		else
		{
			radiobutton.get(0).click();
		}
		
		//=============select check box======================//
		
		List<WebElement> check=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		int size=check.size();
		
		System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
			String element=check.get(i).getAttribute("value");
			System.out.println(element);
			
			if(element.equalsIgnoreCase("Movies"))
			{
				check.get(i).click();
				break;
			}
			
		}
		
		//==========select drop down list to select skills====================//
		
		System.out.println("========the number of skills are=====");
		Select drp=new Select(driver.findElement(By.xpath("//select[@id=\"Skills\"]")));
		
		int isize=drp.getOptions().size();
		
		System.out.println("number of skill are"+ " " +isize);
		
		for(int i=0;i<isize;i++)
		{
			String ivalue=drp.getOptions().get(i).getText();
			System.out.println(ivalue);
			
			if(ivalue.equalsIgnoreCase("Troubleshooting"))
			{
				drp.selectByIndex(i);
				break;
			}
		}
		
		
		//===========select  drop down to select countries================//
		
		System.out.println("===number of countries are====");
		Select countrydrp=new Select(driver.findElement(By.xpath("//select[@id=\"countries\"]")));
		
		int csize=countrydrp.getOptions().size();
		System.out.println("he number of countries are" + " " + csize);
		
		for(int i=0;i<csize;i++)
		{
			String cvalues=countrydrp.getOptions().get(i).getText();
			System.out.println(cvalues);
			
			if(cvalues.equalsIgnoreCase("Albania"))
			{
				countrydrp.selectByIndex(i);
				break;
			}
		}
		
		//=================select  country ====================//
		
		System.out.println("==number of country are===");
		Select scvalue=new Select(driver.findElement(By.xpath("//select[@class=\"select2-hidden-accessible\"]")));
		int scsize=scvalue.getOptions().size();
		
		System.out.println("number of country are"+ " " +scsize);
		
		for(int i=0;i<scsize;i++)
		{
			String element=scvalue.getOptions().get(i).getText();
			System.out.println(element);
			
			if(element.equalsIgnoreCase("Netherlands"))
			{
				scvalue.selectByIndex(i);
				break;
			}
			
		}
	}

}
