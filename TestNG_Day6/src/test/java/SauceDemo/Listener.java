package SauceDemo;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listener implements ITestListener {

    ExtentReports extentReport;
    ExtentSparkReporter report;
    ExtentTest test;

    @Override
    public void onStart(ITestContext context) {

        String suiteName = context.getSuite().getName();

        //System.out.println(suiteName + " Suite is started");

        // Specify the location of the Extent Report
        report = new ExtentSparkReporter(
                System.getProperty("user.dir") + "/reports/sauceDemo.html");

        // Create ExtentReports object
        extentReport = new ExtentReports();

        // Attach the reporter to ExtentReports
        extentReport.attachReporter(report);
    }

    @Override
    public void onTestStart(ITestResult result) {

        String testName = result.getMethod().getMethodName();

        //System.out.println(testName + " Test Case Has Started");

        // Create a report entry for this test
        test = extentReport.createTest(testName);

        // Log the starting status
        test.info("Test execution started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        String testName = result.getMethod().getMethodName();

        //System.out.println(testName + " Test Case Passed");

        // Mark the test as passed in the report
        test.pass("Test Case Passed Successfully");
        
        test.log(Status.PASS, "Test case pass name is " + testName);
        
        try {
			String destinationPath = sauceDemo.captureScreenshot();
			
			// add same screenshot in reports
			test.addScreenCaptureFromPath(destinationPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Override
    public void onTestFailure(ITestResult result) {

        String testName = result.getMethod().getMethodName();

        //System.out.println(testName + " Test Case Failed");

        // Mark the test as failed and display the error
        test.fail(result.getThrowable());
        
        test.log(Status.FAIL, "Test case fail name is " + testName);
        
        try {
        	String destinationPath = sauceDemo.captureScreenshot();
        	
        	// add same screenshot in reports
        	test.addScreenCaptureFromPath(destinationPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        String testName = result.getMethod().getMethodName();

        //System.out.println(testName + " Test Case Skipped");

        // Mark the test as skipped in the report
        test.skip("Test Case Was Skipped");
        
        test.log(Status.SKIP, "Test Case Skip name is " + testName);
        
        try {
        	String destinationPath = sauceDemo.captureScreenshot();
        	
        	// add same screenshot in reports
        	test.addScreenCaptureFromPath(destinationPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Override
    public void onFinish(ITestContext context) {

        String suiteName = context.getSuite().getName();

        //System.out.println(suiteName + " Suite is Finished");

        // Generate and save the Extent Report
        extentReport.flush();
    }
}