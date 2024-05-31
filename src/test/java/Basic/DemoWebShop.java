package Basic;

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

public class DemoWebShop {
     public WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Connection code");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void openBrowser() {
		
		//open Browser
		driver = new ChromeDriver();
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Waiting Condition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Enter Url
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@BeforeMethod
	public void login() {
		
		//Click on login button
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@AfterMethod
	public void logout() {
		
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	
	@AfterClass
	public void closeBrowser() {
		
		driver.close();
	}
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("Connection Close");
	}
}
