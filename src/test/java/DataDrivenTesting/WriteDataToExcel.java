package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteDataToExcel {
    @Test
	public void dataToExcel() throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("E:\\Q-Spiders\\Selenium\\AdddatatoExcel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.createCell(2);
		cell.setCellType(CellType.STRING);
		cell.setCellValue("Rohit");
		FileOutputStream fos =new FileOutputStream("E:\\Q-Spiders\\Selenium\\AdddatatoExcel.xlsx");
		wb.write(fos);
		wb.close();
		)
	}
}
