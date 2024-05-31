package Screenshot;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClassDws;
import com.crm.pom.DwsLoginPage;

@Listeners(com.crm.ListenersCode.CaptureFailedScreenShot.class)
public class CaptureScreenShotonFailed extends BaseClassDws {

	@Test
	public void dwsLoginCorrect() {
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		DwsLoginPage dws = new DwsLoginPage(driver);
		dws.username("admin01@gmail.com");
		dws.password("admin01");
		dws.login_button();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	
	@Test
	public void dwsLoginwrong() {
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		DwsLoginPage dws = new DwsLoginPage(driver);
		dws.username("admin01@gmail.com");
		dws.password("admin02");
		dws.login_button();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();

	}
	
	@Test
	public void redBus() {
		driver.get("https://www.redbus.in/");
		assertEquals("mani", "manu");
		
	}
}
