package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Abc {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver", "/home/cavisson/eclipse-workspace/geckodriver");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
	}

}
