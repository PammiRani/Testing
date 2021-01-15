package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement_Action {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		/*driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		/*Thread.sleep(3000);
		WebElement admin=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]"));
		WebElement usermgnt=driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
		WebElement user=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(admin).moveToElement(usermgnt).moveToElement(user).click().build().perform();*/
		
		//===================================================================//
		/*Thread.sleep(5000);
		
		WebElement time=driver.findElement(By.id("menu_time_viewTimeModule"));
		WebElement reports=driver.findElement(By.id("menu_time_Reports"));
		WebElement employee_report=driver.findElement(By.id("menu_time_displayEmployeeReportCriteria"));
		
		Actions acts=new Actions(driver);
		
		acts.moveToElement(time).moveToElement(reports).moveToElement(employee_report).click().build().perform();*/
		
		//======================================================================//
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement switchs=driver.findElement(By.linkText("SwitchTo"));
		System.out.println("verify the switch action");
		
		Thread.sleep(3000);
		WebElement alert=driver.findElement(By.linkText("Alerts"));
		
		Actions move=new Actions(driver);
		
		move.moveToElement(switchs).moveToElement(alert).click().build().perform();
		
	}

}
