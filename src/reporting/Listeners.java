package reporting;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners extends TestListenerAdapter {
	
	public ExtentHtmlReporter htmlReporter; //representing the template
	public ExtentReports extent; //send the user information like localhost/qa env/who run the testcases
	public ExtentTest logger; //status of the testcase like pass/fail/skip
	
	//these above object  will initiated onStart methods
	
	public void onStart(ITestContext tr) //this method automatically invoke when test is started
	{
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/myReport.html"); //name of the report i.e myReport
		htmlReporter.loadConfig(System.getProperty("user.dir")+ "/extent-config.xml");
		
		extent=new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Host name", "localhost");
		extent.setSystemInfo("Environemnt", "QA");
		extent.setSystemInfo("user", "Pammi");
		extent.setSystemInfo("browser", "Chrome");
		extent.setSystemInfo("os", "windows");
		
		htmlReporter.config().setDocumentTitle("Automation Report"); //title of report
		htmlReporter.config().setReportName("Functional Test Report"); //name of report
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP); //location of report
		htmlReporter.config().setTheme(Theme.DARK);
		
	}	
	
	public void onTestSuccess(ITestResult tr)
	{
		logger=extent.createTest(tr.getName()); //create new  test(entry)in the report and tr.getname is name if the testcase
		logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN )); //send passed information to the report with green color highlighted
		
	}
	
	public void onTestFailure(ITestResult tr)
	{
		logger=extent.createTest(tr.getName());
		logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED ));
		
		String screenshot=System.getProperty("user-dir")+ "/screenshot/"+ tr.getName()+ ".png";
		try
		{
			logger.fail("Screenshot is below:" +logger.addScreenCaptureFromPath(screenshot));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult tr)
	{
		logger=extent.createTest(tr.getName());
		logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE ));
	}
	
    public void onFinish(ITestContext tr)
    {
    	extent.flush();
    }
}
