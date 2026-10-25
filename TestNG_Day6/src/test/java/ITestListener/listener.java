package ITestListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		String testCaseName = result.getMethod().getMethodName();
		System.out.println(testCaseName + " Test Case has Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		String suiteName = context.getSuite().getName();
		System.out.println(suiteName + " Suite is started");
		
		
		ExtentReports extentReports = new ExtentReports();
		
		ExtentSparkReporter reporter = new ExtentSparkReporter("destination location in HTML Format");
		
		
		extentReports.attachReporter(reporter);

	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
