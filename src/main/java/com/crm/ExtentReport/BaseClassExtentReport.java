package com.crm.ExtentReport;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseClassExtentReport {
	public  WebDriver driver;

	

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("wecomepage");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("thanks for comming");
	}

	@AfterClass
	public void afterclass() {
		driver.quit();
	}

	

}