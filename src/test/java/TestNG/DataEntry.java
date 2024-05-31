package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataEntry extends FBBaseClass {
    @Parameters({"url","name","surname"})
	@Test
	public void data(String url,String name,String surname) {
		driver.findElement(By.name("firstname")).sendKeys(name);
		driver.findElement(By.name("lastname")).sendKeys(surname);
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s = new Select(month);
		s.selectByVisibleText("Nov");
		
	}
}
