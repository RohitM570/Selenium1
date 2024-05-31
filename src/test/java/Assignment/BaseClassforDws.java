package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClassforDws {
    public WebDriver driver;
    String url;
    String email;
    String pass;
    Sheet sheet;
    String RecipientName;
    String RecipientEmail;
    String SenderName;
    String SenderEmail;
    

    @BeforeSuite
    public void beforeSuite() throws IOException {
        FileInputStream fis = new FileInputStream("E:\\Q-Spiders\\Selenium\\DWSGift.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        sheet = wb.getSheet("rohit");
        if (sheet == null) {
            throw new RuntimeException("Sheet 'rohit' not found in the Excel file");
        }
        fis.close();
    }

    @BeforeTest
    public void beforeTest() {
        url = sheet.getRow(0).getCell(1).getStringCellValue();
        email = sheet.getRow(1).getCell(1).getStringCellValue();
        pass = sheet.getRow(2).getCell(1).getStringCellValue();
        RecipientName = sheet.getRow(3).getCell(1).getStringCellValue();
        RecipientEmail = sheet.getRow(4).getCell(1).getStringCellValue();
        SenderName = sheet.getRow(5).getCell(1).getStringCellValue();
        SenderEmail = sheet.getRow(6).getCell(1).getStringCellValue();
    }

    @BeforeClass
    public void beforeClass() {
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(url);
    }

    @BeforeMethod
    public void login() {
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(pass);
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
    }

    @AfterClass
    public void logout() {
        driver.findElement(By.xpath("//a[text()='Log out']")).click();
    }

    @AfterTest
    public void closeBrowser() {
        if (driver != null) {
           // driver.quit();
        }
    }

    @AfterSuite
    public void disconnectDatabase() {
        System.out.println("disconnect Data Base");
    }
}