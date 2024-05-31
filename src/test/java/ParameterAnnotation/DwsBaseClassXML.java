package ParameterAnnotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DwsBaseClassXML {
	
		public WebDriver driver;
	
		@BeforeSuite
		public void beforeSuite() {
			System.out.println("Connecting to data base");
		}
		
		@BeforeTest
		public void beforeTest() {
			System.out.println("precondition for test runner");
		}
		@Parameters("Url")
		@BeforeClass
		public void beforeClass(String Url) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//implicite wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			//enter into DWS page
			driver.get(Url);
		}
		@Parameters({"email","password"})
		@BeforeMethod
		public void beforeMethod() {
			driver.findElement(By.xpath("//a[text()='Log in']")).click();
			driver.findElement(By.id("Email")).sendKeys("email");
			driver.findElement(By.id("Password")).sendKeys("password");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
		}
		@AfterMethod
		public void afterMethod() {
			driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		}
		@AfterClass
		public void afterClass() {
			driver.close();
		}
		@AfterTest
		public void afterTest() {
			System.out.println("post condition for test Runner");
		}
		@AfterSuite
		public void afterSuite() {
			System.out.println("To Disconnect from the DataBase");
		}

	}

