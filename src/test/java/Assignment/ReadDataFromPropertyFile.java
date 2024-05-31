package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataFromPropertyFile {

	@Test
	public void readData() throws IOException, InterruptedException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Q-Spiders\\Selenium\\com.crm.advanceselenium\\ConfigFile\\Vtigercrm.properties");
		prop.load(fis);
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.name("user_name")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("user_password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();
		
		
		
	}
	
}
