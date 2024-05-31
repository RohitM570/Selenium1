package ParameterAnnotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ShopperStack {
    @Parameters({"url","username","password"})
	@Test
	public void shopperLogin(String url,String username,String password) throws InterruptedException {
		
		//Open the Browser
		WebDriver driver = new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//waiting condition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
		WebElement Loginbutton = driver.findElement(By.id("loginBtn"));
		if(Loginbutton.isEnabled()) {
			Loginbutton.click();
			driver.findElement(By.id("Email")).sendKeys(username);
			Thread.sleep(2000);
			driver.findElement(By.id("Password")).sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Login']")).click();
		}
		else {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0],click();", Loginbutton);
			
			
		}
		
		
	}
    
}
