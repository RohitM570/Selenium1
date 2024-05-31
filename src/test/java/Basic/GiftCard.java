package Basic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GiftCard extends DemoWebShop {

	@Test
	public void giftCard() {
		
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
		driver.findElement(By.xpath("//img[@title='Show details for $5 Virtual Gift Card']")).click();
		driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys("Rohit");
		driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys("rohitmahabale@gmail.com");
		driver.findElement(By.id("giftcard_1_Message")).sendKeys("Gift with full of Love");
		driver.findElement(By.id("add-to-cart-button-1")).click();
		
	}
}
