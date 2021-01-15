package TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.*;


@Listeners(CustomListner.class)
public class ScreenshotTest extends BaseClass {
	
	
	@BeforeMethod
	public void setup() {
		initialization();
	
	}
	
	
	@AfterMethod
	public void teardown() {
	driver.quit();
	}
	
	
	@Test
	public 	void logintestscreenshot() {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void searchtakescreenshot() {
		Assert.assertEquals(true, false);
	}
	
	

}
