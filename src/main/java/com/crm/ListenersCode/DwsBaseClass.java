package com.crm.ListenersCode;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.crm.ReadDataFromExternal.ReadDataUtility;
import com.crm.data_from_external_file.ExternalData;

public class DwsBaseClass {
	public WebDriver driver;
	String url;
	String username;
	String password;
	properties prop;
	File file;
	FileInputStream fis;
	public String urlMethod;
	Sheet sheet;
	public String name;
	public String remail;
	public String mname;
	public String memail;
	public String message;
	
	@BeforeSuite
	public void ReadPropertyData() throws IOException 
	{
		//Externally reading Data from property file
		url = ReadDataUtility.ReadPropertyData("url");
		username = ReadDataUtility.ReadPropertyData("username");
		password = ReadDataUtility.ReadPropertyData("password");
		
		//Externally reading Data from Excel File
		rname = ReadDataFromExcel.readDataExcel(0,1);
		remail = ReadDataFromExcel.readDataExcel(1,1);
		mname = ReadDataFromExcel.readDataExcel(2,1);
		memail = ReadDataFromExcel.readDataExcel(3,1);
		message = ReadDataFromExcel.readDataExcel(4,1);
	}

	@BeforeTest
	public void preTest() 
	{
		System.out.println("precondition for test runner");
	}
	@BeforeClass
	public void launchUrl()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.className("ico-logout")).click();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
	@AfterTest
	public void postTestRunner() {
		System.out.println("post condition for test runner");
	}
	
	@AfterSuite
	public void DataBaseDisconnect() {
		System.out.println("Data Base Diconnected");
	}
	
	
}