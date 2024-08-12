package GenericUtilities;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplimantation implements ITestListener {
	
	ExtentReports report;
	ExtentTest test;
	public static ExtentTest stest;
	
	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter spark=new ExtentSparkReporter("./ExtentReports/report.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Extent Report");
		spark.config().setReportName("Vtiger_CMR");
		
		report =new ExtentReports();
		report.attachReporter(spark);
		
		report.setSystemInfo("OS", System.getProperty("os.name"));
		report.setSystemInfo("OS Version", System.getProperty("os.version"));
		report.setSystemInfo("JDK Version", System.getProperty("java.specification.version"));
		report.setSystemInfo("Author", System.getProperty("user.name"));
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		org.openqa.selenium.Capabilities cap=((RemoteWebDriver)BaseClass.sdriver).getCapabilities();
		
		report.setSystemInfo("Browser:", cap.getBrowserName());
		report.setSystemInfo("Browser Version:", cap.getBrowserVersion());
		
		test=report.createTest(result.getMethod().getMethodName());
		stest=test;
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		test.pass(result.getMethod().getMethodName()+"PASS");
	}
	@Override
	public void onTestFailure(ITestResult result) {
	test.fail(result.getMethod().getMethodName()+"Fail");
	test.fail(result.getThrowable());
	test.addScreenCaptureFromPath(new WebDriverUtility()
									.getScreenshot(BaseClass.sdriver,result.getMethod().getMethodName(),BaseClass.sjutil));
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		test.skip(result.getMethod().getMethodName()+"Skipped");
		test.skip(result.getThrowable());
	}
	
	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}