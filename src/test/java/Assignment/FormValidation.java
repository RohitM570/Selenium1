package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FormValidation {

	public WebDriver driver;
	@BeforeTest
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@BeforeMethod
	public void launchUrl() {
		
	    driver.get("https://demoapps.qspiders.com/");
	    driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	    driver.findElement(By.xpath("//section[text()='FormValidation']")).click();
	}
	
	@Test
	public void formValidation() {
		
		driver.findElement(By.name("requiredfield")).sendKeys("RohitMahabale");
		driver.findElement(By.name("minLength")).sendKeys("RohitM");
		driver.findElement(By.name("password")).sendKeys("Rohit0209");
		driver.findElement(By.name("confirmpass")).sendKeys("Rohit0209");
		driver.findElement(By.name("rangeLength")).sendKeys("RohitM");
		driver.findElement(By.name("email")).sendKeys("rohitmahabale2000@gmail.com");
	}
}
