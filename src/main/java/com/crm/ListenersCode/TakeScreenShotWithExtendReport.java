package com.crm.ListenersCode;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crm.ExtentReport.BaseClassExtentReport;

public class TakeScreenShotWithExtendReport extends BaseClassExtentReport implements ITestListener {
	public ExtentReports report;
    public ExtentSparkReporter spark;
    public ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
	String name = result.getMethod().getMethodName();
	test = report.createTest(name);
	test.log(Status.INFO, "welcome to our class...");
	test.log(Status.INFO, "my wonderful fellows.......");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "your testCase has passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
	  test.log(Status.FAIL, "Your testCase has Failed");
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  String from = ts.getScreenshotAs(OutputType.BASE64);
	  test.addScreenCaptureFromBase64String(from);
	  
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Your testCase has Skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		File path = new File("./ExtentReport/Capture.html");
		spark = new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("mujhe nahi pata.....");
		spark.config().setReportName("Vaibhavi");
		spark.config().setTheme(Theme.STANDARD);
		report = new ExtentReports();
		report.setSystemInfo("OS", "Window-10");
		report.setSystemInfo("Browser", "Chrome");
		report.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
