package TestNG;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ShopperStack extends ShopperStackBaseClass {

	@Test
	public void Shopper() throws InterruptedException {
		
		driver.findElement(By.id("men")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='T-shirts']")).click();
		Thread.sleep(2000);
		List<WebElement> products = driver.findElements(By.xpath("//button[text()='add to cart'])"));
		for(WebElement web : products) {
			web.click();
		}
	}
}
