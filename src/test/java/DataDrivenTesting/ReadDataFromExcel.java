package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcel {

	@Test
	public void readData() throws IOException {
		
		File path = new File("E:\\Q-Spiders\\Selenium\\Input.xlsx");
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		String gmail = sheet.getRow(0).getCell(0).toString();
		System.out.println("dws login mail id :"+gmail);
	}
}

//0,0 0,1
//0,1 1,1
