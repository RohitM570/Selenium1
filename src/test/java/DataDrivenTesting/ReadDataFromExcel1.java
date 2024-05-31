package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcel1 {

	@Test
	public void readData1() throws IOException {
		
		File path = new File("E:\\Q-Spiders\\Selenium\\LoginCredential.xlsx");
		//To connect to data
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		String s1 = sheet.getRow(0).getCell(0).toString();
		String s2 = sheet.getRow(1).getCell(0).toString();
		String s3 = sheet.getRow(2).getCell(0).toString();
		String s4 = sheet.getRow(3).getCell(0).toString();
		String s5 = sheet.getRow(4).getCell(0).toString();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
	}

