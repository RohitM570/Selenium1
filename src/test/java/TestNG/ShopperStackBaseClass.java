package TestNG;

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
import org.testng.annotations.Test;

public class ShopperStackBaseClass {

        WebDriver driver;
        
		@BeforeSuite
		public void beforeSuite() {
			System.out.println("Connect to data Base");
			
	}
		
		@BeforeTest
		public void beforeTest() {
			System.out.println("Pre Condition for test Runner");
		}
		
		@BeforeClass
		public void beforeClass() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
		
		@BeforeMethod
		public void beforeMethod() throws InterruptedException {
			driver.get("https://www.shoppersstack.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			driver.findElement(By.id("Email")).sendKeys("rohitmahabale2000@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("RohitM@99");
			driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[1]")).click();
			}
		
		@AfterMethod
		public void afterMethod() {
			System.out.println("Post Method Action");
		}
		
		@AfterClass
		public void afterClass() throws InterruptedException {
//			Thread.sleep(2000);
//   		driver.close();
		}
		
		@AfterTest
		public void afterTest() {
			System.out.println("Post Condition for test Runner");
		}
		
		@AfterSuite
		public void afterSuite() {
			System.out.println("To Disconnect from the DataBase");
		}
}
