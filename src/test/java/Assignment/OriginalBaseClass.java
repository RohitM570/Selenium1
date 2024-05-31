package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class OriginalBaseClass {
    public WebDriver driver;
    
    @BeforeSuite
    public void beforeSuite() {
    	System.out.println("data base connectivity");
    }
    
    @BeforeTest
    public void beforeTest() {
    	System.out.println("precondition of data runner");
    }
    
    @BeforeClass
    public void beforeClass() {
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.get("https://demowebshop.tricentis.com/");
    	
    }
    
    @BeforeMethod
    public void beforeMethod() {
    	 driver.findElement(By.className("ico-login")).click();
         driver.findElement(By.id("Email")).sendKeys("rohitmahabale2000@gmail.com");
         driver.findElement(By.id("Password")).sendKeys("rohit@m");
         driver.findElement(By.xpath("//input[@value='Log in']")).click();
    }
    
    @AfterClass
    public void logout() {
    	driver.findElement(By.xpath("//a[text()='Log out']")).click();
    }
    
    @AfterTest
    public void closeBrowser() {
    	if (driver != null) {
			driver.quit();
		}
    }
    
    @AfterSuite
    public void disconnectDataBase() {
    	System.out.println("disconnect Data Base");
    }
}
