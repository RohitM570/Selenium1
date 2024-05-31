package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GiftDws extends BaseClassforDws {
	@Test
	public void addToCart() throws InterruptedException {
	
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')][1]")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		
		
		driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys(RecipientName);
		
		Thread.sleep(2000);
		driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys(RecipientEmail);
		Thread.sleep(2000);
		driver.findElement(By.id("giftcard_1_SenderName")).sendKeys(SenderEmail);
		Thread.sleep(2000);
		driver.findElement(By.id("giftcard_1_SenderEmail")).sendKeys(SenderName);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='qty-input']")).sendKeys("5");
		Thread.sleep(2000);
		
		driver.findElement(By.id("add-to-cart-button-1")).click();
	}

}