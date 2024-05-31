package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SearchField extends DemoWebShop {

	@Test
	public void searchField() {
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobile",Keys.ENTER);
	}
}
