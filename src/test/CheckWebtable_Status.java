package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckWebtable_Status {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
        driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(3000);
		WebElement admin=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]"));
		WebElement usermgnt=driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
		WebElement user=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(admin).moveToElement(usermgnt).moveToElement(user).click().build().perform();
		
		//==============================================//
		
		//*[@id="resultTable"]/tbody/tr[1]/td[2]/a
		//*[@id="resultTable"]/tbody/tr[2]/td[2]/a
		//*[@id="resultTable"]/tbody/tr[1]/td[5]
		
		String beforexpath="//*[@id=\"resultTable\"]/tbody/tr[";
		String afterxpath="]/td[5]";
		
		int rows=driver.findElements(By.xpath("//table[@id=\"resultTable\"]/tbody/tr")).size();
		System.out.println("number of rows are"+ " " +rows);
		
		int count=0;
		for(int i=1;i<rows;i++)
		{
			String actualxpath=beforexpath + i + afterxpath;
			//Thread.sleep(3000);
			//WebElement value=driver.findElement(By.xpath(actualxpath));
			String value=driver.findElement(By.xpath(actualxpath)).getText();
					
			//System.out.println(value.getText());
			
			if(value.equals("Enabled"))
			{
				count++;
			}
			
		}
		
		
		System.out.println("numebr of enabled employees are:" + count);
	}

}
