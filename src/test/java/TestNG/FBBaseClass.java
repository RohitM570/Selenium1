package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class FBBaseClass {
     public WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("connect to database");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("precondition for data runner");
	}
	
	@Parameters("url")
	@BeforeClass
	public void beforeClass(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//It is used wait until the elements gets appear on webpage
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
	}
	
	@AfterClass
	public void afterClass() {
		driver.findElement(By.id("u_0_s_N5")).click();
	}
	
	@AfterTest
	public void closeBrowser() {
		if (driver!=null) {
			driver.quit();
			
		}
	}
	
	@AfterSuite
	public void disconnectDataBase() {
		System.out.println("Disconnect Data Base");
	}
}
