package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteDataToExcel1 {

	@Test
	public void dataToExcel() throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("‪E:\\Q-Spiders\\Selenium\\AdddatatoExcel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.createCell(0);	
		cell.setCellType(CellType.STRING);
		cell.setCellValue("Sheet1");
		FileOutputStream fos = new FileOutputStream("‪‪E:\\Q-Spiders\\Selenium\\AdddatatoExcel.xlsx");
		wb.write(fos);
		wb.close();
	}
}
