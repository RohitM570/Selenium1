package Assertion;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertNull {

	@Test
	public void hardAssert() {
		
		String expected_result = "https://demowebshop.tricentis.com/";
		String a=null;
		String b=null;
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		
		//Waiting Condition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Enter Dws Url
		driver.get("https://demowebshop.tricentis.com/");
		String actual_result = driver.getCurrentUrl();
		AssertNull(a);
		driver.findElement(By.id("small-searchterms")).sendKeys("Satya");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}

	private void AssertNull(String a) {
		// TODO Auto-generated method stub
		
	}
}
