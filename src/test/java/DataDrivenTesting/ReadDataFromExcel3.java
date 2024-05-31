package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcel3 {

	@Test
	public void readData1() throws IOException {
		
		File path = new File("E:\\Q-Spiders\\Selenium\\LoginCredentials.xlsx");
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int row = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				String s = sheet.getRow(i).getCell(j).toString();
				System.out.println(s);
				
			}
			
		}
	    
	    	}
	    
	    
	}
     

