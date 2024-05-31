package Listerners;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.ListenersCode.BaseClass;
import com.crm.ListenersCode.BaseClassForDws;



public class TestClass extends BaseClass{

	@Test
	public void addToCart() throws InterruptedException 
	{
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		List<WebElement> add = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for (WebElement web : add) {
			web.click();
			Thread.sleep(2000);
		}

	}

	@Test
	public void giftCart() throws InterruptedException 
	{

		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
		List<WebElement> add = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		int i=0;
		for (WebElement web : add) 
		{
			web.click();
			String name = sheet.getRow(i).getCell(0).toString();
			String email = sheet.getRow(i).getCell(1).toString();
			i++;
			driver.findElement(By.className("recipient-name")).sendKeys(name);
			try 
			{
				driver.findElement(By.className("recipient-email")).sendKeys(email);
			}
			catch (Exception e) 
			{
				System.out.println("recipient-email is not displayed");
			}

			driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
		}

	}
	

