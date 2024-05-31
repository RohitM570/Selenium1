package TestNGFashion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Amazon {
    @Parameters("url")
	@Test(groups = "smoke")
	public void Flipkart(String url) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("url");
		Thread.sleep(2000);
		driver.close();
	}
}