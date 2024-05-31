package com.crm.ListenersCode;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.crm.BaseClass.BaseClassDws;
import com.crm.ExtentReport.BaseClassExtentReport;

public class CaptureFailedScreenShot extends BaseClassExtentReport implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		LocalDateTime date = LocalDateTime.now();
		String time = date.toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to=new File("./Screenshot/dws"+time+".png");
		try {
			FileHandler.copy(from, to);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
