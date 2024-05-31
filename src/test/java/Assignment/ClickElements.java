package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ClickElements  extends BaseClassforDws{
	
	@Test
	public void Click() throws InterruptedException {
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,7000)");
		
		Thread.sleep(2000);
		
		List<WebElement> target = driver.findElements(By.cssSelector("a[target='_blank']"));
		
		for (WebElement web : target) {
			
			web.click();
			
			Thread.sleep(2000);
			
		}
	}

}
