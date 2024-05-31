package Listerners;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NetWorkFailure {

	@Test(retryAnalyzer = com.crm.ListenersCode.NetworkRetry.class)
	public void main() {
		WebDriver driver = new ChromeDriver();
		assertEquals("Joey", "Joey");
	}
}
